package com.king.ant.model.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "dwd_jbxx_csxx")
public class DwdJbxxCsxx {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 数据日期
     */
    private Date sjrq;

    /**
     * 出生医学证明编号
     */
    private String csyxzmbh;

    /**
     * 出生医学证明版本
     */
    private String csyxzmbb;

    /**
     * 新生儿姓名
     */
    private String xsexm;

    /**
     * 身份证件类别
     */
    private String sfzjlb;

    /**
     * 身份证件号码
     */
    private String sfzjhm;

    /**
     * 出生医学证明父亲身份证件类别
     */
    private String fqsfzjlb;

    /**
     * 出生医学证明父亲身份证号
     */
    private String fqsfzh;

    /**
     * 出生医学证明母亲身份证件类别
     */
    private String mqsfzjlb;

    /**
     * 出生医学证明母亲身份证号
     */
    private String mqsfzh;

    /**
     * 出生医学证明签发日期
     */
    private Date csyxzmqfrq;

    /**
     * 出生医学证明签发机构
     */
    private String csyxzmqfjg;

    /**
     * 出生地行政区划详址
     */
    private String csdxzqyxz;

    /**
     * 出生医学证明签名公钥值
     */
    private String csyxznqngyz;

    /**
     * 出生医学证明签名摘要
     */
    private String csyxzqmzy;

    /**
     * 出生医学证明签名值
     */
    private String csyxzmqmz;

    /**
     * 出生医学证明时间戳签名值
     */
    private String csyxzmsjcqmz;

    /**
     * 出生档案编号
     */
    private String csdabh;

    /**
     * 出生孕周
     */
    private Integer csyz;

    /**
     * 出生时间
     */
    private Date cssj;

    /**
     * 分娩方式
     */
    private String fmfs;

    /**
     * 出生体重
     */
    private BigDecimal cstz;

    /**
     * 出生身长
     */
    private BigDecimal cssc;

    /**
     * 出生健康状况
     */
    private String csjkzk;

    /**
     * 出生地点
     */
    private String csdd;

    /**
     * 出生胎次
     */
    private Integer cstc;

    /**
     * 孕产妇产次
     */
    private String ycfcc;

    /**
     * 是否高危妊娠
     */
    private String sfgwrs;

    /**
     * 孕产妇健康状况
     */
    private String ycfjkzk;

    /**
     * 是否有出生缺陷
     */
    private String sfycsqx;

    /**
     * 来源表
     */
    private String lyb;

    /**
     * 来源机构
     */
    private String lyjg;

    /**
     * 运行时间
     */
    private Date yxsj;

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
     * 获取出生医学证明编号
     *
     * @return csyxzmbh - 出生医学证明编号
     */
    public String getCsyxzmbh() {
        return csyxzmbh;
    }

    /**
     * 设置出生医学证明编号
     *
     * @param csyxzmbh 出生医学证明编号
     */
    public void setCsyxzmbh(String csyxzmbh) {
        this.csyxzmbh = csyxzmbh;
    }

    /**
     * 获取出生医学证明版本
     *
     * @return csyxzmbb - 出生医学证明版本
     */
    public String getCsyxzmbb() {
        return csyxzmbb;
    }

    /**
     * 设置出生医学证明版本
     *
     * @param csyxzmbb 出生医学证明版本
     */
    public void setCsyxzmbb(String csyxzmbb) {
        this.csyxzmbb = csyxzmbb;
    }

    /**
     * 获取新生儿姓名
     *
     * @return xsexm - 新生儿姓名
     */
    public String getXsexm() {
        return xsexm;
    }

    /**
     * 设置新生儿姓名
     *
     * @param xsexm 新生儿姓名
     */
    public void setXsexm(String xsexm) {
        this.xsexm = xsexm;
    }

    /**
     * 获取身份证件类别
     *
     * @return sfzjlb - 身份证件类别
     */
    public String getSfzjlb() {
        return sfzjlb;
    }

