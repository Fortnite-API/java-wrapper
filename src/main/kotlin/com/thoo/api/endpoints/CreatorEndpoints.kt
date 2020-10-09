package com.thoo.api.endpoints

import com.thoo.api.exceptions.FortniteApiException
import com.thoo.api.services.CreatorService
import com.thoo.api.utils.send
import retrofit2.Retrofit
import kotlin.jvm.Throws

@SuppressWarnings("unused")
class CreatorEndpoints(
        retrofit: Retrofit,
        clazz: Class<out CreatorService>
): EndpointBase<CreatorService>(retrofit, clazz) {


    @Throws(FortniteApiException::class) fun getCreator(name: String) = service.getCreator(name).send()
    @Throws(FortniteApiException::class) fun searchCreator(name: String) = service.searchCreator(name).send()
    @Throws(FortniteApiException::class) fun searchCreators(name: String) = service.searchCreators(name).send()

}