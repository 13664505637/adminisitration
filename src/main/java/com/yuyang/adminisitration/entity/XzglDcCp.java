package com.yuyang.adminisitration.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "db_adminisitration..xzgl_dc_cp")
public class XzglDcCp {
    /**
     * 主键 菜品
     */
    @Id
    @Column(name = "c_id")
    private Integer cId;

    /**
     * 创建人
     */
    @Column(name = "c_createby")
    private String cCreateby;

    /**
     * 创建时间
     */
    @Column(name = "c_createtime")
    private Date cCreatetime;

    /**
     * 删除标志
     */
    @Column(name = "c_deleted")
    private Integer cDeleted;

    /**
     * 更新人
     */
    @Column(name = "c_updateby")
    private String cUpdateby;

    /**
     * 更新时间
     */
    @Column(name = "c_updatetime")
    private Date cUpdatetime;

    /**
     * 菜品名
     */
    @Column(name = "C_name")
    private String cName;

    /**
     * 单价
     */
    @Column(name = "C_price")
    private Double cPrice;

    /**
     * 提前预定时间（小时）
     */
    @Column(name = "preset_time")
    private Integer presetTime;

    /**
     * 菜品说明
     */
    @Column(name = "c_remark")
    private String cRemark;

    /**
     * 状态，0-失效，1-有效
     */
    @Column(name = "c_status")
    private Integer cStatus;

    /**
     * 库存量
     */
    @Column(name = "c_stock_num")
    private Integer cStockNum;

    /**
     * 上级菜品（类型）
     */
    @Column(name = "c_parent_id")
    private Integer cParentId;

    /**
     * 单位（份、只等）
     */
    @Column(name = "c_unit")
    private String cUnit;

    /**
     * 单人限额
     */
    @Column(name = "limit_num")
    private Integer limitNum;

    /**
     * 单日总限额
     */
    @Column(name = "limit_toatl_num")
    private Integer limitToatlNum;

    /**
     * 销量
     */
    @Column(name = "c_sales_num")
    private Integer cSalesNum;

    /**
     * 评价
     */
    @Column(name = "c_stars")
    private Float cStars;

    /**
     * 获取主键 菜品
     *
     * @return c_id - 主键 菜品
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * 设置主键 菜品
     *
     * @param cId 主键 菜品
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * 获取创建人
     *
     * @return c_createby - 创建人
     */
    public String getcCreateby() {
        return cCreateby;
    }

    /**
     * 设置创建人
     *
     * @param cCreateby 创建人
     */
    public void setcCreateby(String cCreateby) {
        this.cCreateby = cCreateby;
    }

    /**
     * 获取创建时间
     *
     * @return c_createtime - 创建时间
     */
    public Date getcCreatetime() {
        return cCreatetime;
    }

    /**
     * 设置创建时间
     *
     * @param cCreatetime 创建时间
     */
    public void setcCreatetime(Date cCreatetime) {
        this.cCreatetime = cCreatetime;
    }

    /**
     * 获取删除标志
     *
     * @return c_deleted - 删除标志
     */
    public Integer getcDeleted() {
        return cDeleted;
    }

    /**
     * 设置删除标志
     *
     * @param cDeleted 删除标志
     */
    public void setcDeleted(Integer cDeleted) {
        this.cDeleted = cDeleted;
    }

    /**
     * 获取更新人
     *
     * @return c_updateby - 更新人
     */
    public String getcUpdateby() {
        return cUpdateby;
    }

    /**
     * 设置更新人
     *
     * @param cUpdateby 更新人
     */
    public void setcUpdateby(String cUpdateby) {
        this.cUpdateby = cUpdateby;
    }

    /**
     * 获取更新时间
     *
     * @return c_updatetime - 更新时间
     */
    public Date getcUpdatetime() {
        return cUpdatetime;
    }

    /**
     * 设置更新时间
     *
     * @param cUpdatetime 更新时间
     */
    public void setcUpdatetime(Date cUpdatetime) {
        this.cUpdatetime = cUpdatetime;
    }

