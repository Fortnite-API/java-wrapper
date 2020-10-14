package com.thoo.api.utils

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.thoo.api.exceptions.FortniteApiException
import com.thoo.api.models.BaseModel
import com.thoo.api.models.ExceptionModel
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Call
import retrofit2.Response
import java.io.BufferedInputStream
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import kotlin.jvm.Throws

typealias FCall<T> = Call<BaseModel<T>>

val gson = Gson()

@Throws(FortniteApiException::class)
internal inline fun <reified T> Call<BaseModel<T>>.send(): BaseModel<T> {
    val response = this.execute()
    if(!response.isSuccessful) throw response.parseApiError()
    return response.body()!!
}

@Throws(FortniteApiException::class)
internal inline fun <reified T> Request.sendOkHttp(client: OkHttpClient): T {
    val response = client.newCall(this).execute()
    if(!response.isSuccessful) {
        val model = gson.fromJson<ExceptionModel>(response.body()?.string() ?: "{}")
        val error = FortniteApiException(model.status, model.error)
        throw error
    }
    return gson.fromJson(response.body()?.string() ?: "{}")
}

internal inline fun <reified T> Gson.fromJson(json: String) =
        fromJson<T>(json, object: TypeToken<T>() {}.type)

internal fun Response<*>.parseApiError(): FortniteApiException {
    val json = this.errorBody()?.string() ?: "{}"
    return gson.fromJson(json, FortniteApiException::class.java)
}

internal fun download(byteStream: BufferedInputStream, file: File): Int {
    val reader = ByteArray(4096)
    var fileSizeDownloaded = 0
    val output = FileOutputStream(file)
    while(true) {
        val read = byteStream.read(reader)
        if(read == -1) break
        output.write(reader, 0, read)
        fileSizeDownloaded += read
    }
    output.flush()
    byteStream.close()
    output.close()
    return fileSizeDownloaded / (1024 * 1024)
}