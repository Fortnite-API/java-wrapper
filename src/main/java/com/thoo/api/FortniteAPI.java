package com.thoo.api;

import com.thoo.api.endpoints.*;

public interface FortniteAPI {

    AESEndpoint getAESEndpoint();

    CreatorCodeEndpoint getCreatorCodeEndpoint();

    CosmeticEndpoint getCosmeticsEndpoint();

    ShopEndpoint getShopEndpoint();

    NewsEndpoint getNewsEndpoint();

}
