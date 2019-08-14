package com.king.ant.utils.random;

import org.apache.commons.lang3.RandomUtils;

/**
 * @ClassName TypeRandomTool
 * @Description 类型随机工具类
 * @Author Administrator
 * @Date 2019/8/14 0014 - 12:14
 * @Version 1.0
 */
public class TypeRandomTool {

    public static String randomType(String[] arr) {
        int len = arr.length;
        int index = RandomUtils.nextInt(0, len);
        return arr[index];
    }

}
