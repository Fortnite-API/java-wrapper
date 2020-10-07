package com.thoo.api

import com.thoo.api.endpoints.*
import com.thoo.api.enums.Language
import com.thoo.api.services.*
import okhttp3.OkHttpClient
import org.jetbrains.annotations.NotNull
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Suppress("unused")
class FortniteAPI private constructor(
    private val apiKey: String?,
    language: Language,
    httpClient: OkHttpClient
) {

    // The `/v2/` is a bug fix but won't actually get applied
    private val retrofit = Retrofit.Builder()
            .baseUrl("https://fortnite-api.com/v2/")
            .client(httpClient)
            //.addCallAdapterFactory(ApiCallAdapterFactory())
            .addConverterFactory(GsonConverterFactory.create()).build()

    @JvmField val aes = AESEndpoints(retrofit, AESService::class.java)
    @JvmField val map = MapEndpoints(retrofit, MapService::class.java, language)
    @JvmField val playlist = PlaylistEndpoints(retrofit, PlaylistService::class.java, language)
    @JvmField val banner = BannerEndpoints(retrofit, BannerService::class.java, language)
    @JvmField val creator = CreatorEndpoints(retrofit, CreatorService::class.java)
    @JvmField val cosmetic = CosmeticEndpoints(retrofit, CosmeticService::class.java, language)

    companion object {

        @JvmOverloads
        @JvmStatic
        fun create(
            apiKey: String? = null,
            @NotNull language: Language = Language.EN,
            httpClient: OkHttpClient? = null
        ): FortniteAPI = FortniteAPI(apiKey, language,
                httpClient ?: OkHttpClient.Builder().addInterceptor interceptor@ {
                    if(apiKey == null) return@interceptor it.proceed(it.request())
                    val request = it.request()
                    val requestBuilder = request.newBuilder()
                    requestBuilder.header("x-api-key", apiKey)
                    return@interceptor it.proceed(requestBuilder.build())
                }.build())

    }

}