package com.king.ant.run;

import com.king.ant.service.AutoAddRecordService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName AutoAddRecord
 * @Description 自动增加数据库记录
 * @Author Administrator
 * @Date 2019/8/9 0009 - 15:41
 * @Version 1.0
 */
@Component
public class AutoAddRecord {

    @Autowired
    private AutoAddRecordService autoAddRecordService;

    @Test
    public void addPopulationBaseRecord() {
        int number = 1000;
        autoAddRecordService.addPopulationBaseInfoRecord(number);
    }

    @Test
    public void addPopulationBirthRecord() {
        int number = 1000;
        autoAddRecordService.addPopulationBirthInfoRecord(number);
    }

    @Test
    public void addPopulationMarriageRecord() {
        int number = 1000;
        autoAddRecordService.addPopulationMarriageInfoRecord(number);
    }

    @Test
    public void addCompanyBaseRecord() {
        int number = 1000;
        autoAddRecordService.addCompanyBaseInfoRecord(number);
    }

    @Test
    public void addCompanyCorporationRecord() {
        int number = 1000;
        autoAddRecordService.addCompanyCorporationInfoRecord(number);
    }


}
