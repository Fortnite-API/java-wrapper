package com.thoo.api.services

import com.thoo.api.models.Creator
import com.thoo.api.utils.FCall
import retrofit2.http.GET
import retrofit2.http.Query

interface CreatorService {

    @GET("/v2/creatorcode")
    fun getCreator(
            @Query("name") name: String
    ): FCall<Creator>

    @GET("/v2/creatorcode")
    fun searchCreator(
            @Query("name") name: String
    ): FCall<Creator>

    @GET("/v2/creatorcode")
    fun searchCreators(
            @Query("name") name: String
    ): FCall<List<Creator>>


}