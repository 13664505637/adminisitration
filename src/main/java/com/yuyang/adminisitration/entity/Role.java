package com.yuyang.adminisitration.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "db_adminisitration..role")
public class Role {
    /**
     * 主键 角色表
     */
    @Id
    @Column(name = "r_id")
    private Integer rId;

    /**
     * 角色名称
     */
    @Column(name = "r_name")
    private String rName;

    /**
     * 角色描述
     */
    @Column(name = "r_description")
    private String rDescription;

    /**
     * 角色状态，1为有效，2为删除
     */
    @Column(name = "r_status")
    private Integer rStatus;

    /**
     * 创建时间
     */
    @Column(name = "r_creat_time")
    private Date rCreatTime;

    /**
     * 更新时间
     */
    @Column(name = "r_update_time")
    private Date rUpdateTime;

    /**
     * 获取主键 角色表
     *
     * @return r_id - 主键 角色表
     */
    public Integer getrId() {
        return rId;
    }

    /**
     * 设置主键 角色表
     *
     * @param rId 主键 角色表
     */
    public void setrId(Integer rId) {
        this.rId = rId;
    }

    /**
     * 获取角色名称
     *
     * @return r_name - 角色名称
     */
    public String getrName() {
        return rName;
    }

    /**
     * 设置角色名称
     *
     * @param rName 角色名称
     */
    public void setrName(String rName) {
        this.rName = rName;
    }

    /**
     * 获取角色描述
     *
     * @return r_description - 角色描述
     */
    public String getrDescription() {
        return rDescription;
    }

    /**
     * 设置角色描述
     *
     * @param rDescription 角色描述
     */
    public void setrDescription(String rDescription) {
        this.rDescription = rDescription;
    }

    /**
     * 获取角色状态，1为有效，2为删除
     *
     * @return r_status - 角色状态，1为有效，2为删除
     */
    public Integer getrStatus() {
        return rStatus;
    }

    /**
     * 设置角色状态，1为有效，2为删除
     *
     * @param rStatus 角色状态，1为有效，2为删除
     */
    public void setrStatus(Integer rStatus) {
        this.rStatus = rStatus;
    }

    /**
     * 获取创建时间
     *
     * @return r_creat_time - 创建时间
     */
    public Date getrCreatTime() {
        return rCreatTime;
    }

    /**
     * 设置创建时间
     *
     * @param rCreatTime 创建时间
     */
    public void setrCreatTime(Date rCreatTime) {
        this.rCreatTime = rCreatTime;
    }

    /**
     * 获取更新时间
     *
     * @return r_update_time - 更新时间
     */
    public Date getrUpdateTime() {
        return rUpdateTime;
    }

    /**
     * 设置更新时间
     *
     * @param rUpdateTime 更新时间
     */
    public void setrUpdateTime(Date rUpdateTime) {
        this.rUpdateTime = rUpdateTime;
    }
}