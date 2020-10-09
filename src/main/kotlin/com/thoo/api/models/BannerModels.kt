package com.thoo.api.models

class Banner(
        val id: String,
        val devName: String,
        val name: String,
        val description: String,
        val category: String,
        val fullUsageRights: Boolean,
        val images: BannerImages
)

class BannerImages(
        val smallIcon: String,
        val icon: String
)

class BannerColor(
        val id: String,
        val color: String,
        val category: String,
        val subCategoryGroup: Int
)