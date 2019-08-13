package com.king.ant.model.entity;

import javax.persistence.Table;
import java.util.Date;

@Table(name = "dwd_djxx_fddbrxx_f")
public class DwdDjxxFddbrxxF {
    private String uuid;

    /**
     * 内部序号
     */
    private String nbxh;

    /**
     * 姓名
     */
    private String xm;

    /**
     * 国家
     */
    private String gj;

    /**
     * 性别
     */
    private String xb;

    /**
     * 出生年月
     */
    private String csny;

    /**
     * 民族
     */
    private String mz;

    /**
     * 政治面貌
     */
    private String zzmm;

    /**
     * 户籍地址
     */
    private String hjdz;

    /**
     * 电话
     */
    private String dh;

    /**
     * 行政地址
     */
    private String xzdz;

    /**
     * 身份证件名称
     */
    private String sfzjmc;

    /**
     * 身份证件号码
     */
    private String sfzjhm;

    /**
     * 社会职务
     */
    private String shzw;

    /**
     * 职务
     */
    private String zw;

    /**
     * 人员类型
     */
    private String rylx;

    /**
     * 记录
     */
    private String jl;

    /**
     * 任命单位
     */
    private String rmdw;

    /**
     * 产生方式
     */
    private String csfs;

    /**
     * 移动电话
     */
    private String yddh;

    /**
     * 修改时间
     */
    private Date xgsj;

    /**
     * 委聘方
     */
    private String wpf;

    /**
     * 任职起始日期日期
     */
    private Date rzqsrq;

    /**
     * 任职截止日期
     */
    private Date rzjzrq;

    /**
     * 上市前状况
     */
    private String ssqzk;

    /**
     * 证件签发日期
     */
    private Date zjqfrq;

    /**
     * 证件有效日期
     */
    private Date zjyxrq;

    /**
     * 身份证换证编号
     */
    private String sfzhzbh;

    /**
     * 身份证换证机关
     */
    private String sfzhzjg;

    /**
     * 申请前职业状况
     */
    private String sqqzyzk;

    /**
     * 身份核准机关
     */
    private String sfhzjg;

    /**
     * 身份核准文件
     */
    private String sfhzwj;

    /**
     * 出生日期
     */
    private Date csrq;

    /**
     * 电子邮件地址
     */
    private String dzyjdz;

    /**
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * 获取内部序号
     *
     * @return nbxh - 内部序号
     */
    public String getNbxh() {
        return nbxh;
    }

