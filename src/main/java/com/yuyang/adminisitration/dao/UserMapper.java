package com.yuyang.adminisitration.dao;

import com.yuyang.adminisitration.entity.User;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.MyMapper;
@Mapper
public interface UserMapper extends MyMapper<User> {
}