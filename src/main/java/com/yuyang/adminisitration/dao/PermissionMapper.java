package com.yuyang.adminisitration.dao;

import com.yuyang.adminisitration.entity.Permission;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.MyMapper;
@Mapper
public interface PermissionMapper extends MyMapper<Permission> {
}