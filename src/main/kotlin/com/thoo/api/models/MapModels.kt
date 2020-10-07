package com.thoo.api.models

data class FMap(
        val images: MapImages,
        val pois: List<MapPOI>
)

data class MapImages(
        val blank: String,
        val pois: String,
)

data class MapPOI(
        val id: String,
        val name: String,
        val location: MapPOILocation
)

data class MapPOILocation(
        val x: Float,
        val y: Float,
        val z: Float
)