package com.thoo.api.endpoints

import com.thoo.api.enums.Language
import com.thoo.api.services.MapService
import com.thoo.api.utils.download
import com.thoo.api.utils.send
import okhttp3.OkHttpClient
import org.jetbrains.annotations.NotNull
import retrofit2.Retrofit
import java.io.File

@SuppressWarnings("unused")
class MapEndpoints(
        retrofit: Retrofit,
        clazz: Class<out MapService>,
        private val language: Language
): EndpointBase<MapService>(retrofit, clazz) {

    private val okhttp = OkHttpClient()

    @JvmOverloads fun getMap(language: Language = this.language) =
            service.getMap(language.code).send()

    /*@JvmOverloads suspend fun getMapAsync(language: Language = this.language) =
            service.getMapAsync(language.code)*/

    fun downloadMap(@NotNull file: File) {
        if(file.exists()) throw FileAlreadyExistsException(file)
        val body = service.downloadMap().execute().body()!!
        download(body.byteStream(), file)
    }

}