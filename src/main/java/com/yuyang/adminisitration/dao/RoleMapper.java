package com.yuyang.adminisitration.dao;

import com.yuyang.adminisitration.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.MyMapper;
@Mapper
public interface RoleMapper extends MyMapper<Role> {
}