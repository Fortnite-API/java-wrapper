package com.thoo.api.endpoints

import com.thoo.api.enums.Language
import com.thoo.api.services.CosmeticService
import com.thoo.api.utils.send
import retrofit2.Retrofit

class CosmeticEndpoint(retrofit: Retrofit, private val defaultLang: Language) :
        Endpoint<CosmeticService>(retrofit, CosmeticService::class.java) {

    @JvmOverloads fun getCosmetics(language: Language = defaultLang) = service.cosmetics(language.code).send()
    @JvmOverloads fun getCosmeticByID(id: String, language: Language = defaultLang) = service.cosmeticByID(id, language.code).send()
    @JvmOverloads fun getCosmeticsByID(vararg ids: String, language: Language = defaultLang) = service.cosmeticsByID(language.code, *ids).send()

}