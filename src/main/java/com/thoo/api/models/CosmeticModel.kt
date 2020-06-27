package com.thoo.api.models

import java.util.*

class Cosmetic(
        val id: String,
        val name: String,
        val description: String,
        val type: BaseValues,
        val rarity: BaseValues,
        val series: Series,
        val set: BaseValues,
        val introduction: Introduction,
        val images: Images,
        val variant: Array<Variant>,
        val gameplayTags: Array<String>,
        val showcaseVideo: String,
        val displayAssetPath: String,
        val definitionPath: String,
        val path: String,
        val added: Date,
        val shopHistory: Array<Date>
)

class VariantOption(
        val tag: String,
        val name: String,
        val image: String
)

class Variant(
        val channel: String,
        val type: String,
        val options: Array<VariantOption>
)

class Series(
        val value: String,
        val image: String,
        val backendValue: String
)

class Images(
        val smallIcon: String,
        val icon: String,
        val featured: String,
        val other: MutableMap<String, String>
)

class Introduction(
        val chapter: String,
        val season: String,
        val text: String,
        val backendValue: Int
)

class BaseValues(
        val value: String,
        val displayValue: String,
        val backendValue: String
)