package com.thoo.api.utils

import com.google.gson.Gson
import com.thoo.api.exceptions.FortniteApiException
import com.thoo.api.models.BaseModel
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Call
import retrofit2.Response
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
internal inline fun <reified T> Request.sendOkHttp(client: OkHttpClient): BaseModel<T> {
    val response = client.newCall(this).execute()
    if(!response.isSuccessful) throw gson.fromJson(response.body()?.string() ?: "{}", FortniteApiException::class.java)
    return gson.fromJson<BaseModel<T>>(response.body()?.string() ?: "{}", BaseModel::class.java)
}

internal fun Response<*>.parseApiError(): FortniteApiException {
    val json = this.errorBody()?.string() ?: "{}"
    return gson.fromJson(json, FortniteApiException::class.java)
}

internal fun download(byteStream: InputStream, file: File): Int {
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