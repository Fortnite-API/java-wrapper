package com.thoo.api.endpoints

import com.thoo.api.enums.Language
import com.thoo.api.services.CosmeticService
import com.thoo.api.utils.send
import retrofit2.Retrofit

@SuppressWarnings("unused")
class CosmeticEndpoints(
        retrofit: Retrofit,
        clazz: Class<out CosmeticService>,
        private val language: Language
): EndpointBase<CosmeticService>(retrofit, clazz) {

    @JvmOverloads fun getCosmetics(language: Language = this.language) =
            service.getCosmetics(language.code).send()

}