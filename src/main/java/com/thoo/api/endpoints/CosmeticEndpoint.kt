package com.thoo.api.endpoints

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.thoo.api.enums.Language
import com.thoo.api.models.BaseModel
import com.thoo.api.models.Cosmetic
import com.thoo.api.services.CosmeticService
import com.thoo.api.utils.QueryBuilder
import com.thoo.api.utils.send
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit

class CosmeticEndpoint(retrofit: Retrofit, private val client: OkHttpClient, private val defaultLang: Language) :
        Endpoint<CosmeticService>(retrofit, CosmeticService::class.java) {

    private val gson = Gson()

    @JvmOverloads fun getCosmetics(language: Language = defaultLang) = service.cosmetics(language.code).send()
    @JvmOverloads fun getCosmeticByID(id: String, language: Language = defaultLang) = service.cosmeticByID(id, language.code).send()
    @JvmOverloads fun getCosmeticsByID(vararg ids: String, language: Language = defaultLang) = service.cosmeticsByID(language.code, *ids).send()

    @JvmOverloads
    fun searchCosmetic(query: QueryBuilder, language: Language = defaultLang): BaseModel<Cosmetic> {
        var url = "https://fortnite-api.com/v2/cosmetics/br/search"
        var j = 0
        for(i in query::class.java.declaredFields.indices){
            val field = query::class.java.declaredFields[i]
            field.isAccessible = true
            val value = field.get(query)
            if(value != null) {
                url += "${if (j == 0) "?" else "&"}${field.name}=$value"
                j++
            }

        }
        println(url)
        val requestBuilder = Request.Builder().url(url)
        val type = object: TypeToken<BaseModel<Cosmetic>>(){}.type
        return gson.fromJson<BaseModel<Cosmetic>>(client.newCall(requestBuilder.build()).execute().body?.string(), type)
    }

    @JvmOverloads
    fun searchAllCosmetic(query: QueryBuilder, language: Language = defaultLang): BaseModel<Array<Cosmetic>> {
        var url = "https://fortnite-api.com/v2/cosmetics/br/search/all"
        for(field in query::class.java.declaredFields){
            field.isAccessible = true
            val value = field.get(query)
            if(value != null) url += "?${field.name}=$value"
        }
        println(url)
        val requestBuilder = Request.Builder().url(url)
        val type = object: TypeToken<BaseModel<Cosmetic>>(){}.type
        return gson.fromJson<BaseModel<Array<Cosmetic>>>(client.newCall(requestBuilder.build()).execute().body?.string(), type)
    }

}