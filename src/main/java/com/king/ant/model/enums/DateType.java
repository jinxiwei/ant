package com.king.ant.model.enums;

/**
 * @ClassName DateType
 * @Description 时间类型枚举类
 * @Author Administrator
 * @Date 2019/8/10 0010 - 11:55
 * @Version 1.0
 */
public enum DateType {

    YEAR(1),MONTH(2),DAYS(3);

    private Integer value;

    DateType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
