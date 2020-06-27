package com.thoo.api.services

import com.thoo.api.models.BaseModel
import com.thoo.api.models.CombinedNews
import com.thoo.api.models.News
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NewsService {

    @GET("/v2/news")
    fun getNews(@Query("language") language: String): Call<BaseModel<CombinedNews>>

    @GET("/v2/news/{type}")
    fun getSpecNews(@Path("type") type: String, @Query("language") language: String): Call<BaseModel<News>>

}