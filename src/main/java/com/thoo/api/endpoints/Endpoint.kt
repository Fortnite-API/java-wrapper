package com.thoo.api.endpoints

import retrofit2.Retrofit

abstract class Endpoint<T>(
        retrofit: Retrofit,
        clazz: Class<T>
) {

    protected val service: T = retrofit.create(clazz)

}