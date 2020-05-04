package com.thoo.api.endpoints;

import com.thoo.api.enums.Language;
import com.thoo.api.model.BaseModel;
import com.thoo.api.model.NewsCombined;
import com.thoo.api.model.NewsTab;
import com.thoo.api.objects.FortniteResponse;
import com.thoo.api.services.NewsService;
import com.thoo.api.utils.HttpUtils;

public final class NewsEndpoint extends Endpoint<NewsService> {

    public NewsEndpoint(Language defaultLanguage) {
        super(NewsService.class, defaultLanguage);
    }

    public FortniteResponse<BaseModel<NewsCombined>> getNews(){
        return getNews(defaultLanguage);
    }

    public FortniteResponse<BaseModel<NewsCombined>> getNews(Language language){
        return HttpUtils.parse(service.getNews(language.code));
    }

    public FortniteResponse<BaseModel<NewsTab>> getNewsBr(){
        return getNewsBr(defaultLanguage);
    }

    public FortniteResponse<BaseModel<NewsTab>> getNewsBr(Language language){
        return HttpUtils.parse(service.getNewsBr(language.code));
    }

    public FortniteResponse<BaseModel<NewsTab>> getNewsStw(){
        return getNewsStw(defaultLanguage);
    }

    public FortniteResponse<BaseModel<NewsTab>> getNewsStw(Language language){
        return HttpUtils.parse(service.getNewsStw(language.code));
    }

    public FortniteResponse<BaseModel<NewsTab>> getNewsCreative(){
        return getNewsCreative(defaultLanguage);
    }

    public FortniteResponse<BaseModel<NewsTab>> getNewsCreative(Language language){
        return HttpUtils.parse(service.getNewsCreative(language.code));
    }

}
