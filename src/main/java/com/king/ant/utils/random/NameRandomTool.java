package com.king.ant.utils.random;

import org.apache.commons.lang3.RandomUtils;

/**
 * @ClassName NameRandomTool
 * @Description 名称随机生成工具类
 * @Author Administrator
 * @Date 2019/8/10 0010 - 12:18
 * @Version 1.0
 */
public class NameRandomTool {

    private final static Integer MAX_NAME_LENGTH = 50;

    public static String randomUsername(int length) {
        int nameLength = RandomUtils.nextInt(0, MAX_NAME_LENGTH);// 随机生成名称长度
        return RandomTool.randomString(nameLength);// 返回随机生成用户名
    }

    public static String randomRealName() {
        return null;
    }

    public static String randomOrganName() {
        return null;
    }


}
