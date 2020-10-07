package com.thoo.api.services

import com.thoo.api.models.Cosmetic
import com.thoo.api.utils.FCall
import retrofit2.http.GET
import retrofit2.http.Query

interface CosmeticService: EndpointService {

    @GET("/v2/cosmetics/br")
    fun getCosmetics(
            @Query("language") language: String
    ): FCall<List<Cosmetic>>

    @GET("/v2/cosmetics/br/new")
    fun getNewCosmetics(
            @Query("language") language: String
    ): FCall<List<Cosmetic>>

}