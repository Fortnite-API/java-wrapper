package com.thoo.api

import com.thoo.api.match.MatchBuilder
import com.thoo.api.model.*
import com.thoo.api.service.FortniteAPIService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.reflect.Field
import java.util.*

class FortniteAPI {

    private var retrofit: Retrofit? = null
    private var service: FortniteAPIService? = null

    init {
        retrofit = Retrofit.Builder().baseUrl("https://fortnite-api.com").addConverterFactory(GsonConverterFactory.create()).build()
        service = retrofit?.create(FortniteAPIService::class.java)
    }

    fun getCosmeticByID(id: String): BaseResponse<BRCosmeticData>? = service?.getCosmeticByID(id)?.execute()?.body()

    fun getCosmeticByID(id: String, language: Language): BaseResponse<BRCosmeticData>? = service?.getCosmeticByID(id, language.toString().toLowerCase())?.execute()?.body()

    fun getAllCosmetics(): BaseResponse<Array<BRCosmeticData>>? = service?.getAllCosmetics()?.execute()?.body()

    fun getAllCosmetics(language: Language): BaseResponse<Array<BRCosmeticData>>? = service?.getAllCosmetics(language.toString().toLowerCase())?.execute()?.body()

    fun getCosmeticsByID(ids: Array<String>): BaseResponse<Array<BRCosmeticData>>? = service?.getCosmeticsByID(ids)?.execute()?.body()

    fun getCosmeticsByID(ids: Array<String>, language: Language): BaseResponse<Array<BRCosmeticData>>? = service?.getCosmeticsByID(ids, language.toString().toLowerCase())?.execute()?.body()

    fun getItemShop(): BaseResponse<BRItemShopData>? = service?.getItemShop()?.execute()?.body();

    fun getItemShop(language: Language): BaseResponse<BRItemShopData>? = service?.getItemShop(language.toString().toLowerCase())?.execute()?.body();

    fun getNews(): BaseResponse<NewsTab>? = service?.getNews()?.execute()?.body();

    fun getNews(language: Language): BaseResponse<NewsData>? = service?.getNews(language.toString().toLowerCase())?.execute()?.body();

    fun getNewsBR(): BaseResponse<NewsTab>? = service?.getNewsBR()?.execute()?.body();

    fun getNewsBR(language: Language): BaseResponse<NewsTab>? = service?.getNewsBR(language.toString().toLowerCase())?.execute()?.body();

    fun getNewsSTW(): BaseResponse<NewsTab>? = service?.getNewsSTW()?.execute()?.body();

    fun getNewsSTW(language: Language): BaseResponse<NewsTab>? = service?.getNewsSTW(language.toString().toLowerCase())?.execute()?.body();

    fun getNewsCreative(): BaseResponse<NewsTab>? = service?.getNewsCreative()?.execute()?.body();

    fun getNewsCreative(language: Language): BaseResponse<NewsTab>? = service?.getNewsCreative(language.toString().toLowerCase())?.execute()?.body();

    fun getMatchedCosmetics(matchBuilder: MatchBuilder): BaseResponse<Array<BRCosmeticData>>? {
        val fields: Array<Field> = matchBuilder.javaClass.declaredFields
        val queryMapString: HashMap<String, String> = HashMap()
        val queryMapBool: HashMap<String, Boolean> = HashMap()
        fields.forEach {
            it.isAccessible = true
            val value: Any? = it.get(matchBuilder)
            if (value != null) {
                if (value is String) {
                    queryMapString[it.name] = value
                } else if (value is Boolean) {
                    queryMapBool[it.name] = value
                }
            }
        }
        return service?.matchCosmetics(queryMapString, queryMapBool)?.execute()?.body()
    }

}
