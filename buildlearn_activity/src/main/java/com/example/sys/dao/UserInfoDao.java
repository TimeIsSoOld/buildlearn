package com.example.sys.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sys.entity.UserInfo;
import com.example.sys.pojo.vo.UserTeaObjVO;
import com.example.sys.pojo.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoDao extends BaseMapper<UserInfo> {
    List<UserInfo> getList();

    List<UserVO> getUserVOList();

    List<UserTeaObjVO> UserTeaObjVO();
}
