package com.thoo.api.endpoints

import com.thoo.api.enums.KeyFormat
import com.thoo.api.exceptions.FortniteApiException
import com.thoo.api.models.AesModel
import com.thoo.api.models.BaseModel
import com.thoo.api.services.AESService
import com.thoo.api.utils.send
import retrofit2.Retrofit
import kotlin.jvm.Throws

@SuppressWarnings("unused")
class AESEndpoints(
    retrofit: Retrofit,
    clazz: Class<out AESService>
): EndpointBase<AESService>(retrofit, clazz) {

    @Throws(FortniteApiException::class)
    @JvmOverloads fun getAes(keyFormat: KeyFormat = KeyFormat.HEX): BaseModel<AesModel> =
            service.getAes(keyFormat.code).send()

}