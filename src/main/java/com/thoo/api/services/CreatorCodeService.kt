package com.thoo.api.services

import com.thoo.api.models.BaseModel
import com.thoo.api.models.CreatorCode
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CreatorCodeService {

    @GET("/v2/creatorcode")
    fun getCreatorCode(@Query("name") slug: String): Call<BaseModel<CreatorCode>>

}