    /**
     * 获取菜品名
     *
     * @return C_name - 菜品名
     */
    public String getcName() {
        return cName;
    }

    /**
     * 设置菜品名
     *
     * @param cName 菜品名
     */
    public void setcName(String cName) {
        this.cName = cName;
    }

    /**
     * 获取单价
     *
     * @return C_price - 单价
     */
    public Double getcPrice() {
        return cPrice;
    }

    /**
     * 设置单价
     *
     * @param cPrice 单价
     */
    public void setcPrice(Double cPrice) {
        this.cPrice = cPrice;
    }

    /**
     * 获取提前预定时间（小时）
     *
     * @return preset_time - 提前预定时间（小时）
     */
    public Integer getPresetTime() {
        return presetTime;
    }

    /**
     * 设置提前预定时间（小时）
     *
     * @param presetTime 提前预定时间（小时）
     */
    public void setPresetTime(Integer presetTime) {
        this.presetTime = presetTime;
    }

    /**
     * 获取菜品说明
     *
     * @return c_remark - 菜品说明
     */
    public String getcRemark() {
        return cRemark;
    }

    /**
     * 设置菜品说明
     *
     * @param cRemark 菜品说明
     */
    public void setcRemark(String cRemark) {
        this.cRemark = cRemark;
    }

    /**
     * 获取状态，0-失效，1-有效
     *
     * @return c_status - 状态，0-失效，1-有效
     */
    public Integer getcStatus() {
        return cStatus;
    }

    /**
     * 设置状态，0-失效，1-有效
     *
     * @param cStatus 状态，0-失效，1-有效
     */
    public void setcStatus(Integer cStatus) {
        this.cStatus = cStatus;
    }

    /**
     * 获取库存量
     *
     * @return c_stock_num - 库存量
     */
    public Integer getcStockNum() {
        return cStockNum;
    }

    /**
     * 设置库存量
     *
     * @param cStockNum 库存量
     */
    public void setcStockNum(Integer cStockNum) {
        this.cStockNum = cStockNum;
    }

    /**
     * 获取上级菜品（类型）
     *
     * @return c_parent_id - 上级菜品（类型）
     */
    public Integer getcParentId() {
        return cParentId;
    }

    /**
     * 设置上级菜品（类型）
     *
     * @param cParentId 上级菜品（类型）
     */
    public void setcParentId(Integer cParentId) {
        this.cParentId = cParentId;
    }

    /**
     * 获取单位（份、只等）
     *
     * @return c_unit - 单位（份、只等）
     */
    public String getcUnit() {
        return cUnit;
    }

    /**
     * 设置单位（份、只等）
     *
     * @param cUnit 单位（份、只等）
     */
    public void setcUnit(String cUnit) {
        this.cUnit = cUnit;
    }

    /**
     * 获取单人限额
     *
     * @return limit_num - 单人限额
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    /**
     * 设置单人限额
     *
     * @param limitNum 单人限额
     */
    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    /**
     * 获取单日总限额
     *
     * @return limit_toatl_num - 单日总限额
     */
    public Integer getLimitToatlNum() {
        return limitToatlNum;
    }

    /**
     * 设置单日总限额
     *
     * @param limitToatlNum 单日总限额
     */
    public void setLimitToatlNum(Integer limitToatlNum) {
        this.limitToatlNum = limitToatlNum;
    }

    /**
     * 获取销量
     *
     * @return c_sales_num - 销量
     */
    public Integer getcSalesNum() {
        return cSalesNum;
    }

    /**
     * 设置销量
     *
     * @param cSalesNum 销量
     */
    public void setcSalesNum(Integer cSalesNum) {
        this.cSalesNum = cSalesNum;
    }

    /**
     * 获取评价
     *
     * @return c_stars - 评价
     */
    public Float getcStars() {
        return cStars;
    }

    /**
     * 设置评价
     *
     * @param cStars 评价
     */
    public void setcStars(Float cStars) {
        this.cStars = cStars;
    }
}