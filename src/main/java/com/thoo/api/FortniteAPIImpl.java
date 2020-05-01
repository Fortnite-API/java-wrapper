package com.thoo.api;

import com.thoo.api.endpoints.*;
import com.thoo.api.utils.HttpUtils;

public final class FortniteAPIImpl implements FortniteAPI {

    private String apiKey;

    private AESEndpoint aesEndpoint;
    private CreatorCodeEndpoint creatorCodeEndpoint;
    private CosmeticEndpoint cosmeticEndpoint;
    private ShopEndpoint shopEndpoint;
    private NewsEndpoint newsEndpoint;

    public FortniteAPIImpl(String apiKey){
        this.apiKey = apiKey;
        new HttpUtils(this);
        this.aesEndpoint = new AESEndpoint();
        this.creatorCodeEndpoint = new CreatorCodeEndpoint();
        this.cosmeticEndpoint = new CosmeticEndpoint();
        this.shopEndpoint = new ShopEndpoint();
        this.newsEndpoint = new NewsEndpoint();
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

}
