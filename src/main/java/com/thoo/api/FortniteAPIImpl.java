package com.thoo.api;

import com.thoo.api.endpoints.*;
import com.thoo.api.enums.Language;
import com.thoo.api.utils.HttpUtils;

public final class FortniteAPIImpl implements FortniteAPI {

    private final String apiKey;

    private final AESEndpoint aesEndpoint;
    private final CreatorCodeEndpoint creatorCodeEndpoint;
    private final CosmeticEndpoint cosmeticEndpoint;
    private final ShopEndpoint shopEndpoint;
    private final NewsEndpoint newsEndpoint;
    private final StatsEndpoint statsEndpoint;

    public FortniteAPIImpl(String apiKey, Language defaultLanguage){
        this.apiKey = apiKey;
        new HttpUtils(this);
        this.aesEndpoint = new AESEndpoint();
        this.creatorCodeEndpoint = new CreatorCodeEndpoint();
        this.cosmeticEndpoint = new CosmeticEndpoint(defaultLanguage);
        this.shopEndpoint = new ShopEndpoint(defaultLanguage);
        this.newsEndpoint = new NewsEndpoint(defaultLanguage);
        this.statsEndpoint = new StatsEndpoint(defaultLanguage);
    }

    public String getApiKey() {
        return apiKey;
    }

    @Override
    public AESEndpoint getAESEndpoint() {
        return aesEndpoint;
    }

    @Override
    public CreatorCodeEndpoint getCreatorCodeEndpoint() {
        return creatorCodeEndpoint;
    }

    @Override
    public CosmeticEndpoint getCosmeticsEndpoint() {
        return cosmeticEndpoint;
    }

    @Override
    public ShopEndpoint getShopEndpoint() {
        return shopEndpoint;
    }

    @Override
    public NewsEndpoint getNewsEndpoint() {
        return newsEndpoint;
    }

    @Override
    public StatsEndpoint getStatsEndpoint() {
        return statsEndpoint;
    }

}
