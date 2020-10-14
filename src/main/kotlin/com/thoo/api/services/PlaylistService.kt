package com.thoo.api.services

import com.thoo.api.models.Playlist
import com.thoo.api.utils.FCall
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PlaylistService: EndpointService {

    @GET("/v1/playlists")
    fun getPlaylists(
            @Query("language") language: String
    ): FCall<List<Playlist>>

    @GET("/v1/playlists/{id}")
    fun getPlaylistById(
            @Path("id") id: String,
            @Query("language") language: String
    ): FCall<Playlist>

}