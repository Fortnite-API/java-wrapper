package com.thoo.api.model;

import com.thoo.api.utils.HttpUtils;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

public final class BrCosmetic {

    public String id;
    public BrCosmeticType type;
    public String backendType;
    public BrCosmeticRarity rarity;
    public String displayRarity;
    public String backendRarity;
    public String name;
    public String shortDescription;
    public String description;
    @Nullable public String set;
    @Nullable public String setText;
    @Nullable public String series;
    @Nullable public String backendSeries;
    public BrCosmeticImages images;
    @Nullable public BrCosmeticVariant[] variants;
    public String[] gameplayTags;
    public String displayAssetPath;
    public String definition;
    public String requiredItemId;
    public String path;
    public String lastUpdate;
    public Date added;

    @Override
    public String toString(){
        return HttpUtils.gson.toJson(this);
    }

    public String name() {
        return name;
    }

}
