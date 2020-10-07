package com.thoo.api.endpoints

import com.thoo.api.services.CreatorService
import com.thoo.api.utils.send
import retrofit2.Retrofit

@SuppressWarnings("unused")
class CreatorEndpoints(
        retrofit: Retrofit,
        clazz: Class<out CreatorService>
): EndpointBase<CreatorService>(retrofit, clazz) {

    fun getCreator(name: String) = service.getCreator(name).send()
    fun searchCreator(name: String) = service.searchCreator(name).send()
    fun searchCreators(name: String) = service.searchCreators(name).send()

}