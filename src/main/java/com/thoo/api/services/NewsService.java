package com.thoo.api.services;

import com.thoo.api.model.BaseModel;
import com.thoo.api.model.NewsCombined;
import com.thoo.api.model.NewsTab;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsService {

    @GET("/v2/news")
    Call<BaseModel<NewsCombined>> getNews();

    @GET("/v2/news")
    Call<BaseModel<NewsCombined>> getNews(@Query("language") String language);

    @GET("/v2/news/br")
    Call<BaseModel<NewsTab>> getNewsBr();

    @GET("/v2/news/br")
    Call<BaseModel<NewsTab>> getNewsBr(@Query("language") String language);

    @GET("/v2/news/stw")
    Call<BaseModel<NewsTab>> getNewsStw();

    @GET("/v2/news/stw")
    Call<BaseModel<NewsTab>> getNewsStw(@Query("language") String language);

    @GET("/v2/news/creative")
    Call<BaseModel<NewsTab>> getNewsCreative();

    @GET("/v2/news/creative")
    Call<BaseModel<NewsTab>> getNewsCreative(@Query("language") String language);

}
