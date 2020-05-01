package com.thoo.api.endpoints;

import com.thoo.api.enums.Language;
import com.thoo.api.model.BaseModel;
import com.thoo.api.model.NewsCombined;
import com.thoo.api.model.NewsTab;
import com.thoo.api.objects.FortniteResponse;
import com.thoo.api.services.NewsService;
import com.thoo.api.utils.HttpUtils;

public final class NewsEndpoint extends Endpoint<NewsService> {

    public NewsEndpoint() {
        super(NewsService.class);
    }

    public FortniteResponse<BaseModel<NewsCombined>> getNews(){
        return HttpUtils.parse(service.getNews());
    }

    public FortniteResponse<BaseModel<NewsCombined>> getNews(Language language){
        return HttpUtils.parse(service.getNews(language.code));
    }

    public FortniteResponse<BaseModel<NewsTab>> getNewsBr(){
        return HttpUtils.parse(service.getNewsBr());
    }

    public FortniteResponse<BaseModel<NewsTab>> getNewsBr(Language language){
        return HttpUtils.parse(service.getNewsBr(language.code));
    }

    public FortniteResponse<BaseModel<NewsTab>> getNewsStw(){
        return HttpUtils.parse(service.getNewsStw());
    }

    public FortniteResponse<BaseModel<NewsTab>> getNewsStw(Language language){
        return HttpUtils.parse(service.getNewsStw(language.code));
    }

    public FortniteResponse<BaseModel<NewsTab>> getNewsCreative(){
        return HttpUtils.parse(service.getNewsCreative());
    }

    public FortniteResponse<BaseModel<NewsTab>> getNewsCreative(Language language){
        return HttpUtils.parse(service.getNewsCreative(language.code));
    }

}
