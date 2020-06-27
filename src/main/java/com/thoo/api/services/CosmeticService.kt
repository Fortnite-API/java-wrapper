package com.thoo.api.services

import com.thoo.api.models.BaseModel
import com.thoo.api.models.Cosmetic
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CosmeticService {

    @GET("/v2/cosmetics/br")
    fun cosmetics(@Query("language") lang: String): Call<BaseModel<Array<Cosmetic>>>

    @GET("/v2/cosmetics/br/{id}")
    fun cosmeticByID(@Path("id") id: String, @Query("language") lang: String): Call<BaseModel<Cosmetic>>

    @GET("/v2/cosmetics/br/search/ids")
    fun cosmeticsByID(@Query("language") lang: String, @Query("id") vararg ids: String): Call<BaseModel<Cosmetic>>

}