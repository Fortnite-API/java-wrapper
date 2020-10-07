package com.thoo.api.endpoints

import retrofit2.Retrofit

open class EndpointBase<T>(
    retrofit: Retrofit,
    clazz: Class<out T>,
) {

    val service: T = retrofit.create(clazz)

}