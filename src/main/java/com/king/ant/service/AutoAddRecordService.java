package com.king.ant.service;

/**
 * @ClassName AutoAddRecordService
 * @Description 自动增加数据库服务接口
 * @Author Administrator
 * @Date 2019/8/9 0009 - 15:42
 * @Version 1.0
 */
public interface AutoAddRecordService {

    /**
     * 增加人口库基本信息表记录
     *
     * @param number 新增记录数量
     */
    void addPopulationBaseInfoRecord(int number);

    /**
     * 增加人口库出生信息表记录
     *
     * @param number 新增记录数量
     */
    void addPopulationBirthInfoRecord(int number);

    /**
     * 增加人口库婚姻信息表记录
     *
     * @param number 新增记录数量
     */
    void addPopulationMarriageInfoRecord(int number);

    /**
     * 增加法人库基础信息表记录
     *
     * @param number 新增记录数量
     */
    void addCompanyBaseInfoRecord(int number);

    /**
     * 增加法人库法人信息表记录
     *
     * @param number 新增记录数量
     */
    void addCompanyCorporationInfoRecord(int number);

}
