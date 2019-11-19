package com.thoo.api.interceptors

import okhttp3.Interceptor
import okhttp3.Response

class DefaultInterceptor(private val key: String) : Interceptor {

    override fun intercept(chain: Interceptor.Chain?): Response? {
        val request = chain?.request()
        if(key == "null"){
            request?.newBuilder()?.build()
        } else {
            request?.newBuilder()?.addHeader("x-api-key", key)?.build()
        }
        return chain?.proceed(request)
    }

}