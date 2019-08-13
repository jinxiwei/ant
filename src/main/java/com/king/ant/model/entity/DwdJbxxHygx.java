package com.king.ant.model.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "dwd_jbxx_hygx")
public class DwdJbxxHygx {
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
     * 姓名
     */
    private String xm;

    /**
     * 婚姻关系
     */
    private String hygx;

    /**
     * 配偶姓名
     */
    private String poxm;

    /**
     * 配偶证件类型
     */
    private String pozjlb;

    /**
     * 配偶证件号码
     */
    private String pozjhm;

    /**
     * 结离婚关系号
     */
    private String jlhgxh;

    /**
     * 结离婚登记日期
     */
    private Date jlhdjrq;

    /**
     * 来源机构
     */
    private String lyjg;

    /**
     * 来源表
     */
    private String lyb;

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
     * 获取婚姻关系
     *
     * @return hygx - 婚姻关系
     */
    public String getHygx() {
        return hygx;
    }

    /**
     * 设置婚姻关系
     *
     * @param hygx 婚姻关系
     */
    public void setHygx(String hygx) {
        this.hygx = hygx;
    }

    /**
     * 获取配偶姓名
     *
     * @return poxm - 配偶姓名
     */
    public String getPoxm() {
        return poxm;
    }

    /**
     * 设置配偶姓名
     *
     * @param poxm 配偶姓名
     */
    public void setPoxm(String poxm) {
        this.poxm = poxm;
    }

    /**
     * 获取配偶证件类型
     *
     * @return pozjlb - 配偶证件类型
     */
    public String getPozjlb() {
        return pozjlb;
    }

    /**
     * 设置配偶证件类型
     *
     * @param pozjlb 配偶证件类型
     */
    public void setPozjlb(String pozjlb) {
        this.pozjlb = pozjlb;
    }

    /**
     * 获取配偶证件号码
     *
     * @return pozjhm - 配偶证件号码
     */
    public String getPozjhm() {
        return pozjhm;
    }

    /**
     * 设置配偶证件号码
     *
     * @param pozjhm 配偶证件号码
     */
    public void setPozjhm(String pozjhm) {
        this.pozjhm = pozjhm;
    }

    /**
     * 获取结离婚关系号
     *
     * @return jlhgxh - 结离婚关系号
     */
    public String getJlhgxh() {
        return jlhgxh;
    }

    /**
     * 设置结离婚关系号
     *
     * @param jlhgxh 结离婚关系号
     */
    public void setJlhgxh(String jlhgxh) {
        this.jlhgxh = jlhgxh;
    }

    /**
     * 获取结离婚登记日期
     *
     * @return jlhdjrq - 结离婚登记日期
     */
    public Date getJlhdjrq() {
        return jlhdjrq;
    }

    /**
     * 设置结离婚登记日期
     *
     * @param jlhdjrq 结离婚登记日期
     */
    public void setJlhdjrq(Date jlhdjrq) {
        this.jlhdjrq = jlhdjrq;
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