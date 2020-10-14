package com.thoo.api.endpoints

import com.thoo.api.enums.Language
import com.thoo.api.exceptions.FortniteApiException
import com.thoo.api.services.MapService
import com.thoo.api.utils.download
import com.thoo.api.utils.send
import okhttp3.OkHttpClient
import org.jetbrains.annotations.NotNull
import retrofit2.Retrofit
import java.io.BufferedInputStream
import java.io.File
import kotlin.jvm.Throws

@SuppressWarnings("unused")
class MapEndpoints(
        retrofit: Retrofit,
        clazz: Class<out MapService>,
        private val language: Language
): EndpointBase<MapService>(retrofit, clazz) {

    private val okhttp = OkHttpClient()

    @Throws(FortniteApiException::class)
    @JvmOverloads fun getMap(language: Language = this.language) =
            service.getMap(language.code).send()

    fun downloadMap(@NotNull file: File) {
        if(file.exists()) throw FileAlreadyExistsException(file)
        val body = service.downloadMap().execute().body()!!
        download(BufferedInputStream(body.byteStream()), file)
    }

}