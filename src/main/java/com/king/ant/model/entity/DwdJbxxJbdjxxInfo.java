package com.king.ant.model.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "dwd_jbxx_jbdjxx_info")
public class DwdJbxxJbdjxxInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 数据日期
     */
    private Date sjrq;

    /**
     * 证件类别
     */
    private String zjlb;

    /**
     * 证件号码
     */
    private String zjhm;

    /**
     * 常住流动类型
     */
    private String czldlx;

    /**
     * 姓名
     */
    private String xm;

    /**
     * 曾用名
     */
    private String cym;

    /**
     * 性别
     */
    private String xb;

    /**
     * 民族
     */
    private String mz;

    /**
     * 出生日期
     */
    private Date csrq;

    /**
     * 国籍
     */
    private String gj;

    /**
     * 出生地国家和地区
     */
    private String csdgjhdq;

    /**
     * 出生地省市县
     */
    private String csdssx;

    /**
     * 政治面貌
     */
    private String zzmm;

    /**
     * 宗教信仰
     */
    private String zjxy;

    /**
     * 兵役情况
     */
    private String byzk;

    /**
     * 英文姓名
     */
    private String ywxm;

    /**
     * 姓名中文拼音
     */
    private String xmzwpy;

    /**
     * 姓名（名）
     */
    private String xmm;

    /**
     * 姓名（姓）
     */
    private String xmx;

    /**
     * 运行时间
     */
    private Date yxsj;

    /**
     * 户口所在区县
     */
    private String sfqhdm;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取数据日期
     *
     * @return sjrq - 数据日期
     */
    public Date getSjrq() {
        return sjrq;
    }

    /**
     * 设置数据日期
     *
     * @param sjrq 数据日期
     */
    public void setSjrq(Date sjrq) {
        this.sjrq = sjrq;
    }

    /**
     * 获取证件类别
     *
     * @return zjlb - 证件类别
     */
    public String getZjlb() {
        return zjlb;
    }

    /**
     * 设置证件类别
     *
     * @param zjlb 证件类别
     */
    public void setZjlb(String zjlb) {
        this.zjlb = zjlb;
    }

    /**
     * 获取证件号码
     *
     * @return zjhm - 证件号码
     */
    public String getZjhm() {
        return zjhm;
    }

    /**
     * 设置证件号码
     *
     * @param zjhm 证件号码
     */
    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    /**
     * 获取常住流动类型
     *
     * @return czldlx - 常住流动类型
     */
    public String getCzldlx() {
        return czldlx;
    }

    /**
     * 设置常住流动类型
     *
     * @param czldlx 常住流动类型
     */
    public void setCzldlx(String czldlx) {
        this.czldlx = czldlx;
    }

    /**
     * 获取姓名
     *
     * @return xm - 姓名
     */
    public String getXm() {
        return xm;
    }

    /**
     * 设置姓名
     *
     * @param xm 姓名
     */
    public void setXm(String xm) {
        this.xm = xm;
    }

    /**
     * 获取曾用名
     *
     * @return cym - 曾用名
     */
    public String getCym() {
        return cym;
    }

    /**
     * 设置曾用名
     *
     * @param cym 曾用名
     */
    public void setCym(String cym) {
        this.cym = cym;
    }

    /**
     * 获取性别
     *
     * @return xb - 性别
     */
    public String getXb() {
        return xb;
    }

    /**
     * 设置性别
     *
     * @param xb 性别
     */
    public void setXb(String xb) {
        this.xb = xb;
    }

    /**
     * 获取民族
     *
     * @return mz - 民族
     */
    public String getMz() {
        return mz;
    }

    /**
     * 设置民族
     *
     * @param mz 民族
     */
    public void setMz(String mz) {
        this.mz = mz;
    }

    /**
     * 获取出生日期
     *
     * @return csrq - 出生日期
     */
    public Date getCsrq() {
        return csrq;
    }

    /**
     * 设置出生日期
     *
     * @param csrq 出生日期
     */
    public void setCsrq(Date csrq) {
        this.csrq = csrq;
    }

    /**
     * 获取国籍
     *
     * @return gj - 国籍
     */
    public String getGj() {
        return gj;
    }

    /**
     * 设置国籍
     *
     * @param gj 国籍
     */
    public void setGj(String gj) {
        this.gj = gj;
    }

    /**
     * 获取出生地国家和地区
     *
     * @return csdgjhdq - 出生地国家和地区
     */
    public String getCsdgjhdq() {
        return csdgjhdq;
    }

    /**
     * 设置出生地国家和地区
     *
     * @param csdgjhdq 出生地国家和地区
     */
    public void setCsdgjhdq(String csdgjhdq) {
        this.csdgjhdq = csdgjhdq;
    }

    /**
     * 获取出生地省市县
     *
     * @return csdssx - 出生地省市县
     */
    public String getCsdssx() {
        return csdssx;
    }

    /**
     * 设置出生地省市县
     *
     * @param csdssx 出生地省市县
     */
    public void setCsdssx(String csdssx) {
        this.csdssx = csdssx;
    }

    /**
     * 获取政治面貌
     *
     * @return zzmm - 政治面貌
     */
    public String getZzmm() {
        return zzmm;
    }

    /**
     * 设置政治面貌
     *
     * @param zzmm 政治面貌
     */
    public void setZzmm(String zzmm) {
        this.zzmm = zzmm;
    }

    /**
     * 获取宗教信仰
     *
     * @return zjxy - 宗教信仰
     */
    public String getZjxy() {
        return zjxy;
    }

    /**
     * 设置宗教信仰
     *
     * @param zjxy 宗教信仰
     */
    public void setZjxy(String zjxy) {
        this.zjxy = zjxy;
    }

    /**
     * 获取兵役情况
     *
     * @return byzk - 兵役情况
     */
    public String getByzk() {
        return byzk;
    }

    /**
     * 设置兵役情况
     *
     * @param byzk 兵役情况
     */
    public void setByzk(String byzk) {
        this.byzk = byzk;
    }

    /**
     * 获取英文姓名
     *
     * @return ywxm - 英文姓名
     */
    public String getYwxm() {
        return ywxm;
    }

    /**
     * 设置英文姓名
     *
     * @param ywxm 英文姓名
     */
    public void setYwxm(String ywxm) {
        this.ywxm = ywxm;
    }

    /**
     * 获取姓名中文拼音
     *
     * @return xmzwpy - 姓名中文拼音
     */
    public String getXmzwpy() {
        return xmzwpy;
    }

    /**
     * 设置姓名中文拼音
     *
     * @param xmzwpy 姓名中文拼音
     */
    public void setXmzwpy(String xmzwpy) {
        this.xmzwpy = xmzwpy;
    }

    /**
     * 获取姓名（名）
     *
     * @return xmm - 姓名（名）
     */
    public String getXmm() {
        return xmm;
    }

    /**
     * 设置姓名（名）
     *
     * @param xmm 姓名（名）
     */
    public void setXmm(String xmm) {
        this.xmm = xmm;
    }

    /**
     * 获取姓名（姓）
     *
     * @return xmx - 姓名（姓）
     */
    public String getXmx() {
        return xmx;
    }

    /**
     * 设置姓名（姓）
     *
     * @param xmx 姓名（姓）
     */
    public void setXmx(String xmx) {
        this.xmx = xmx;
    }

    /**
     * 获取运行时间
     *
     * @return yxsj - 运行时间
     */
    public Date getYxsj() {
        return yxsj;
    }

    /**
     * 设置运行时间
     *
     * @param yxsj 运行时间
     */
    public void setYxsj(Date yxsj) {
        this.yxsj = yxsj;
    }

    /**
     * 获取户口所在区县
     *
     * @return sfqhdm - 户口所在区县
     */
    public String getSfqhdm() {
        return sfqhdm;
    }

    /**
     * 设置户口所在区县
     *
     * @param sfqhdm 户口所在区县
     */
    public void setSfqhdm(String sfqhdm) {
        this.sfqhdm = sfqhdm;
    }
}