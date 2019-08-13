package com.king.ant.model.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "dwd_djxx_frdjxx_f")
public class DwdDjxxFrdjxxF {
    @Id
    private String uuid;

    /**
     * 内部序号
     */
    private String nbxh;

    /**
     * 企业名称
     */
    private String qymc;

    /**
     * 经营场所
     */
    private String zs;

    /**
     * 法定代表人
     */
    private String fddbr;

    /**
     * 身份证件号码
     */
    private String sfzjhm;

    /**
     * 企业类型
     */
    private String qylx;

    /**
     * 企业类型代理
     */
    private String qylxdl;

    /**
     * 行业
     */
    private String hy;

    /**
     * 成员人数
     */
    private Integer cyrs;

    /**
     * 注册资本
     */
    private BigDecimal zczb;

    /**
     * 核算形式
     */
    private String hsxs;

    /**
     * 注册号
     */
    private String zch;

    /**
     * 主账号标识
     */
    private Short zzfbs;

    /**
     * 处理日期
     */
    private Date clrq;

    /**
     * 登记机构
     */
    private String djjg;

    /**
     * 经营起始日期
     */
    private Date jyqsrq;

    /**
     * 经营截止日期
     */
    private Date jyjzrq;

    /**
     * 档案号
     */
    private String dah;

    /**
     * 管辖单位
     */
    private String gxdw;

    /**
     * 企业统一代码
     */
    private String qytydm;

    /**
     * 国别地区
     */
    private String gbdq;

    /**
     * 企业状态
     */
    private String zt;

    /**
     * 实际出资额
     */
    private Long sjcze;

    /**
     * 流动资金
     */
    private Float ldzj;

    /**
     * 固定资金
     */
    private Float gdzj;

    /**
     * 管理批号
     */
    private String glph;

    /**
     * 行政街道
     */
    private String xzjd;

    /**
     * 特殊代码3
     */
    private String tsdm3;

    /**
     * 资源设备
     */
    private String zysb;

    /**
     * 注册形式
     */
    private String zcxs;

    /**
     * 经营形式
     */
    private String jyxs;

    /**
     * 修改时间
     */
    private Date xgsj;

    /**
     * 正式登记结果 
     */
    private String zsdjjg;

    /**
     * 许可经营姓名
     */
    private String xkjyxm;

    /**
     * 梳理方式
     */
    private String slfs;

    /**
     * 经营列表
     */
    private String jylb;

    /**
     * 特殊经营列表
     */
    private String tsjylb;

    /**
     * 梳理通知书文号
     */
    private String sltzswh;

    /**
     * 新会员代码
     */
    private String newhydm;

    /**
     * 公积金代缴机构
     */
    private String gjjdjjg;

    /**
     * 统一信用代码
     */
    private String uniscid;

    /**
     * 市场经营场地
     */
    private String scjycd;

    /**
     * 组织机构代码证
     */
    private String zzjgdmz;

    /**
     * 营业执照编号
     */
    private String yyzzbh;

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
     * 获取企业名称
     *
     * @return qymc - 企业名称
     */
    public String getQymc() {
        return qymc;
    }

    /**
     * 设置企业名称
     *
     * @param qymc 企业名称
     */
    public void setQymc(String qymc) {
        this.qymc = qymc;
    }

    /**
     * 获取经营场所
     *
     * @return zs - 经营场所
     */
    public String getZs() {
        return zs;
    }

    /**
     * 设置经营场所
     *
     * @param zs 经营场所
     */
    public void setZs(String zs) {
        this.zs = zs;
    }

    /**
     * 获取法定代表人
     *
     * @return fddbr - 法定代表人
     */
    public String getFddbr() {
        return fddbr;
    }

