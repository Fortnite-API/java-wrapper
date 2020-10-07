package com.thoo.api.retro

import retrofit2.Call
import retrofit2.CallAdapter
import java.lang.reflect.Type

class ApiCallAdapter<T : Any>(
        private val successType: Type
) : CallAdapter<T, Call<ApiResponse<T>>> {

    override fun responseType(): Type = successType

    override fun adapt(call: Call<T>): Call<ApiResponse<T>> {
        return ApiCall(call)
    }

}