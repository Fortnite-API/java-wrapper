package com.thoo.api.models

import java.util.*
import kotlin.collections.HashMap

class Cosmetic(
        val id: String,
        val name: String,
        val description: String,
        val type: BaseValues,
        val rarity: BaseValues,
        val series: CosmeticSeries,
        val set: CosmeticSet,
        val introduction: CosmeticIntroduction,
        val images: CosmeticImages,
        val variants: List<CosmeticVariant>,
        val gameplayTags: List<String>,
        val showcaseVideo: String,
        val displayAssetPath: String,
        val definitionPath: String,
        val path: String,
        val added: Date,
        val shopHistory: List<Date>
)

class CosmeticVariant(
        val channel: String,
        val type: String,
        val options: List<CosmeticVariantOption>
)

class CosmeticVariantOption(
        val tag: String,
        val name: String,
        val unlockRequirements: String,
        val image: String
)

class CosmeticImages(
        val smallIcon: String,
        val icon: String,
        val featured: String,
        val other: HashMap<String, String>
)

class CosmeticIntroduction(
        val chapter: String,
        val season: String,
        val text: String,
        val backendValue: String
)

class CosmeticSet(
        val value: String,
        val text: String,
        val backendValue: String
)

class CosmeticSeries(
        val value: String,
        val image: String,
        val backendValue: String
)

class BaseValues(
        val value: String,
        val displayValue: String,
        val backendValue: String
)