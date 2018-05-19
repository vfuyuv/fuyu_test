package com.fy.java;

/**
 * 卡片信息字符串按“_”解析后的数据位置
 */
public enum KeyType {
    //资源包id(实时专用)
    REALTIME_RESOURCE_PACKAGE("rtrp"),
    //资源包id
    RESOURCE_PACKAGE("rp"),
    //资源类型
    RESOURCE_TYPE("rt"),
    //资源id
    RESOURCE_ID("ri"),
    //页面
    PAGE("p"),
    //策略
    POLICY("po"),
    //策略id
    POLICY_ID("pi") ;


    private String type;

    KeyType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static KeyType getInstance(String type){
        for(KeyType key : KeyType.values()){
            if(key.getType().equals(type) ){
                return key;
            }
        }
        return null;
    }
}

