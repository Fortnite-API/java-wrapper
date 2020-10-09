package com.thoo.api.models

class FMap(
        val images: MapImages,
        val pois: List<MapPOI>
)

class MapImages(
        val blank: String,
        val pois: String,
)

class MapPOI(
        val id: String,
        val name: String,
        val location: MapPOILocation
)

class MapPOILocation(
        val x: Float,
        val y: Float,
        val z: Float
)