package com.thoo.api.endpoints

import com.thoo.api.services.CreatorCodeService
import com.thoo.api.utils.send
import okhttp3.OkHttpClient
import retrofit2.Retrofit

class CreatorCodeEndpoint(retrofit: Retrofit):
        Endpoint<CreatorCodeService>(retrofit, CreatorCodeService::class.java) {

    fun getCreatorCode(slug: String) = service.getCreatorCode(slug).send()

}