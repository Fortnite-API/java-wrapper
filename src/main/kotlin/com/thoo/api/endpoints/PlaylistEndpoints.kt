package com.thoo.api.endpoints

import com.thoo.api.enums.Language
import com.thoo.api.exceptions.FortniteApiException
import com.thoo.api.services.PlaylistService
import com.thoo.api.utils.send
import retrofit2.Retrofit
import kotlin.jvm.Throws

@SuppressWarnings("unused")
class PlaylistEndpoints(
        retrofit: Retrofit,
        clazz: Class<out PlaylistService>,
        private val language: Language
): EndpointBase<PlaylistService>(retrofit, clazz) {

    @Throws(FortniteApiException::class)
    @JvmOverloads fun getPlaylists(language: Language = this.language) =
            service.getPlaylists(language.code).send()

    @Throws(FortniteApiException::class)
    @JvmOverloads fun getPlaylistById(id: String, language: Language = this.language) =
            service.getPlaylistById(id, language.code).send()

}