package com.thoo.api

import com.thoo.api.model.*
import com.thoo.api.service.FortniteAPIService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FortniteAPI {

    private var retrofit: Retrofit? = null
    private var service: FortniteAPIService? = null

    init {
        retrofit = Retrofit.Builder().baseUrl("https://fortnite-api.com").addConverterFactory(GsonConverterFactory.create()).build()
        service = retrofit?.create(FortniteAPIService::class.java)
    }

    fun getCosmeticByID(id: String): BRCosmeticResponse? = service?.getCosmeticByID(id)?.execute()?.body()

    fun getCosmeticByID(id: String, language: Language): BRCosmeticResponse? = service?.getCosmeticByID(id, language.toString().toLowerCase())?.execute()?.body()

    fun getAllCosmetics(): BRCosmeticsResponse? = service?.getAllCosmetics()?.execute()?.body()

    fun getAllCosmetics(language: Language): BRCosmeticsResponse? = service?.getAllCosmetics(language.toString().toLowerCase())?.execute()?.body()

    fun getCosmeticsByID(ids: Array<String>): BRCosmeticsResponse? = service?.getCosmeticsByID(ids)?.execute()?.body()

    fun getCosmeticsByID(ids: Array<String>, language: Language): BRCosmeticsResponse? = service?.getCosmeticsByID(ids, language.toString().toLowerCase())?.execute()?.body()

    fun getItemShop(): BRItemShop? = service?.getItemShop()?.execute()?.body();

    fun getItemShop(language: Language): BRItemShop? = service?.getItemShop(language.toString().toLowerCase())?.execute()?.body();

    fun getNews(): NewsResponse? = service?.getNews()?.execute()?.body();

    fun getNews(language: Language): NewsResponse? = service?.getNews(language.toString().toLowerCase())?.execute()?.body();

    fun getNewsBR(): SepNewsResponse? = service?.getNewsBR()?.execute()?.body();

    fun getNewsBR(language: Language): SepNewsResponse? = service?.getNewsBR(language.toString().toLowerCase())?.execute()?.body();

    fun getNewsSTW(): SepNewsResponse? = service?.getNewsSTW()?.execute()?.body();

    fun getNewsSTW(language: Language): SepNewsResponse? = service?.getNewsSTW(language.toString().toLowerCase())?.execute()?.body();

    fun getNewsCreative(): SepNewsResponse? = service?.getNewsCreative()?.execute()?.body();

    fun getNewsCreative(language: Language): SepNewsResponse? = service?.getNewsCreative(language.toString().toLowerCase())?.execute()?.body();

    /*fun getMatched(matchBuilder: MatchBuilder):BRCosmeticsResponse? {
        val fields: Array<Field> = matchBuilder::javaClass.get().declaredFields
        val queryMap: HashMap<String, Any> = HashMap()
        fields.forEach {
            if(it.isAccessible){
                val value: Any? = it.get(matchBuilder)
                if(value != null){
                    queryMap[it.name] = value
                }
            }
        }
        return service?.matchCosmetics(queryMap)?.execute()?.body()
    }*/

}