    /**
     * 设置身份证件类别
     *
     * @param sfzjlb 身份证件类别
     */
    public void setSfzjlb(String sfzjlb) {
        this.sfzjlb = sfzjlb;
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
     * 获取出生医学证明父亲身份证件类别
     *
     * @return fqsfzjlb - 出生医学证明父亲身份证件类别
     */
    public String getFqsfzjlb() {
        return fqsfzjlb;
    }

    /**
     * 设置出生医学证明父亲身份证件类别
     *
     * @param fqsfzjlb 出生医学证明父亲身份证件类别
     */
    public void setFqsfzjlb(String fqsfzjlb) {
        this.fqsfzjlb = fqsfzjlb;
    }

    /**
     * 获取出生医学证明父亲身份证号
     *
     * @return fqsfzh - 出生医学证明父亲身份证号
     */
    public String getFqsfzh() {
        return fqsfzh;
    }

    /**
     * 设置出生医学证明父亲身份证号
     *
     * @param fqsfzh 出生医学证明父亲身份证号
     */
    public void setFqsfzh(String fqsfzh) {
        this.fqsfzh = fqsfzh;
    }

    /**
     * 获取出生医学证明母亲身份证件类别
     *
     * @return mqsfzjlb - 出生医学证明母亲身份证件类别
     */
    public String getMqsfzjlb() {
        return mqsfzjlb;
    }

    /**
     * 设置出生医学证明母亲身份证件类别
     *
     * @param mqsfzjlb 出生医学证明母亲身份证件类别
     */
    public void setMqsfzjlb(String mqsfzjlb) {
        this.mqsfzjlb = mqsfzjlb;
    }

    /**
     * 获取出生医学证明母亲身份证号
     *
     * @return mqsfzh - 出生医学证明母亲身份证号
     */
    public String getMqsfzh() {
        return mqsfzh;
    }

    /**
     * 设置出生医学证明母亲身份证号
     *
     * @param mqsfzh 出生医学证明母亲身份证号
     */
    public void setMqsfzh(String mqsfzh) {
        this.mqsfzh = mqsfzh;
    }

    /**
     * 获取出生医学证明签发日期
     *
     * @return csyxzmqfrq - 出生医学证明签发日期
     */
    public Date getCsyxzmqfrq() {
        return csyxzmqfrq;
    }

    /**
     * 设置出生医学证明签发日期
     *
     * @param csyxzmqfrq 出生医学证明签发日期
     */
    public void setCsyxzmqfrq(Date csyxzmqfrq) {
        this.csyxzmqfrq = csyxzmqfrq;
    }

    /**
     * 获取出生医学证明签发机构
     *
     * @return csyxzmqfjg - 出生医学证明签发机构
     */
    public String getCsyxzmqfjg() {
        return csyxzmqfjg;
    }

    /**
     * 设置出生医学证明签发机构
     *
     * @param csyxzmqfjg 出生医学证明签发机构
     */
    public void setCsyxzmqfjg(String csyxzmqfjg) {
        this.csyxzmqfjg = csyxzmqfjg;
    }

    /**
     * 获取出生地行政区划详址
     *
     * @return csdxzqyxz - 出生地行政区划详址
     */
    public String getCsdxzqyxz() {
        return csdxzqyxz;
    }

    /**
     * 设置出生地行政区划详址
     *
     * @param csdxzqyxz 出生地行政区划详址
     */
    public void setCsdxzqyxz(String csdxzqyxz) {
        this.csdxzqyxz = csdxzqyxz;
    }

    /**
     * 获取出生医学证明签名公钥值
     *
     * @return csyxznqngyz - 出生医学证明签名公钥值
     */
    public String getCsyxznqngyz() {
        return csyxznqngyz;
    }

    /**
     * 设置出生医学证明签名公钥值
     *
     * @param csyxznqngyz 出生医学证明签名公钥值
     */
    public void setCsyxznqngyz(String csyxznqngyz) {
        this.csyxznqngyz = csyxznqngyz;
    }

    /**
     * 获取出生医学证明签名摘要
     *
     * @return csyxzqmzy - 出生医学证明签名摘要
     */
    public String getCsyxzqmzy() {
        return csyxzqmzy;
    }

    /**
     * 设置出生医学证明签名摘要
     *
     * @param csyxzqmzy 出生医学证明签名摘要
     */
    public void setCsyxzqmzy(String csyxzqmzy) {
        this.csyxzqmzy = csyxzqmzy;
    }

    /**
     * 获取出生医学证明签名值
     *
     * @return csyxzmqmz - 出生医学证明签名值
     */
    public String getCsyxzmqmz() {
        return csyxzmqmz;
    }

    /**
     * 设置出生医学证明签名值
     *
     * @param csyxzmqmz 出生医学证明签名值
     */
    public void setCsyxzmqmz(String csyxzmqmz) {
        this.csyxzmqmz = csyxzmqmz;
    }

    /**
     * 获取出生医学证明时间戳签名值
     *
     * @return csyxzmsjcqmz - 出生医学证明时间戳签名值
     */
    public String getCsyxzmsjcqmz() {
        return csyxzmsjcqmz;
    }

    /**
     * 设置出生医学证明时间戳签名值
     *
     * @param csyxzmsjcqmz 出生医学证明时间戳签名值
     */
    public void setCsyxzmsjcqmz(String csyxzmsjcqmz) {
        this.csyxzmsjcqmz = csyxzmsjcqmz;
    }

    /**
     * 获取出生档案编号
     *
     * @return csdabh - 出生档案编号
     */
    public String getCsdabh() {
        return csdabh;
    }

    /**
     * 设置出生档案编号
     *
     * @param csdabh 出生档案编号
     */
    public void setCsdabh(String csdabh) {
        this.csdabh = csdabh;
    }

    /**
     * 获取出生孕周
     *
     * @return csyz - 出生孕周
     */
    public Integer getCsyz() {
        return csyz;
    }

    /**
     * 设置出生孕周
     *
     * @param csyz 出生孕周
     */
    public void setCsyz(Integer csyz) {
        this.csyz = csyz;
    }

    /**
     * 获取出生时间
     *
     * @return cssj - 出生时间
     */
    public Date getCssj() {
        return cssj;
    }

    /**
     * 设置出生时间
     *
     * @param cssj 出生时间
     */
    public void setCssj(Date cssj) {
        this.cssj = cssj;
    }

    /**
     * 获取分娩方式
     *
     * @return fmfs - 分娩方式
     */
    public String getFmfs() {
        return fmfs;
    }

    /**
     * 设置分娩方式
     *
     * @param fmfs 分娩方式
     */
    public void setFmfs(String fmfs) {
        this.fmfs = fmfs;
    }

    /**
     * 获取出生体重
     *
     * @return cstz - 出生体重
     */
    public BigDecimal getCstz() {
        return cstz;
    }

    /**
     * 设置出生体重
     *
     * @param cstz 出生体重
     */
    public void setCstz(BigDecimal cstz) {
        this.cstz = cstz;
    }

    /**
     * 获取出生身长
     *
     * @return cssc - 出生身长
     */
    public BigDecimal getCssc() {
        return cssc;
    }

    /**
     * 设置出生身长
     *
     * @param cssc 出生身长
     */
    public void setCssc(BigDecimal cssc) {
        this.cssc = cssc;
    }

    /**
     * 获取出生健康状况
     *
     * @return csjkzk - 出生健康状况
     */
    public String getCsjkzk() {
        return csjkzk;
    }

    /**
     * 设置出生健康状况
     *
     * @param csjkzk 出生健康状况
     */
    public void setCsjkzk(String csjkzk) {
        this.csjkzk = csjkzk;
    }

    /**
     * 获取出生地点
     *
     * @return csdd - 出生地点
     */
    public String getCsdd() {
        return csdd;
    }

    /**
     * 设置出生地点
     *
     * @param csdd 出生地点
     */
    public void setCsdd(String csdd) {
        this.csdd = csdd;
    }

    /**
     * 获取出生胎次
     *
     * @return cstc - 出生胎次
     */
    public Integer getCstc() {
        return cstc;
    }

    /**
     * 设置出生胎次
     *
     * @param cstc 出生胎次
     */
    public void setCstc(Integer cstc) {
        this.cstc = cstc;
    }

    /**
     * 获取孕产妇产次
     *
     * @return ycfcc - 孕产妇产次
     */
    public String getYcfcc() {
        return ycfcc;
    }

    /**
     * 设置孕产妇产次
     *
     * @param ycfcc 孕产妇产次
     */
    public void setYcfcc(String ycfcc) {
        this.ycfcc = ycfcc;
    }

    /**
     * 获取是否高危妊娠
     *
     * @return sfgwrs - 是否高危妊娠
     */
    public String getSfgwrs() {
        return sfgwrs;
    }

    /**
     * 设置是否高危妊娠
     *
     * @param sfgwrs 是否高危妊娠
     */
    public void setSfgwrs(String sfgwrs) {
        this.sfgwrs = sfgwrs;
    }

    /**
     * 获取孕产妇健康状况
     *
     * @return ycfjkzk - 孕产妇健康状况
     */
    public String getYcfjkzk() {
        return ycfjkzk;
    }

    /**
     * 设置孕产妇健康状况
     *
     * @param ycfjkzk 孕产妇健康状况
     */
    public void setYcfjkzk(String ycfjkzk) {
        this.ycfjkzk = ycfjkzk;
    }

    /**
     * 获取是否有出生缺陷
     *
     * @return sfycsqx - 是否有出生缺陷
     */
    public String getSfycsqx() {
        return sfycsqx;
    }

    /**
     * 设置是否有出生缺陷
     *
     * @param sfycsqx 是否有出生缺陷
     */
    public void setSfycsqx(String sfycsqx) {
        this.sfycsqx = sfycsqx;
    }

    /**
     * 获取来源表
     *
     * @return lyb - 来源表
     */
    public String getLyb() {
        return lyb;
    }

    /**
     * 设置来源表
     *
     * @param lyb 来源表
     */
    public void setLyb(String lyb) {
        this.lyb = lyb;
    }

    /**
     * 获取来源机构
     *
     * @return lyjg - 来源机构
     */
    public String getLyjg() {
        return lyjg;
    }

    /**
     * 设置来源机构
     *
     * @param lyjg 来源机构
     */
    public void setLyjg(String lyjg) {
        this.lyjg = lyjg;
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

}