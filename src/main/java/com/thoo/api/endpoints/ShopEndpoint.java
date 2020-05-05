package com.thoo.api.endpoints;

import com.thoo.api.enums.Language;
import com.thoo.api.model.BaseModel;
import com.thoo.api.model.BrShop;
import com.thoo.api.objects.FortniteResponse;
import com.thoo.api.services.ShopService;
import com.thoo.api.utils.HttpUtils;

public final class ShopEndpoint extends Endpoint<ShopService> {

    public ShopEndpoint(Language defaultLanguage) {
        super(ShopService.class, defaultLanguage);
    }

    public FortniteResponse<BaseModel<BrShop>> getShop(){
        return getShop(defaultLanguage);
    }

    public FortniteResponse<BaseModel<BrShop>> getShop(Language language){
        return HttpUtils.parse(service.shop(language.code));
    }

    public FortniteResponse<BaseModel<BrShop>> getShopCombined(){
        return getShopCombined(defaultLanguage);
    }

    public FortniteResponse<BaseModel<BrShop>> getShopCombined(Language language){
        return HttpUtils.parse(service.shop(language.code));
    }

}
