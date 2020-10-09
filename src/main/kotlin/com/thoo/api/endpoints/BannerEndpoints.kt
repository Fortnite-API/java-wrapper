package com.thoo.api.endpoints

import com.thoo.api.enums.Language
import com.thoo.api.exceptions.FortniteApiException
import com.thoo.api.services.BannerService
import com.thoo.api.utils.send
import retrofit2.Retrofit
import kotlin.jvm.Throws

@SuppressWarnings("unused")
class BannerEndpoints(
        retrofit: Retrofit,
        clazz: Class<out BannerService>,
        private val language: Language
): EndpointBase<BannerService>(retrofit, clazz) {

    @Throws(FortniteApiException::class)
    @JvmOverloads fun getBanners(language: Language = this.language) =
            service.getBanners(language.code).send()

    @Throws(FortniteApiException::class)
    fun getBannerColors() = service.getBannerColors().send()

}