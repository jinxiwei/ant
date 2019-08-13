package com.king.ant.utils.random;

import org.apache.commons.lang3.RandomUtils;

/**
 * @ClassName CertificateRandomTool
 * @Description 证件信息随机生成工具类
 * @Author Administrator
 * @Date 2019/8/10 0010 - 12:21
 * @Version 1.0
 */
public class CertificateRandomTool {

    public static String randomType(String[] arr) {
        int len = arr.length;
        int index = RandomUtils.nextInt(0, len);
        return arr[index];
    }

    public static String randomIdCardNo() {
        return null;
    }

}
