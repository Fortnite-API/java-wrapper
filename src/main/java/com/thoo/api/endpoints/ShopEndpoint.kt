package com.thoo.api.endpoints

import retrofit2.Retrofit

class ShopEndpoint(retrofit: Retrofit, private val defaultLanguage: String) :
        Endpoint<ShopEndpoint>(retrofit, ShopEndpoint::class.java) {

    //@JvmOverloads fun getShop(language: String = defaultLanguage) = service.getShop(language)

}