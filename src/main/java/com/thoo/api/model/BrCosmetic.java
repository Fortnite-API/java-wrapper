package com.thoo.api.model;

import com.thoo.api.utils.HttpUtils;

import java.util.Date;

public final class BrCosmetic {

    public String id;
    public String name;
    public String description;
    public BrCosmeticType type;
    public BrCosmeticRarity rarity;
    public BrCosmeticSeries series;
    public BrCosmeticSet set;
    public BrCosmeticIntroduction introduction;
    public BrCosmeticImages images;
    public BrCosmeticVariant[] variants;
    public String[] gameplayTags;
    public String displayAssetPath;
    public String definitionPath;
    public String path;
    public Date added;
    public Date[] shopHistory;

    @Override
    public String toString(){
        return HttpUtils.gson.toJson(this);
    }

    public String name() {
        return name;
    }

}
