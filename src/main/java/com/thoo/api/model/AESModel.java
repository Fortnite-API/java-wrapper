package com.thoo.api.model;

import java.util.Date;

public final class AESModel {

    public String build;
    public String mainKey;
    public DynamicPak[] dynamicPaks;
    public Date updated;

    public final static class DynamicPak {
        public String pakFilename;
        public String pakGuid;
        public String key;
    }

}
