package com.king.ant.service.impl;

import com.king.ant.dao.*;
import com.king.ant.model.entity.*;
import com.king.ant.service.AutoAddRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @ClassName AutoAddRecordServiceImpl
 * @Description 自动增加数据库记录接口实现类
 * @Author Administrator
 * @Date 2019/8/9 0009 - 15:42
 * @Version 1.0
 */
@Service
public class AutoAddRecordServiceImpl implements AutoAddRecordService {

    @Resource
    private DwdJbxxJbdjxxInfoMapper populationBaseMapper;
    @Resource
    private DwdJbxxCsxxMapper populationBirthMapper;
    @Resource
    private DwdJbxxHygxMapper populationMarriageMapper;

    @Resource
    private DwdDjxxFrdjxxFMapper companyBaseMapper;
    @Resource
    private DwdDjxxFddbrxxFMapper companyCorporationMapper;

    @Override
    public void addPopulationBaseInfoRecord(int number) {
        DwdJbxxJbdjxxInfo baseInfo = new DwdJbxxJbdjxxInfo();
    }

    @Override
    public void addPopulationBirthInfoRecord(int number) {
        DwdJbxxCsxx birthInfo = new DwdJbxxCsxx();
    }

    @Override
    public void addPopulationMarriageInfoRecord(int number) {
        DwdJbxxHygx marriageInfo = new DwdJbxxHygx();
    }

    @Override
    public void addCompanyBaseInfoRecord(int number) {
        DwdDjxxFrdjxxF companyBaseInfo = new DwdDjxxFrdjxxF();
    }

    @Override
    public void addCompanyCorporationInfoRecord(int number) {
        DwdDjxxFddbrxxF companyCorporationInfo = new DwdDjxxFddbrxxF();
    }
}
