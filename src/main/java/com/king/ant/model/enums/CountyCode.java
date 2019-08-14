package com.king.ant.model.enums;

/**
 * @ClassName CountyCode
 * @Description 区县代码枚举类
 * @Author Administrator
 * @Date 2019/8/9 0009 - 16:08
 * @Version 1.0
 */
public enum CountyCode {

    YZQ("650502", "伊州区"),
    YWX("652223", "伊吾县"),
    ZZQ("652222", "巴里坤县"),
    OTHER("-1", "其他");

    private String code;
    private String desc;

    CountyCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Boolean equals(String code) {
        return this.code.equals(code);
    }

    public static CountyCode valuesOf(String code) {
        CountyCode countyCode;
        switch (code) {
            case "650502":
                countyCode = YZQ;
                break;
            case "652223":
                countyCode = YWX;
                break;
            case "652222":
                countyCode = ZZQ;
                break;
            default:
                countyCode = OTHER;
        }
        return countyCode;
    }

    public static String[] toArray() {
        String[] arr = new String[3];
        arr[0] = YZQ.getCode();
        arr[1] = YWX.getCode();
        arr[2] = ZZQ.getCode();
        return arr;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
