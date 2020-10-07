package com.thoo.api.endpoints

import com.thoo.api.enums.Language
import com.thoo.api.models.CosmeticSearchProperties
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

    @JvmOverloads fun getNewCosmetics(language: Language = this.language) =
            service.getNewCosmetics(language.code).send()

    @JvmOverloads
    fun searchCosmetic(language: Language = this.language, propertiesReceiver: CosmeticSearchProperties.() -> Unit) {
        val properties = CosmeticSearchProperties()
        propertiesReceiver.invoke(properties)
        val clazz = properties.javaClass
        clazz.declaredFields.forEach {
            it.isAccessible = true
            val value = it.get(properties) ?: return@forEach
            println(it.name + " : " + value)
        }
    }

}