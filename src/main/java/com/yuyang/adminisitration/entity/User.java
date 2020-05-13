package com.yuyang.adminisitration.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "db_adminisitration..user")
public class User {
    /**
     * 主键 用户表
     */
    @Id
    @Column(name = "u_id")
    private Integer uId;

    /**
     * 用户姓名
     */
    @Column(name = "u_name")
    private String uName;

    /**
     * 用户密码
     */
    @Column(name = "u_password")
    private String uPassword;

    /**
     * 手机号码
     */
    @Column(name = "u_phone")
    private String uPhone;

    /**
     * 身份证号码
     */
    @Column(name = "u_id_number")
    private String uIdNumber;

    /**
     * 加密盐值
     */
    @Column(name = "u_salt")
    private String uSalt;

    /**
     * 性别，1为女，2为男
     */
    @Column(name = "u_sex")
    private Integer uSex;

    /**
     * 年龄
     */
    @Column(name = "u_age")
    private Integer uAge;

    /**
     * 用户状态，1为有效，2为删除
     */
    @Column(name = "u_status")
    private Integer uStatus;

    /**
     * 创建时间
     */
    @Column(name = "u_creat_time")
    private Date uCreatTime;

    /**
     * 更新时间
     */
    @Column(name = "u_update_time")
    private Date uUpdateTime;

    /**
     * 最后登录时间
     */
    @Column(name = "u_last_login_time")
    private Date uLastLoginTime;

    /**
     * 获取主键 用户表
     *
     * @return u_id - 主键 用户表
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * 设置主键 用户表
     *
     * @param uId 主键 用户表
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * 获取用户姓名
     *
     * @return u_name - 用户姓名
     */
    public String getuName() {
        return uName;
    }

    /**
     * 设置用户姓名
     *
     * @param uName 用户姓名
     */
    public void setuName(String uName) {
        this.uName = uName;
    }

    /**
     * 获取用户密码
     *
     * @return u_password - 用户密码
     */
    public String getuPassword() {
        return uPassword;
    }

    /**
     * 设置用户密码
     *
     * @param uPassword 用户密码
     */
    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    /**
     * 获取手机号码
     *
     * @return u_phone - 手机号码
     */
    public String getuPhone() {
        return uPhone;
    }

    /**
     * 设置手机号码
     *
     * @param uPhone 手机号码
     */
    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    /**
     * 获取身份证号码
     *
     * @return u_id_number - 身份证号码
     */
    public String getuIdNumber() {
        return uIdNumber;
    }

    /**
     * 设置身份证号码
     *
     * @param uIdNumber 身份证号码
     */
    public void setuIdNumber(String uIdNumber) {
        this.uIdNumber = uIdNumber;
    }

    /**
     * 获取加密盐值
     *
     * @return u_salt - 加密盐值
     */
    public String getuSalt() {
        return uSalt;
    }

    /**
     * 设置加密盐值
     *
     * @param uSalt 加密盐值
     */
    public void setuSalt(String uSalt) {
        this.uSalt = uSalt;
    }

    /**
     * 获取性别，1为女，2为男
     *
     * @return u_sex - 性别，1为女，2为男
     */
    public Integer getuSex() {
        return uSex;
    }

    /**
     * 设置性别，1为女，2为男
     *
     * @param uSex 性别，1为女，2为男
     */
    public void setuSex(Integer uSex) {
        this.uSex = uSex;
    }

    /**
     * 获取年龄
     *
     * @return u_age - 年龄
     */
    public Integer getuAge() {
        return uAge;
    }

    /**
     * 设置年龄
     *
     * @param uAge 年龄
     */
    public void setuAge(Integer uAge) {
        this.uAge = uAge;
    }

    /**
     * 获取用户状态，1为有效，2为删除
     *
     * @return u_status - 用户状态，1为有效，2为删除
     */
    public Integer getuStatus() {
        return uStatus;
    }

    /**
     * 设置用户状态，1为有效，2为删除
     *
     * @param uStatus 用户状态，1为有效，2为删除
     */
    public void setuStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }

    /**
     * 获取创建时间
     *
     * @return u_creat_time - 创建时间
     */
    public Date getuCreatTime() {
        return uCreatTime;
    }

    /**
     * 设置创建时间
     *
     * @param uCreatTime 创建时间
     */
    public void setuCreatTime(Date uCreatTime) {
        this.uCreatTime = uCreatTime;
    }

    /**
     * 获取更新时间
     *
     * @return u_update_time - 更新时间
     */
    public Date getuUpdateTime() {
        return uUpdateTime;
    }

    /**
     * 设置更新时间
     *
     * @param uUpdateTime 更新时间
     */
    public void setuUpdateTime(Date uUpdateTime) {
        this.uUpdateTime = uUpdateTime;
    }

    /**
     * 获取最后登录时间
     *
     * @return u_last_login_time - 最后登录时间
     */
    public Date getuLastLoginTime() {
        return uLastLoginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param uLastLoginTime 最后登录时间
     */
    public void setuLastLoginTime(Date uLastLoginTime) {
        this.uLastLoginTime = uLastLoginTime;
    }
}