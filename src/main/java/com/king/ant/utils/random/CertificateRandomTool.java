package com.king.ant.utils.random;

import com.king.ant.model.enums.CountyCode;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName CertificateRandomTool
 * @Description 证件信息随机生成工具类
 * @Author Administrator
 * @Date 2019/8/10 0010 - 12:21
 * @Version 1.0
 */
public class CertificateRandomTool {

    public static String randomIdCardNo() {
        String prefix = TypeRandomTool.randomType(CountyCode.toArray());// 身份证6位前缀
        Calendar cl = Calendar.getInstance();
        cl.set(Calendar.YEAR, 1910);
        Date birthDay = DateRandomTool.randomDate(cl.getTime(), new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String birthStr = sdf.format(birthDay);// 8位出生日期
        String suffix = RandomTool.randomNumString(4);// 随机生成后4位
        return prefix + birthStr + suffix;// 返回18位的身份证号码
    }

}
