package com.thoo.api.services

import com.thoo.api.models.AESModel
import com.thoo.api.models.BaseModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface AESService {

    @GET("/v2/aes")
    fun aes(@Header("keyFormat") format: String = "hex"): Call<BaseModel<AESModel>>

}