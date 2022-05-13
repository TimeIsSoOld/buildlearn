package com.example.sys.dao;


import com.example.sys.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoDao {
    List<UserInfo> getList();
}
