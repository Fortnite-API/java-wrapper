package com.thoo.api.retro

import retrofit2.CallAdapter
import retrofit2.Retrofit
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

class ApiCallAdapterFactory: CallAdapter.Factory() {

    override fun get(returnType: Type, annotations: Array<Annotation>, retrofit: Retrofit): CallAdapter<*, *>? {
        check(returnType is ParameterizedType) { "$returnType must be parameterized. Raw types are not supported" }
        val container = getParameterUpperBound(0, returnType)
        check(container is ParameterizedType) { "$container must be parameterized. Raw types are not supported" }
        val successBodyType = getParameterUpperBound(0, container)
        return ApiCallAdapter<Any>(successBodyType)
    }

}