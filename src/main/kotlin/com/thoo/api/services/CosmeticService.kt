package com.thoo.api.services

import com.thoo.api.models.Cosmetic
import com.thoo.api.utils.FCall
import retrofit2.http.GET
import retrofit2.http.Query

interface CosmeticService: EndpointService {

    @GET("/v2/cosmetics/br")
    fun getCosmetics(
            @Query("language") language: String
    ): FCall<List<Cosmetic>>

    @GET("/v2/cosmetics/br/new")
    fun getNewCosmetics(
            @Query("language") language: String
    ): FCall<List<Cosmetic>>

    @GET("/v2/cosmetics/br/search/all")
    fun searchCosmetic(
            @Query("language") language: String,
            @Query("searchLanguage") searchLanguage: String,
            @Query("matchMethod") matchMethod: String,
            @Query("id") id: String?,
            @Query("name") name: String?,
            @Query("description") description: String?,
            @Query("type") type: String?,
            @Query("displayType") displayType: String?,
            @Query("backendType") backendType: String?,
            @Query("rarity") rarity: String?,
            @Query("displayRarity") displayRarity: String?,
            @Query("backendRarity") backendRarity: String?,
            @Query("hasSeries") hasSeries: Boolean?,
            @Query("hasSet") hasSet: Boolean?,
            @Query("set") set: String?,
            @Query("setText") setText: String?,
            @Query("backendSet") backendSet: String?,
            @Query("hasIntroduction") hasIntroduction: Boolean?,
            @Query("introductionChapter") introductionChapter: String?,
            @Query("introductionSeason") introductionSeason: String?,
            @Query("hasFeaturedImage") hasFeaturedImage: Boolean?,
            @Query("hasVariants") hasVariants: Boolean?,
            @Query("hasGameplayTags") hasGameplayTags: Boolean?,
            @Query("gameplayTag") gameplayTag: String?,
            @Query("added") added: Long?,
            @Query("addedSince") addedSince: Long?,
            @Query("unseenFor") unseenFor: Long?,
            @Query("lastAppearance") lastAppearance: Long?,
    ): FCall<Cosmetic>

}