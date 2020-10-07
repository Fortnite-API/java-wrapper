package com.thoo.api.retro

import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ApiCall<T: Any>(
        private val delegate: Call<T>
): Call<ApiResponse<T>> {

    override fun enqueue(callback: Callback<ApiResponse<T>>) {
        return delegate.enqueue(object: Callback<T> {
            override fun onResponse(call: Call<T>, response: Response<T>) {
                val body = response.body()
                val code = response.code()
                callback.onResponse(this@ApiCall, Response.success(code, ApiResponse.Success(body, code)))
            }

            override fun onFailure(call: Call<T>, t: Throwable) {

            }
        })
    }

    override fun isExecuted() = delegate.isExecuted
    override fun cancel() = delegate.cancel()
    override fun isCanceled(): Boolean = delegate.isCanceled
    override fun request(): Request = delegate.request()
    override fun timeout(): Timeout = delegate.timeout()
    override fun clone() = ApiCall(delegate.clone())

    override fun execute(): Response<ApiResponse<T>> {
        throw UnsupportedOperationException("execute() is not supported")
    }

}