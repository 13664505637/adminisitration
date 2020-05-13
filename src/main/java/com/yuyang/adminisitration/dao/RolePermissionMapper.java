package com.yuyang.adminisitration.dao;

import com.yuyang.adminisitration.entity.RolePermission;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.MyMapper;
@Mapper
public interface RolePermissionMapper extends MyMapper<RolePermission> {
}