package com.thoo.api.endpoints;

import com.thoo.api.enums.Language;
import com.thoo.api.model.BaseModel;
import com.thoo.api.model.BrShop;
import com.thoo.api.objects.FortniteResponse;
import com.thoo.api.services.ShopService;
import com.thoo.api.utils.HttpUtils;

public final class ShopEndpoint extends Endpoint<ShopService> {

    public ShopEndpoint() {
        super(ShopService.class);
    }

    public FortniteResponse<BaseModel<BrShop>> getShop(){
        return HttpUtils.parse(service.shop());
    }

    public FortniteResponse<BaseModel<BrShop>> getShop(Language language){
        return HttpUtils.parse(service.shop(language.code));
    }

}
