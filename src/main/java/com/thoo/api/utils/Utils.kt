package com.thoo.api.utils

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.thoo.api.exceptions.FortniteAPIException
import retrofit2.Call

internal object Utils {

    val gson: Gson = GsonBuilder()
            .setPrettyPrinting()
            .setLenient().create()

}

fun <T> Call<T>.send(): T {
    val response = this.execute()
    val content = response.body()
    if(response.isSuccessful) return content!!
    val errorBody = response.errorBody()?.string()
    val error = Utils.gson.fromJson(errorBody, FortniteAPIException::class.java)
    throw error
}