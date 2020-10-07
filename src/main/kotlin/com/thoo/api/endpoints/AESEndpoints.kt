package com.thoo.api.endpoints

import com.thoo.api.enums.KeyFormat
import com.thoo.api.models.AesModel
import com.thoo.api.models.BaseModel
import com.thoo.api.services.AESService
import com.thoo.api.utils.send
import retrofit2.Retrofit

@SuppressWarnings("unused")
class AESEndpoints(
    retrofit: Retrofit,
    clazz: Class<out AESService>
): EndpointBase<AESService>(retrofit, clazz) {

    @JvmOverloads fun getAes(keyFormat: KeyFormat = KeyFormat.HEX): BaseModel<AesModel> =
            service.getAes(keyFormat.code).send()

    @JvmOverloads suspend fun getAesAsync(keyFormat: KeyFormat = KeyFormat.HEX): BaseModel<AesModel> =
            service.getAesAsync(keyFormat.code)

}