package com.yuyang.adminisitration.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "db_adminisitration..xzgl_dc_applyitem")
public class XzglDcApplyitem {
    /**
     * 主键 订单明细表
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
     * 订单ID, XZGL_DC_CP.C_ID
     */
    @Column(name = "c_apply_id")
    private Integer cApplyId;

    /**
     * 菜品ID, XZGL_DC_CP.C_ID
     */
    @Column(name = "c_order_name_id")
    private Integer cOrderNameId;

    @Column(name = "c_order_name")
    private String cOrderName;

    /**
     * 申请数量
     */
    @Column(name = "c_apply_num")
    private Integer cApplyNum;

    /**
     * 评价,0-5星
     */
    @Column(name = "c_star")
    private Integer cStar;

    /**
     * 评价内容
     */
    @Column(name = "c_comment")
    private String cComment;

    /**
     * 状态，0-失效，1-有效
     */
    @Column(name = "c_status")
    private Integer cStatus;

    /**
     * 获取主键 订单明细表
     *
     * @return c_id - 主键 订单明细表
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * 设置主键 订单明细表
     *
     * @param cId 主键 订单明细表
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
     * 获取订单ID, XZGL_DC_CP.C_ID
     *
     * @return c_apply_id - 订单ID, XZGL_DC_CP.C_ID
     */
    public Integer getcApplyId() {
        return cApplyId;
    }

    /**
     * 设置订单ID, XZGL_DC_CP.C_ID
     *
     * @param cApplyId 订单ID, XZGL_DC_CP.C_ID
     */
    public void setcApplyId(Integer cApplyId) {
        this.cApplyId = cApplyId;
    }

    /**
     * 获取菜品ID, XZGL_DC_CP.C_ID
     *
     * @return c_order_name_id - 菜品ID, XZGL_DC_CP.C_ID
     */
    public Integer getcOrderNameId() {
        return cOrderNameId;
    }

    /**
     * 设置菜品ID, XZGL_DC_CP.C_ID
     *
     * @param cOrderNameId 菜品ID, XZGL_DC_CP.C_ID
     */
    public void setcOrderNameId(Integer cOrderNameId) {
        this.cOrderNameId = cOrderNameId;
    }

    /**
     * @return c_order_name
     */
    public String getcOrderName() {
        return cOrderName;
    }

    /**
     * @param cOrderName
     */
    public void setcOrderName(String cOrderName) {
        this.cOrderName = cOrderName;
    }

    /**
     * 获取申请数量
     *
     * @return c_apply_num - 申请数量
     */
    public Integer getcApplyNum() {
        return cApplyNum;
    }

    /**
     * 设置申请数量
     *
     * @param cApplyNum 申请数量
     */
    public void setcApplyNum(Integer cApplyNum) {
        this.cApplyNum = cApplyNum;
    }

    /**
     * 获取评价,0-5星
     *
     * @return c_star - 评价,0-5星
     */
    public Integer getcStar() {
        return cStar;
    }

    /**
     * 设置评价,0-5星
     *
     * @param cStar 评价,0-5星
     */
    public void setcStar(Integer cStar) {
        this.cStar = cStar;
    }

    /**
     * 获取评价内容
     *
     * @return c_comment - 评价内容
     */
    public String getcComment() {
        return cComment;
    }

    /**
     * 设置评价内容
     *
     * @param cComment 评价内容
     */
    public void setcComment(String cComment) {
        this.cComment = cComment;
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
}