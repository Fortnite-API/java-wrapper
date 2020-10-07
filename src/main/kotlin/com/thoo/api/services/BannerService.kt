package com.thoo.api.services

import com.thoo.api.models.Banner
import com.thoo.api.models.BannerColor
import com.thoo.api.utils.FCall
import retrofit2.http.GET
import retrofit2.http.Query

interface BannerService: EndpointService {

    @GET("/v1/banners")
    fun getBanners(
            @Query("language") language: String
    ): FCall<List<Banner>>

    @GET("/v1/banners/colors")
    fun getBannerColors(): FCall<List<BannerColor>>

}