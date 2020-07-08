package com.thoo.api.services

import com.thoo.api.models.BaseModel
import com.thoo.api.models.ShopModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ShopService {

    @GET("/v2/shop/br")
    fun shop(@Query("language") language: String): Call<BaseModel<ShopModel>>

}