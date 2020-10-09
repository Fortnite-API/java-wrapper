package com.thoo.api.endpoints

import com.google.gson.Gson
import com.thoo.api.FortniteAPI
import com.thoo.api.enums.Language
import com.thoo.api.models.BaseModel
import com.thoo.api.models.Cosmetic
import com.thoo.api.models.CosmeticSearchProperties
import com.thoo.api.services.CosmeticService
import com.thoo.api.utils.send
import com.thoo.api.utils.sendOkHttp
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit

@SuppressWarnings("unused")
class CosmeticEndpoints(
        retrofit: Retrofit,
        clazz: Class<out CosmeticService>,
        private val language: Language,
        private val httpClient: OkHttpClient
): EndpointBase<CosmeticService>(retrofit, clazz) {

    @JvmOverloads fun getCosmetics(language: Language = this.language) =
            service.getCosmetics(language.code).send()

    @JvmOverloads fun getNewCosmetics(language: Language = this.language) =
            service.getNewCosmetics(language.code).send()

    @JvmOverloads
    fun searchCosmetic(language: Language = this.language, propertiesReceiver: CosmeticSearchProperties.() -> Unit): BaseModel<Cosmetic> {
        val properties = CosmeticSearchProperties()
        propertiesReceiver.invoke(properties)
        val clazz = properties.javaClass
        val queries = hashMapOf<String, Any>()
        clazz.declaredFields.forEach {
            it.isAccessible = true
            val value = it.get(properties) ?: return@forEach
            queries[it.name] = value
        }
        val urlBuilder = HttpUrl.Builder()
                .scheme("https")
                .host("fortnite-api.com")
                .addPathSegments("v2/cosmetics/br/search")
                .addEncodedQueryParameter("language", language.code)
        queries.forEach { (k, v) ->
            urlBuilder.addEncodedQueryParameter(k, v.toString())
        }
        val request = Request.Builder()
                .url(urlBuilder.build())
                .build()
        return request.sendOkHttp(httpClient)
    }

    @JvmOverloads
    fun searchCosmetics(language: Language = this.language, propertiesReceiver: CosmeticSearchProperties.() -> Unit): BaseModel<List<Cosmetic>> {
        val properties = CosmeticSearchProperties()
        propertiesReceiver.invoke(properties)
        val clazz = properties.javaClass
        val queries = hashMapOf<String, Any>()
        clazz.declaredFields.forEach {
            it.isAccessible = true
            val value = it.get(properties) ?: return@forEach
            queries[it.name] = value
        }
        val urlBuilder = HttpUrl.Builder()
                .scheme("https")
                .host("fortnite-api.com")
                .addPathSegments("v2/cosmetics/br/search/all")
                .addEncodedQueryParameter("language", language.code)
        queries.forEach { (k, v) ->
            urlBuilder.addEncodedQueryParameter(k, v.toString())
        }
        val request = Request.Builder()
                .url(urlBuilder.build())
                .build()
        return request.sendOkHttp(httpClient)
    }

}