package com.thoo.api.model;

import org.jetbrains.annotations.Nullable;

import java.util.Date;

public final class BrShopCombined {

    public String hash;
    public Date date;
    public BrShopPage featured;
    public BrShopPage daily;
    @Nullable  public BrShopEntry[] votes;
    @Nullable  public BrShopEntry[] voteWinners;

}
