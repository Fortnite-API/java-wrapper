package com.thoo.api.endpoints

import com.thoo.api.enums.KeyFormat
import com.thoo.api.models.AESModel
import com.thoo.api.models.BaseModel
import com.thoo.api.services.AESService
import com.thoo.api.utils.send
import retrofit2.Retrofit

class AESEndpoint(retrofit: Retrofit) : Endpoint<AESService>(retrofit, AESService::class.java) {

    @JvmOverloads fun getAES(format: KeyFormat = KeyFormat.HEX): BaseModel<AESModel>? = service.aes().send()


}