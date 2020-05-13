package com.yuyang.adminisitration.entity;

import javax.persistence.*;

@Table(name = "db_adminisitration..role_permission")
public class RolePermission {
    /**
     * 主键 角色权限关系表
     */
    @Id
    @Column(name = "rp_id")
    private Integer rpId;

    /**
     * 角色ID，ROLE.R_ID
     */
    @Column(name = "r_id")
    private Integer rId;

    /**
     * 权限ID，PERMISSION.P_ID
     */
    @Column(name = "p_id")
    private Integer pId;

    /**
     * 获取主键 角色权限关系表
     *
     * @return rp_id - 主键 角色权限关系表
     */
    public Integer getRpId() {
        return rpId;
    }

    /**
     * 设置主键 角色权限关系表
     *
     * @param rpId 主键 角色权限关系表
     */
    public void setRpId(Integer rpId) {
        this.rpId = rpId;
    }

    /**
     * 获取角色ID，ROLE.R_ID
     *
     * @return r_id - 角色ID，ROLE.R_ID
     */
    public Integer getrId() {
        return rId;
    }

    /**
     * 设置角色ID，ROLE.R_ID
     *
     * @param rId 角色ID，ROLE.R_ID
     */
    public void setrId(Integer rId) {
        this.rId = rId;
    }

    /**
     * 获取权限ID，PERMISSION.P_ID
     *
     * @return p_id - 权限ID，PERMISSION.P_ID
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * 设置权限ID，PERMISSION.P_ID
     *
     * @param pId 权限ID，PERMISSION.P_ID
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }
}