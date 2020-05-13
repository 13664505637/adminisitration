package com.yuyang.adminisitration.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "db_adminisitration..permission")
public class Permission {
    /**
     * 主键 权限表
     */
    @Id
    @Column(name = "p_id")
    private Integer pId;

    /**
     * 权限名称
     */
    @Column(name = "p_name")
    private String pName;

    /**
     * 权限描述
     */
    @Column(name = "p_description")
    private String pDescription;

    /**
     * 权限访问路径
     */
    @Column(name = "p_url")
    private String pUrl;

    /**
     * 权限标识
     */
    @Column(name = "p_perms")
    private String pPerms;

    /**
     * 父级权限ID
     */
    @Column(name = "p_parent_id")
    private Integer pParentId;

    /**
     * 类型，
     */
    @Column(name = "p_type")
    private Integer pType;

    /**
     * 状态，1为有效，2为删除
     */
    @Column(name = "p_status")
    private Integer pStatus;

    /**
     * 创建时间
     */
    @Column(name = "p_create_time")
    private Date pCreateTime;

    /**
     * 更新时间
     */
    @Column(name = "p_update_time")
    private Date pUpdateTime;

    /**
     * 获取主键 权限表
     *
     * @return p_id - 主键 权限表
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * 设置主键 权限表
     *
     * @param pId 主键 权限表
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * 获取权限名称
     *
     * @return p_name - 权限名称
     */
    public String getpName() {
        return pName;
    }

    /**
     * 设置权限名称
     *
     * @param pName 权限名称
     */
    public void setpName(String pName) {
        this.pName = pName;
    }

    /**
     * 获取权限描述
     *
     * @return p_description - 权限描述
     */
    public String getpDescription() {
        return pDescription;
    }

    /**
     * 设置权限描述
     *
     * @param pDescription 权限描述
     */
    public void setpDescription(String pDescription) {
        this.pDescription = pDescription;
    }

    /**
     * 获取权限访问路径
     *
     * @return p_url - 权限访问路径
     */
    public String getpUrl() {
        return pUrl;
    }

    /**
     * 设置权限访问路径
     *
     * @param pUrl 权限访问路径
     */
    public void setpUrl(String pUrl) {
        this.pUrl = pUrl;
    }

    /**
     * 获取权限标识
     *
     * @return p_perms - 权限标识
     */
    public String getpPerms() {
        return pPerms;
    }

    /**
     * 设置权限标识
     *
     * @param pPerms 权限标识
     */
    public void setpPerms(String pPerms) {
        this.pPerms = pPerms;
    }

    /**
     * 获取父级权限ID
     *
     * @return p_parent_id - 父级权限ID
     */
    public Integer getpParentId() {
        return pParentId;
    }

    /**
     * 设置父级权限ID
     *
     * @param pParentId 父级权限ID
     */
    public void setpParentId(Integer pParentId) {
        this.pParentId = pParentId;
    }

    /**
     * 获取类型，
     *
     * @return p_type - 类型，
     */
    public Integer getpType() {
        return pType;
    }

    /**
     * 设置类型，
     *
     * @param pType 类型，
     */
    public void setpType(Integer pType) {
        this.pType = pType;
    }

    /**
     * 获取状态，1为有效，2为删除
     *
     * @return p_status - 状态，1为有效，2为删除
     */
    public Integer getpStatus() {
        return pStatus;
    }

    /**
     * 设置状态，1为有效，2为删除
     *
     * @param pStatus 状态，1为有效，2为删除
     */
    public void setpStatus(Integer pStatus) {
        this.pStatus = pStatus;
    }

    /**
     * 获取创建时间
     *
     * @return p_create_time - 创建时间
     */
    public Date getpCreateTime() {
        return pCreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param pCreateTime 创建时间
     */
    public void setpCreateTime(Date pCreateTime) {
        this.pCreateTime = pCreateTime;
    }

    /**
     * 获取更新时间
     *
     * @return p_update_time - 更新时间
     */
    public Date getpUpdateTime() {
        return pUpdateTime;
    }

    /**
     * 设置更新时间
     *
     * @param pUpdateTime 更新时间
     */
    public void setpUpdateTime(Date pUpdateTime) {
        this.pUpdateTime = pUpdateTime;
    }
}