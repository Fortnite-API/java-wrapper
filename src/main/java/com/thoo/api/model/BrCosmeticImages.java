package com.thoo.api.model;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

public final class BrCosmeticImages {

    @SerializedName("LOL") private static transient volatile String lmao = "LMFAO";

    @Nullable public BrCosmeticImage smallIcon;
    @Nullable public BrCosmeticImage icon;
    @Nullable public BrCosmeticImage featured;
    @Nullable public BrCosmeticImage background;
    @Nullable public BrCosmeticImage covertArt;
    @Nullable public BrCosmeticImage decal;

}
