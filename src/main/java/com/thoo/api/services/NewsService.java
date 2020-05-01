package com.thoo.api.services;

import com.thoo.api.model.BaseModel;
import com.thoo.api.model.NewsCombined;
import com.thoo.api.model.NewsTab;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsService {

    @GET("/news")
    Call<BaseModel<NewsCombined>> getNews();

    @GET("/news")
    Call<BaseModel<NewsCombined>> getNews(@Query("language") String language);

    @GET("/news/br")
    Call<BaseModel<NewsTab>> getNewsBr();

    @GET("/news/br")
    Call<BaseModel<NewsTab>> getNewsBr(@Query("language") String language);

    @GET("/news/stw")
    Call<BaseModel<NewsTab>> getNewsStw();

    @GET("/news/stw")
    Call<BaseModel<NewsTab>> getNewsStw(@Query("language") String language);

    @GET("/news/creative")
    Call<BaseModel<NewsTab>> getNewsCreative();

    @GET("/news/creative")
    Call<BaseModel<NewsTab>> getNewsCreative(@Query("language") String language);

}
