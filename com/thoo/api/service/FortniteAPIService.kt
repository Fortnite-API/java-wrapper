package com.thoo.api.service

import com.thoo.api.model.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface FortniteAPIService {

    @GET("/cosmetics/br/{id}")
    fun getCosmeticByID(@Path("id") id: String): Call<BaseResponse<BRCosmeticData>>

    @GET("/cosmetics/br/{id}")
    fun getCosmeticByID(@Path("id") id: String, @Query("language") language: String): Call<BaseResponse<BRCosmeticData>>

    @GET("/cosmetics/br")
    fun getAllCosmetics(): Call<BaseResponse<Array<BRCosmeticData>>>

    @GET("/cosmetics/br")
    fun getAllCosmetics(@Query("language") language: String): Call<BaseResponse<Array<BRCosmeticData>>>

    @GET("/cosmetics/br/search/ids")
    fun getCosmeticsByID(@Query("id") ids: Array<String>): Call<BaseResponse<Array<BRCosmeticData>>>

    @GET("/cosmetics/br/search/ids")
    fun getCosmeticsByID(@Query("id") ids: Array<String>, @Query("language") language: String): Call<BaseResponse<Array<BRCosmeticData>>>

    @GET("/shop/br")
    fun getItemShop(): Call<BaseResponse<BRItemShopData>>;

    @GET("/shop/br")
    fun getItemShop(@Query("language") language: String): Call<BaseResponse<BRItemShopData>>;

    @GET("/news")
    fun getNews(): Call<BaseResponse<NewsTab>>;

    @GET("/news")
    fun getNews(@Query("language") language: String): Call<BaseResponse<NewsData>>;

    @GET("/news/br")
    fun getNewsBR(): Call<BaseResponse<NewsTab>>;

    @GET("/news/br")
    fun getNewsBR(@Query("language") language: String): Call<BaseResponse<NewsTab>>;

    @GET("/news/stw")
    fun getNewsSTW(): Call<BaseResponse<NewsTab>>;

    @GET("/news/stw")
    fun getNewsSTW(@Query("language") language: String): Call<BaseResponse<NewsTab>>;

    @GET("/news/creative")
    fun getNewsCreative(): Call<BaseResponse<NewsTab>>;

    @GET("/news/creative")
    fun getNewsCreative(@Query("language") language: String): Call<BaseResponse<NewsTab>>;

    @GET("/cosmetics/br/search/all")
    fun matchCosmetics(@QueryMap map: Map<String, String>, @QueryMap map2: Map<String, Boolean>): Call<BaseResponse<Array<BRCosmeticData>>>

    @GET("/cosmetics/br/search/all")
    fun matchCosmetics(@QueryMap map: Map<String, String>, @QueryMap map2: Map<String, Boolean>, @Query("language") language: String): Call<BaseResponse<Array<BRCosmeticData>>>

    @GET("creatorcode")
    fun getCreator(@Query("slug") slug: String): Call<BaseResponse<CreatorCode>>

    @GET("creatorcode/search")
    fun getMatchingCreator(@Query("slug") slug: String): Call<BaseResponse<CreatorCode>>

    @GET("creatorcode/search/all")
    fun getMatchingCreators(@Query("slug") slug: String): Call<BaseResponse<Array<CreatorCode>>>
}
