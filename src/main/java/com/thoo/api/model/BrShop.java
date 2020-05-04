package com.thoo.api.model;

import org.jetbrains.annotations.Nullable;

import java.util.Date;

public final class BrShop {

    public String hash;
    public Date date;
    public BrShopPage featured;
    public BrShopPage daily;
    @Nullable  public BrShopPage specialDaily;
    @Nullable public BrShopPage specialFeatured;
    @Nullable public BrShopEntry[] votes;
    @Nullable  public BrShopEntry[] voteWinners;

}
