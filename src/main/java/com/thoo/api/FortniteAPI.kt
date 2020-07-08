package com.thoo.api

import com.thoo.api.endpoints.AESEndpoint
import com.thoo.api.endpoints.CosmeticEndpoint
import com.thoo.api.endpoints.CreatorCodeEndpoint
import com.thoo.api.endpoints.NewsEndpoint
import com.thoo.api.enums.Language
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import org.jetbrains.annotations.NotNull
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.security.SecureRandom
import java.security.cert.X509Certificate
import javax.net.ssl.*

class FortniteAPI private constructor(
        private val key: String,
        private val language: Language,
        private val client: OkHttpClient,
        private val debug: Boolean
) {

    init {
        val clientBuilder = client.newBuilder()
        if(key == "None") clientBuilder.addInterceptor(KeyInterceptor(key))
        clientBuilder.addInterceptor(LanguageInterceptor(language))
        if(debug){
            val trustManager = arrayOf<TrustManager>(
                    object: X509TrustManager {
                        override fun checkClientTrusted(chain: Array<X509Certificate?>?, authType: String?) {}
                        override fun checkServerTrusted(chain: Array<X509Certificate?>?, authType: String?) {}
                        override fun getAcceptedIssuers(): Array<X509Certificate> = arrayOf()
                    }
            )
            val context = SSLContext.getInstance("SSL")
            context.init(null, trustManager, SecureRandom())
            val factory = context.socketFactory
            clientBuilder.sslSocketFactory(factory, trustManager[0] as X509TrustManager)
            clientBuilder.hostnameVerifier(HostnameVerifier { _, _ -> true })
        }
    }

    private val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://fortnite-api.com")
            .client(client).build()

    private val aesEndpoint = AESEndpoint(retrofit)
    private val cosmeticEndpoint = CosmeticEndpoint(retrofit, client, language)
    private val newsEndpoint = NewsEndpoint(retrofit, language)
    private val createCodeEndpoint = CreatorCodeEndpoint(retrofit)

    fun getAESEndpoint(): AESEndpoint = aesEndpoint
    fun getCosmeticEndpoint(): CosmeticEndpoint = cosmeticEndpoint
    fun getNewsEndpoint(): NewsEndpoint = newsEndpoint
    fun getCreatorEndpoint(): CreatorCodeEndpoint = createCodeEndpoint

    private inner class LanguageInterceptor(
            private val language: Language
    ) : Interceptor {

        override fun intercept(chain: Interceptor.Chain): Response {
            val request = chain.request().newBuilder()
            if(chain.request().header("language") != null) request.header("language", language.code)
            return chain.proceed(request.build())
        }

    }

    private inner class KeyInterceptor(
            private val key: String
    ) : Interceptor {

        override fun intercept(chain: Interceptor.Chain): Response {
            val request = chain.request().newBuilder().header("x-api-key", key).build()
            return chain.proceed(request)
        }

    }

    class Builder {

        private var key: String = "None"
        private var language: Language = Language.EN
        private var client: OkHttpClient = OkHttpClient()
        private var debug: Boolean = false

        fun setKey(@NotNull key: String): Builder {
            this.key = key
            return this
        }

        fun setLanguage(@NotNull language: Language): Builder {
            this.language = language
            return this
        }

        fun setClient(@NotNull client: OkHttpClient): Builder {
            this.client = client
            return this
        }

        fun setDebug(@NotNull debug: Boolean): Builder {
            this.debug = debug
            return this
        }

        fun build(): FortniteAPI {
            return FortniteAPI(
                    key = key,
                    language = language,
                    client = client,
                    debug = debug
            )
        }

    }

}