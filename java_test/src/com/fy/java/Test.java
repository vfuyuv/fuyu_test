package com.fy.java;

public class Test {
    public static void main(String[] args) {

        System.out.println(AggTimeType.BY_DAY_DAY.getDateFormatStr());
        System.out.println(AggTimeType.BY_DAY_DAY.getType());
        System.out.println(AggTimeType.BY_DAY_DAY.getRedisExpire());
        System.out.println(60*60*24);
        System.out.println(AggTimeType.BY_DAY_DAY);
        System.out.println(KeyType.POLICY);
        System.out.println(KeyType.POLICY.getType());
    }
}