    /**
     * 设置法定代表人
     *
     * @param fddbr 法定代表人
     */
    public void setFddbr(String fddbr) {
        this.fddbr = fddbr;
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
     * 获取企业类型
     *
     * @return qylx - 企业类型
     */
    public String getQylx() {
        return qylx;
    }

    /**
     * 设置企业类型
     *
     * @param qylx 企业类型
     */
    public void setQylx(String qylx) {
        this.qylx = qylx;
    }

    /**
     * 获取企业类型代理
     *
     * @return qylxdl - 企业类型代理
     */
    public String getQylxdl() {
        return qylxdl;
    }

    /**
     * 设置企业类型代理
     *
     * @param qylxdl 企业类型代理
     */
    public void setQylxdl(String qylxdl) {
        this.qylxdl = qylxdl;
    }

    /**
     * 获取行业
     *
     * @return hy - 行业
     */
    public String getHy() {
        return hy;
    }

    /**
     * 设置行业
     *
     * @param hy 行业
     */
    public void setHy(String hy) {
        this.hy = hy;
    }

    /**
     * 获取成员人数
     *
     * @return cyrs - 成员人数
     */
    public Integer getCyrs() {
        return cyrs;
    }

    /**
     * 设置成员人数
     *
     * @param cyrs 成员人数
     */
    public void setCyrs(Integer cyrs) {
        this.cyrs = cyrs;
    }

    /**
     * 获取注册资本
     *
     * @return zczb - 注册资本
     */
    public BigDecimal getZczb() {
        return zczb;
    }

    /**
     * 设置注册资本
     *
     * @param zczb 注册资本
     */
    public void setZczb(BigDecimal zczb) {
        this.zczb = zczb;
    }

    /**
     * 获取核算形式
     *
     * @return hsxs - 核算形式
     */
    public String getHsxs() {
        return hsxs;
    }

    /**
     * 设置核算形式
     *
     * @param hsxs 核算形式
     */
    public void setHsxs(String hsxs) {
        this.hsxs = hsxs;
    }

    /**
     * 获取注册号
     *
     * @return zch - 注册号
     */
    public String getZch() {
        return zch;
    }

    /**
     * 设置注册号
     *
     * @param zch 注册号
     */
    public void setZch(String zch) {
        this.zch = zch;
    }

    /**
     * 获取主账号标识
     *
     * @return zzfbs - 主账号标识
     */
    public Short getZzfbs() {
        return zzfbs;
    }

    /**
     * 设置主账号标识
     *
     * @param zzfbs 主账号标识
     */
    public void setZzfbs(Short zzfbs) {
        this.zzfbs = zzfbs;
    }

    /**
     * 获取处理日期
     *
     * @return clrq - 处理日期
     */
    public Date getClrq() {
        return clrq;
    }

    /**
     * 设置处理日期
     *
     * @param clrq 处理日期
     */
    public void setClrq(Date clrq) {
        this.clrq = clrq;
    }

    /**
     * 获取登记机构
     *
     * @return djjg - 登记机构
     */
    public String getDjjg() {
        return djjg;
    }

    /**
     * 设置登记机构
     *
     * @param djjg 登记机构
     */
    public void setDjjg(String djjg) {
        this.djjg = djjg;
    }

    /**
     * 获取经营起始日期
     *
     * @return jyqsrq - 经营起始日期
     */
    public Date getJyqsrq() {
        return jyqsrq;
    }

    /**
     * 设置经营起始日期
     *
     * @param jyqsrq 经营起始日期
     */
    public void setJyqsrq(Date jyqsrq) {
        this.jyqsrq = jyqsrq;
    }

    /**
     * 获取经营截止日期
     *
     * @return jyjzrq - 经营截止日期
     */
    public Date getJyjzrq() {
        return jyjzrq;
    }

    /**
     * 设置经营截止日期
     *
     * @param jyjzrq 经营截止日期
     */
    public void setJyjzrq(Date jyjzrq) {
        this.jyjzrq = jyjzrq;
    }

    /**
     * 获取档案号
     *
     * @return dah - 档案号
     */
    public String getDah() {
        return dah;
    }

    /**
     * 设置档案号
     *
     * @param dah 档案号
     */
    public void setDah(String dah) {
        this.dah = dah;
    }

    /**
     * 获取管辖单位
     *
     * @return gxdw - 管辖单位
     */
    public String getGxdw() {
        return gxdw;
    }

    /**
     * 设置管辖单位
     *
     * @param gxdw 管辖单位
     */
    public void setGxdw(String gxdw) {
        this.gxdw = gxdw;
    }

    /**
     * 获取企业统一代码
     *
     * @return qytydm - 企业统一代码
     */
    public String getQytydm() {
        return qytydm;
    }

    /**
     * 设置企业统一代码
     *
     * @param qytydm 企业统一代码
     */
    public void setQytydm(String qytydm) {
        this.qytydm = qytydm;
    }

    /**
     * 获取国别地区
     *
     * @return gbdq - 国别地区
     */
    public String getGbdq() {
        return gbdq;
    }

    /**
     * 设置国别地区
     *
     * @param gbdq 国别地区
     */
    public void setGbdq(String gbdq) {
        this.gbdq = gbdq;
    }

    /**
     * 获取企业状态
     *
     * @return zt - 企业状态
     */
    public String getZt() {
        return zt;
    }

    /**
     * 设置企业状态
     *
     * @param zt 企业状态
     */
    public void setZt(String zt) {
        this.zt = zt;
    }

    /**
     * 获取实际出资额
     *
     * @return sjcze - 实际出资额
     */
    public Long getSjcze() {
        return sjcze;
    }

    /**
     * 设置实际出资额
     *
     * @param sjcze 实际出资额
     */
    public void setSjcze(Long sjcze) {
        this.sjcze = sjcze;
    }

    /**
     * 获取流动资金
     *
     * @return ldzj - 流动资金
     */
    public Float getLdzj() {
        return ldzj;
    }

    /**
     * 设置流动资金
     *
     * @param ldzj 流动资金
     */
    public void setLdzj(Float ldzj) {
        this.ldzj = ldzj;
    }

    /**
     * 获取固定资金
     *
     * @return gdzj - 固定资金
     */
    public Float getGdzj() {
        return gdzj;
    }

    /**
     * 设置固定资金
     *
     * @param gdzj 固定资金
     */
    public void setGdzj(Float gdzj) {
        this.gdzj = gdzj;
    }

    /**
     * 获取管理批号
     *
     * @return glph - 管理批号
     */
    public String getGlph() {
        return glph;
    }

    /**
     * 设置管理批号
     *
     * @param glph 管理批号
     */
    public void setGlph(String glph) {
        this.glph = glph;
    }

    /**
     * 获取行政街道
     *
     * @return xzjd - 行政街道
     */
    public String getXzjd() {
        return xzjd;
    }

    /**
     * 设置行政街道
     *
     * @param xzjd 行政街道
     */
    public void setXzjd(String xzjd) {
        this.xzjd = xzjd;
    }

    /**
     * 获取特殊代码3
     *
     * @return tsdm3 - 特殊代码3
     */
    public String getTsdm3() {
        return tsdm3;
    }

    /**
     * 设置特殊代码3
     *
     * @param tsdm3 特殊代码3
     */
    public void setTsdm3(String tsdm3) {
        this.tsdm3 = tsdm3;
    }

    /**
     * 获取资源设备
     *
     * @return zysb - 资源设备
     */
    public String getZysb() {
        return zysb;
    }

    /**
     * 设置资源设备
     *
     * @param zysb 资源设备
     */
    public void setZysb(String zysb) {
        this.zysb = zysb;
    }

    /**
     * 获取注册形式
     *
     * @return zcxs - 注册形式
     */
    public String getZcxs() {
        return zcxs;
    }

    /**
     * 设置注册形式
     *
     * @param zcxs 注册形式
     */
    public void setZcxs(String zcxs) {
        this.zcxs = zcxs;
    }

    /**
     * 获取经营形式
     *
     * @return jyxs - 经营形式
     */
    public String getJyxs() {
        return jyxs;
    }

    /**
     * 设置经营形式
     *
     * @param jyxs 经营形式
     */
    public void setJyxs(String jyxs) {
        this.jyxs = jyxs;
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
     * 获取正式登记结果 
     *
     * @return zsdjjg - 正式登记结果 
     */
    public String getZsdjjg() {
        return zsdjjg;
    }

    /**
     * 设置正式登记结果 
     *
     * @param zsdjjg 正式登记结果 
     */
    public void setZsdjjg(String zsdjjg) {
        this.zsdjjg = zsdjjg;
    }

    /**
     * 获取许可经营姓名
     *
     * @return xkjyxm - 许可经营姓名
     */
    public String getXkjyxm() {
        return xkjyxm;
    }

    /**
     * 设置许可经营姓名
     *
     * @param xkjyxm 许可经营姓名
     */
    public void setXkjyxm(String xkjyxm) {
        this.xkjyxm = xkjyxm;
    }

    /**
     * 获取梳理方式
     *
     * @return slfs - 梳理方式
     */
    public String getSlfs() {
        return slfs;
    }

    /**
     * 设置梳理方式
     *
     * @param slfs 梳理方式
     */
    public void setSlfs(String slfs) {
        this.slfs = slfs;
    }

    /**
     * 获取经营列表
     *
     * @return jylb - 经营列表
     */
    public String getJylb() {
        return jylb;
    }

    /**
     * 设置经营列表
     *
     * @param jylb 经营列表
     */
    public void setJylb(String jylb) {
        this.jylb = jylb;
    }

    /**
     * 获取特殊经营列表
     *
     * @return tsjylb - 特殊经营列表
     */
    public String getTsjylb() {
        return tsjylb;
    }

    /**
     * 设置特殊经营列表
     *
     * @param tsjylb 特殊经营列表
     */
    public void setTsjylb(String tsjylb) {
        this.tsjylb = tsjylb;
    }

    /**
     * 获取梳理通知书文号
     *
     * @return sltzswh - 梳理通知书文号
     */
    public String getSltzswh() {
        return sltzswh;
    }

    /**
     * 设置梳理通知书文号
     *
     * @param sltzswh 梳理通知书文号
     */
    public void setSltzswh(String sltzswh) {
        this.sltzswh = sltzswh;
    }

    /**
     * 获取新会员代码
     *
     * @return newhydm - 新会员代码
     */
    public String getNewhydm() {
        return newhydm;
    }

    /**
     * 设置新会员代码
     *
     * @param newhydm 新会员代码
     */
    public void setNewhydm(String newhydm) {
        this.newhydm = newhydm;
    }

    /**
     * 获取公积金代缴机构
     *
     * @return gjjdjjg - 公积金代缴机构
     */
    public String getGjjdjjg() {
        return gjjdjjg;
    }

    /**
     * 设置公积金代缴机构
     *
     * @param gjjdjjg 公积金代缴机构
     */
    public void setGjjdjjg(String gjjdjjg) {
        this.gjjdjjg = gjjdjjg;
    }

    /**
     * 获取统一信用代码
     *
     * @return uniscid - 统一信用代码
     */
    public String getUniscid() {
        return uniscid;
    }

    /**
     * 设置统一信用代码
     *
     * @param uniscid 统一信用代码
     */
    public void setUniscid(String uniscid) {
        this.uniscid = uniscid;
    }

    /**
     * 获取市场经营场地
     *
     * @return scjycd - 市场经营场地
     */
    public String getScjycd() {
        return scjycd;
    }

    /**
     * 设置市场经营场地
     *
     * @param scjycd 市场经营场地
     */
    public void setScjycd(String scjycd) {
        this.scjycd = scjycd;
    }

    /**
     * 获取组织机构代码证
     *
     * @return zzjgdmz - 组织机构代码证
     */
    public String getZzjgdmz() {
        return zzjgdmz;
    }

    /**
     * 设置组织机构代码证
     *
     * @param zzjgdmz 组织机构代码证
     */
    public void setZzjgdmz(String zzjgdmz) {
        this.zzjgdmz = zzjgdmz;
    }

    /**
     * 获取营业执照编号
     *
     * @return yyzzbh - 营业执照编号
     */
    public String getYyzzbh() {
        return yyzzbh;
    }

    /**
     * 设置营业执照编号
     *
     * @param yyzzbh 营业执照编号
     */
    public void setYyzzbh(String yyzzbh) {
        this.yyzzbh = yyzzbh;
    }
}