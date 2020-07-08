package com.thoo.api.models

import java.util.*

class ShopModel(
        val hash: String,
        val date: Date,
        val featured: Shop,
        val daily: Shop,
        val specialFeatured: Shop?,
        val specialDaily: Shop?,
        val vote: Shop?,
        val voteWinners: Shop?
)

class Shop(
        val name: String,
        val entries: Array<ShopEntry>
)

class ShopEntry(
        val regularPlace: Int,
        val finalPrice: Int,
        val bundle: Bundle,
        val banner: Banner,
        val giftable: Boolean,
        val refundable: Boolean,
        val sortPriority: Int,
        val categories: Array<String>,
        val devName: String,
        val offerId: String,
        val displayAssetPth: String,
        val items: Array<Cosmetic>
)

class Banner(
        val value: String,
        val backendValue: String
)

class Bundle(
        val name: String,
        val backendValue: String
)