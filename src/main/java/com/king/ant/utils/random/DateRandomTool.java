package com.king.ant.utils.random;

import com.king.ant.model.enums.DateType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName DateRandomTool
 * @Description 生成随机时间
 * @Author Administrator
 * @Date 2019/8/10 0010 - 11:16
 * @Version 1.0
 */
public class DateRandomTool {

    private static final Logger logger = LoggerFactory.getLogger(DateRandomTool.class);

    /**
     * 向前获取随机时间
     *
     * @param num
     * @param dateType
     * @return
     * @throws Exception
     */
    public static Date randomDateBefore(int num, DateType dateType) throws Exception {
        Calendar cl = Calendar.getInstance();
        Date nowDate = new Date();
        cl.setTime(nowDate);// 设定当前时间到日历
        int n;
        switch (dateType) {
            case YEAR:
                n = cl.get(Calendar.YEAR);
                cl.set(Calendar.YEAR, n - num);
                break;
            case MONTH:
                n = cl.get(Calendar.MONTH);
                cl.set(Calendar.MONTH, n - num);
                break;
            case DAYS:
                n = cl.get(Calendar.DAY_OF_YEAR);
                cl.set(Calendar.DAY_OF_YEAR, n - num);
                break;
            default:
                logger.error("时间类型错误");
                throw new Exception();
        }
        Date startDate = cl.getTime();// 获取时间范围的起始
        return randomDate(startDate, nowDate);
    }

    /**
     * 向后获取随机时间
     *
     * @param num
     * @param dateType
     * @return
     * @throws Exception
     */
    public static Date randomDateAfter(int num, DateType dateType) throws Exception {
        Calendar cl = Calendar.getInstance();
        Date nowDate = new Date();
        cl.setTime(nowDate);// 设定当前时间到日历
        int n;
        switch (dateType) {
            case YEAR:
                n = cl.get(Calendar.YEAR);
                cl.set(Calendar.YEAR, n + num);
                break;
            case MONTH:
                n = cl.get(Calendar.MONTH);
                cl.set(Calendar.MONTH, n + num);
                break;
            case DAYS:
                n = cl.get(Calendar.DAY_OF_YEAR);
                cl.set(Calendar.DAY_OF_YEAR, n + num);
                break;
            default:
                logger.error("时间类型错误");
                throw new Exception();
        }
        Date endDate = cl.getTime();// 获取时间范围的结束
        return randomDate(nowDate, endDate);
    }

    /**
     * 获取时间段内的随机时间
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static Date randomDate(Date startDate, Date endDate) {
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long resultTime = startTime + (long) (Math.random() * (endTime - startTime));
        if (resultTime == startTime || resultTime == endTime) {
            return randomDate(startDate, endDate);
        }
        return new Date(resultTime);
    }

}
