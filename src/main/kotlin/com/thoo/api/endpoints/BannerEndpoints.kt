package com.thoo.api.endpoints

import com.thoo.api.enums.Language
import com.thoo.api.services.BannerService
import com.thoo.api.utils.send
import retrofit2.Retrofit

@SuppressWarnings("unused")
class BannerEndpoints(
        retrofit: Retrofit,
        clazz: Class<out BannerService>,
        private val language: Language
): EndpointBase<BannerService>(retrofit, clazz) {

    @JvmOverloads fun getBanners(language: Language = this.language) =
            service.getBanners(language.code).send()

    fun getBannerColors() = service.getBannerColors().send()

}