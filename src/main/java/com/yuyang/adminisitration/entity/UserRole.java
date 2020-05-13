package com.yuyang.adminisitration.entity;

import javax.persistence.*;

@Table(name = "db_adminisitration..user_role")
public class UserRole {
    /**
     * 主键 用户角色关系表
     */
    @Id
    @Column(name = "ur_id")
    private Integer urId;

    /**
     * 用户ID，USER.U_ID
     */
    @Column(name = "u_id")
    private Integer uId;

    /**
     * 角色ID，ROLE.R_ID
     */
    @Column(name = "r_id")
    private Integer rId;

    /**
     * 获取主键 用户角色关系表
     *
     * @return ur_id - 主键 用户角色关系表
     */
    public Integer getUrId() {
        return urId;
    }

    /**
     * 设置主键 用户角色关系表
     *
     * @param urId 主键 用户角色关系表
     */
    public void setUrId(Integer urId) {
        this.urId = urId;
    }

    /**
     * 获取用户ID，USER.U_ID
     *
     * @return u_id - 用户ID，USER.U_ID
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * 设置用户ID，USER.U_ID
     *
     * @param uId 用户ID，USER.U_ID
     */
    public void setuId(Integer uId) {
        this.uId = uId;
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
}