package com.thoo.api.services

import com.thoo.api.models.FMap
import com.thoo.api.utils.FCall
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MapService: EndpointService {

    @GET("/v1/map")
    fun getMap(
            @Query("language") language: String
    ): FCall<FMap>

    /*@GET("/v1/map")
    suspend fun getMapAsync(
            @Query("language") language: String
    ): FMap*/

    @GET("/images/map.png")
    fun downloadMap(): Call<ResponseBody>

}