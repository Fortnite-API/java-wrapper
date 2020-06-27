package com.thoo.api.models

import java.util.*

class CombinedNews(
        val br: News,
        val stw: News,
        val creative: News
)

class News(
        val hash: String,
        val date: Date,
        val image: String,
        val motds: Array<Motd>,
        val messages: Array<NewsMessage>
)

class NewsMessage(
        val title: String,
        val body: String,
        val image: String,
        val adspace: String
)

class Motd(
        val id: String,
        val title: String,
        val tabTitle: String,
        val body: String,
        val image: String,
        val titleImage: String,
        val sortingPriority: Int
)