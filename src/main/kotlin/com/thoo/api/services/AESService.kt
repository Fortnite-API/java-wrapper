package com.thoo.api.services

import com.thoo.api.models.AesModel
import com.thoo.api.models.BaseModel
import com.thoo.api.utils.FCall
import retrofit2.http.GET
import retrofit2.http.Query

interface AESService: EndpointService {

    @GET("/v2/aes")
    fun getAes(
        @Query("keyFormat") code: String
    ): FCall<AesModel>

}