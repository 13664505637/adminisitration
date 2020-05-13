package com.yuyang.adminisitration.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "db_adminisitration..xzgl_dc_apply")
public class XzglDcApply {
    /**
     * 主键 订单主表
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
    private Integer cUpdateby;

    /**
     * 更新时间
     */
    @Column(name = "c_updatetime")
    private Date cUpdatetime;

    /**
     * 申请人
     */
    @Column(name = "c_user_id")
    private Integer cUserId;

    /**
     * 申请人姓名
     */
    @Column(name = "c_apply_user")
    private String cApplyUser;

    /**
     * 申请内容
     */
    @Column(name = "c_apply_content")
    private String cApplyContent;

    /**
     * 领用时间
     */
    @Column(name = "c_issue_time")
    private Date cIssueTime;

    /**
     * 状态，0-作废，1-已登记，2-已领取
     */
    @Column(name = "c_status")
    private Integer cStatus;

    /**
     * 获取主键 订单主表
     *
     * @return c_id - 主键 订单主表
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * 设置主键 订单主表
     *
     * @param cId 主键 订单主表
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
    public Integer getcUpdateby() {
        return cUpdateby;
    }

    /**
     * 设置更新人
     *
     * @param cUpdateby 更新人
     */
    public void setcUpdateby(Integer cUpdateby) {
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
     * 获取申请人
     *
     * @return c_user_id - 申请人
     */
    public Integer getcUserId() {
        return cUserId;
    }

    /**
     * 设置申请人
     *
     * @param cUserId 申请人
     */
    public void setcUserId(Integer cUserId) {
        this.cUserId = cUserId;
    }

    /**
     * 获取申请人姓名
     *
     * @return c_apply_user - 申请人姓名
     */
    public String getcApplyUser() {
        return cApplyUser;
    }

    /**
     * 设置申请人姓名
     *
     * @param cApplyUser 申请人姓名
     */
    public void setcApplyUser(String cApplyUser) {
        this.cApplyUser = cApplyUser;
    }

    /**
     * 获取申请内容
     *
     * @return c_apply_content - 申请内容
     */
    public String getcApplyContent() {
        return cApplyContent;
    }

    /**
     * 设置申请内容
     *
     * @param cApplyContent 申请内容
     */
    public void setcApplyContent(String cApplyContent) {
        this.cApplyContent = cApplyContent;
    }

    /**
     * 获取领用时间
     *
     * @return c_issue_time - 领用时间
     */
    public Date getcIssueTime() {
        return cIssueTime;
    }

    /**
     * 设置领用时间
     *
     * @param cIssueTime 领用时间
     */
    public void setcIssueTime(Date cIssueTime) {
        this.cIssueTime = cIssueTime;
    }

    /**
     * 获取状态，0-作废，1-已登记，2-已领取
     *
     * @return c_status - 状态，0-作废，1-已登记，2-已领取
     */
    public Integer getcStatus() {
        return cStatus;
    }

    /**
     * 设置状态，0-作废，1-已登记，2-已领取
     *
     * @param cStatus 状态，0-作废，1-已登记，2-已领取
     */
    public void setcStatus(Integer cStatus) {
        this.cStatus = cStatus;
    }
}