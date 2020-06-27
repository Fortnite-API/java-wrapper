package com.thoo.api.endpoints

import com.thoo.api.enums.Language
import com.thoo.api.enums.NewsType
import com.thoo.api.services.NewsService
import com.thoo.api.utils.send
import retrofit2.Retrofit

class NewsEndpoint(retrofit: Retrofit, private val defaultLang: Language) :
        Endpoint<NewsService>(retrofit, NewsService::class.java) {

    @JvmOverloads fun getNews(lang: Language = defaultLang) = service.getNews(lang.code).send()
    @JvmOverloads fun getBrNews(lang: Language = defaultLang) = service.getSpecNews(NewsType.BR.code, lang.code).send()
    @JvmOverloads fun getStwNews(lang: Language = defaultLang) = service.getSpecNews(NewsType.STW.code, lang.code).send()
    @JvmOverloads fun getCreativeNews(lang: Language = defaultLang) = service.getSpecNews(NewsType.CREA.code, lang.code).send()

}