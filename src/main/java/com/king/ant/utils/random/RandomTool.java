package com.king.ant.utils.random;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * @ClassName RandomTool
 * @Description 随机字符串工具类
 * @Author Administrator
 * @Date 2019/8/7 0007 - 14:10
 * @Version 1.0
 */
public class RandomTool {

    private final static String NUM_STR = "0123456789";

    private final static String ALL_STR = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private final static String ALL_STR_UP = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private final static String ALL_STR_DOWN = "0123456789abcdefghijklmnopqrstuvwxyz";

    public static String randomNumString(int length) {
        return RandomStringUtils.random(length, NUM_STR);
    }

    public static String randomString(int length) {
        return RandomStringUtils.random(length, ALL_STR);
    }

    public static String randomUpString(int length) {
        return RandomStringUtils.random(length, ALL_STR_UP);
    }

    public static String randomDownString(int length) {
        return RandomStringUtils.random(length, ALL_STR_DOWN);
    }

}
