package com.fy.java;

/**
 * 聚合时间类型
 */
public enum AggTimeType {

    //按天统计
    BY_DAY( "by_day", 60 * 60 * 24),
    //按小时统计
    BY_HOUR("by_hour", 60 * 60),
    //按天按小时累计（每天清零）
    BY_DAY_HOUR( "by_day_hour", 60 * 60 * 24),
    //按天累计
    BY_DAY_DAY( "by_day_day", 60 * 60 * 24);

    //时间聚合格式
    private String dateFormatStr;

    //类型名称
    private String type;

    //redis中设备id的过期时间
    private int redisExpire;

    AggTimeType(String type, int redisExpire) {
        this.type = type;
        this.redisExpire = redisExpire;
    }

    public String getDateFormatStr() {
        return dateFormatStr;
    }

    public String getType() {
        return type;
    }

    public int getRedisExpire() {
        return redisExpire;
    }

    public static AggTimeType getInstance(String type){
        for(AggTimeType key : AggTimeType.values()){
            if(key.getType().equals(type) ){
                return key;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "AggTimeType{" +
                "dateFormatStr='" + dateFormatStr + '\'' +
                ", type='" + type + '\'' +
                ", redisExpire=" + redisExpire +
                '}';
    }
}