    /**
     * 设置内部序号
     *
     * @param nbxh 内部序号
     */
    public void setNbxh(String nbxh) {
        this.nbxh = nbxh;
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
     * 获取国家
     *
     * @return gj - 国家
     */
    public String getGj() {
        return gj;
    }

    /**
     * 设置国家
     *
     * @param gj 国家
     */
    public void setGj(String gj) {
        this.gj = gj;
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
     * 获取出生年月
     *
     * @return csny - 出生年月
     */
    public String getCsny() {
        return csny;
    }

    /**
     * 设置出生年月
     *
     * @param csny 出生年月
     */
    public void setCsny(String csny) {
        this.csny = csny;
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
     * 获取户籍地址
     *
     * @return hjdz - 户籍地址
     */
    public String getHjdz() {
        return hjdz;
    }

    /**
     * 设置户籍地址
     *
     * @param hjdz 户籍地址
     */
    public void setHjdz(String hjdz) {
        this.hjdz = hjdz;
    }

    /**
     * 获取电话
     *
     * @return dh - 电话
     */
    public String getDh() {
        return dh;
    }

    /**
     * 设置电话
     *
     * @param dh 电话
     */
    public void setDh(String dh) {
        this.dh = dh;
    }

    /**
     * 获取行政地址
     *
     * @return xzdz - 行政地址
     */
    public String getXzdz() {
        return xzdz;
    }

    /**
     * 设置行政地址
     *
     * @param xzdz 行政地址
     */
    public void setXzdz(String xzdz) {
        this.xzdz = xzdz;
    }

    /**
     * 获取身份证件名称
     *
     * @return sfzjmc - 身份证件名称
     */
    public String getSfzjmc() {
        return sfzjmc;
    }

    /**
     * 设置身份证件名称
     *
     * @param sfzjmc 身份证件名称
     */
    public void setSfzjmc(String sfzjmc) {
        this.sfzjmc = sfzjmc;
    }

    /**
     * 获取身份证件号码
     *
     * @return sfzjhm - 身份证件号码
     */
    public String getSfzjhm() {
        return sfzjhm;
    }

    /**
     * 设置身份证件号码
     *
     * @param sfzjhm 身份证件号码
     */
    public void setSfzjhm(String sfzjhm) {
        this.sfzjhm = sfzjhm;
    }

    /**
     * 获取社会职务
     *
     * @return shzw - 社会职务
     */
    public String getShzw() {
        return shzw;
    }

    /**
     * 设置社会职务
     *
     * @param shzw 社会职务
     */
    public void setShzw(String shzw) {
        this.shzw = shzw;
    }

    /**
     * 获取职务
     *
     * @return zw - 职务
     */
    public String getZw() {
        return zw;
    }

    /**
     * 设置职务
     *
     * @param zw 职务
     */
    public void setZw(String zw) {
        this.zw = zw;
    }

    /**
     * 获取人员类型
     *
     * @return rylx - 人员类型
     */
    public String getRylx() {
        return rylx;
    }

    /**
     * 设置人员类型
     *
     * @param rylx 人员类型
     */
    public void setRylx(String rylx) {
        this.rylx = rylx;
    }

    /**
     * 获取记录
     *
     * @return jl - 记录
     */
    public String getJl() {
        return jl;
    }

    /**
     * 设置记录
     *
     * @param jl 记录
     */
    public void setJl(String jl) {
        this.jl = jl;
    }

    /**
     * 获取任命单位
     *
     * @return rmdw - 任命单位
     */
    public String getRmdw() {
        return rmdw;
    }

    /**
     * 设置任命单位
     *
     * @param rmdw 任命单位
     */
    public void setRmdw(String rmdw) {
        this.rmdw = rmdw;
    }

    /**
     * 获取产生方式
     *
     * @return csfs - 产生方式
     */
    public String getCsfs() {
        return csfs;
    }

    /**
     * 设置产生方式
     *
     * @param csfs 产生方式
     */
    public void setCsfs(String csfs) {
        this.csfs = csfs;
    }

    /**
     * 获取移动电话
     *
     * @return yddh - 移动电话
     */
    public String getYddh() {
        return yddh;
    }

    /**
     * 设置移动电话
     *
     * @param yddh 移动电话
     */
    public void setYddh(String yddh) {
        this.yddh = yddh;
    }

    /**
     * 获取修改时间
     *
     * @return xgsj - 修改时间
     */
    public Date getXgsj() {
        return xgsj;
    }

    /**
     * 设置修改时间
     *
     * @param xgsj 修改时间
     */
    public void setXgsj(Date xgsj) {
        this.xgsj = xgsj;
    }

    /**
     * 获取委聘方
     *
     * @return wpf - 委聘方
     */
    public String getWpf() {
        return wpf;
    }

    /**
     * 设置委聘方
     *
     * @param wpf 委聘方
     */
    public void setWpf(String wpf) {
        this.wpf = wpf;
    }

    /**
     * 获取任职起始日期日期
     *
     * @return rzqsrq - 任职起始日期日期
     */
    public Date getRzqsrq() {
        return rzqsrq;
    }

    /**
     * 设置任职起始日期日期
     *
     * @param rzqsrq 任职起始日期日期
     */
    public void setRzqsrq(Date rzqsrq) {
        this.rzqsrq = rzqsrq;
    }

    /**
     * 获取任职截止日期
     *
     * @return rzjzrq - 任职截止日期
     */
    public Date getRzjzrq() {
        return rzjzrq;
    }

    /**
     * 设置任职截止日期
     *
     * @param rzjzrq 任职截止日期
     */
    public void setRzjzrq(Date rzjzrq) {
        this.rzjzrq = rzjzrq;
    }

    /**
     * 获取上市前状况
     *
     * @return ssqzk - 上市前状况
     */
    public String getSsqzk() {
        return ssqzk;
    }

    /**
     * 设置上市前状况
     *
     * @param ssqzk 上市前状况
     */
    public void setSsqzk(String ssqzk) {
        this.ssqzk = ssqzk;
    }

    /**
     * 获取证件签发日期
     *
     * @return zjqfrq - 证件签发日期
     */
    public Date getZjqfrq() {
        return zjqfrq;
    }

    /**
     * 设置证件签发日期
     *
     * @param zjqfrq 证件签发日期
     */
    public void setZjqfrq(Date zjqfrq) {
        this.zjqfrq = zjqfrq;
    }

    /**
     * 获取证件有效日期
     *
     * @return zjyxrq - 证件有效日期
     */
    public Date getZjyxrq() {
        return zjyxrq;
    }

    /**
     * 设置证件有效日期
     *
     * @param zjyxrq 证件有效日期
     */
    public void setZjyxrq(Date zjyxrq) {
        this.zjyxrq = zjyxrq;
    }

    /**
     * 获取身份证换证编号
     *
     * @return sfzhzbh - 身份证换证编号
     */
    public String getSfzhzbh() {
        return sfzhzbh;
    }

    /**
     * 设置身份证换证编号
     *
     * @param sfzhzbh 身份证换证编号
     */
    public void setSfzhzbh(String sfzhzbh) {
        this.sfzhzbh = sfzhzbh;
    }

    /**
     * 获取身份证换证机关
     *
     * @return sfzhzjg - 身份证换证机关
     */
    public String getSfzhzjg() {
        return sfzhzjg;
    }

    /**
     * 设置身份证换证机关
     *
     * @param sfzhzjg 身份证换证机关
     */
    public void setSfzhzjg(String sfzhzjg) {
        this.sfzhzjg = sfzhzjg;
    }

    /**
     * 获取申请前职业状况
     *
     * @return sqqzyzk - 申请前职业状况
     */
    public String getSqqzyzk() {
        return sqqzyzk;
    }

    /**
     * 设置申请前职业状况
     *
     * @param sqqzyzk 申请前职业状况
     */
    public void setSqqzyzk(String sqqzyzk) {
        this.sqqzyzk = sqqzyzk;
    }

    /**
     * 获取身份核准机关
     *
     * @return sfhzjg - 身份核准机关
     */
    public String getSfhzjg() {
        return sfhzjg;
    }

    /**
     * 设置身份核准机关
     *
     * @param sfhzjg 身份核准机关
     */
    public void setSfhzjg(String sfhzjg) {
        this.sfhzjg = sfhzjg;
    }

    /**
     * 获取身份核准文件
     *
     * @return sfhzwj - 身份核准文件
     */
    public String getSfhzwj() {
        return sfhzwj;
    }

    /**
     * 设置身份核准文件
     *
     * @param sfhzwj 身份核准文件
     */
    public void setSfhzwj(String sfhzwj) {
        this.sfhzwj = sfhzwj;
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
     * 获取电子邮件地址
     *
     * @return dzyjdz - 电子邮件地址
     */
    public String getDzyjdz() {
        return dzyjdz;
    }

    /**
     * 设置电子邮件地址
     *
     * @param dzyjdz 电子邮件地址
     */
    public void setDzyjdz(String dzyjdz) {
        this.dzyjdz = dzyjdz;
    }
}