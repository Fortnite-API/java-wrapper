package com.thoo.api.service

import com.thoo.api.model.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap
import okhttp3.ResponseBody



interface FortniteAPIService {

    @GET("/cosmetics/br/{id}")
    fun getCosmeticByID(@Path("id") id: String): Call<BRCosmeticResponse>

    @GET("/cosmetics/br/{id}")
    fun getCosmeticByID(@Path("id") id: String, @Query("language") language: String): Call<BRCosmeticResponse>

    @GET("/cosmetics/br")
    fun getAllCosmetics(): Call<BRCosmeticsResponse>

    @GET("/cosmetics/br")
    fun getAllCosmetics(@Query("language") language: String): Call<BRCosmeticsResponse>

    @GET("/cosmetics/br/search/ids")
    fun getCosmeticsByID(@Query("id") ids: Array<String>): Call<BRCosmeticsResponse>

    @GET("/cosmetics/br/search/ids")
    fun getCosmeticsByID(@Query("id") ids: Array<String>, @Query("language") language: String): Call<BRCosmeticsResponse>

    @GET("/shop/br")
    fun getItemShop(): Call<BRItemShop>;

    @GET("/shop/br")
    fun getItemShop(@Query("language") language: String): Call<BRItemShop>;

    @GET("/news")
    fun getNews(): Call<NewsResponse>;

    @GET("/news")
    fun getNews(@Query("language") language: String): Call<NewsResponse>;

    @GET("/news/br")
    fun getNewsBR(): Call<SepNewsResponse>;

    @GET("/news/br")
    fun getNewsBR(@Query("language") language: String): Call<SepNewsResponse>;

    @GET("/news/stw")
    fun getNewsSTW(): Call<SepNewsResponse>;

    @GET("/news/stw")
    fun getNewsSTW(@Query("language") language: String): Call<SepNewsResponse>;

    @GET("/news/creative")
    fun getNewsCreative(): Call<SepNewsResponse>;

    @GET("/news/creative")
    fun getNewsCreative(@Query("language") language: String): Call<SepNewsResponse>;

    @GET("/cosmetics/br/search/all")
    fun matchCosmetics(@QueryMap map: Map<String, String>, @QueryMap map2: Map<String, Boolean>): Call<BRCosmeticsResponse>

    @GET("/cosmetics/br/search/all")
    fun matchCosmetics(@QueryMap map: Map<String, String>, @QueryMap map2: Map<String, Boolean>, @Query("language") language: String): Call<BRCosmeticsResponse>
}
