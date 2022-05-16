package com.example.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.sys.entity.UserInfo;
import com.example.sys.pojo.vo.UserTeaObjVO;
import com.example.sys.pojo.vo.UserVO;
import com.github.pagehelper.PageInfo;

import java.util.List;


public interface UserInfoService extends IService<UserInfo> {

 PageInfo<UserInfo> getList();

 List<UserVO> getUserVOList();


 List<UserTeaObjVO> getUserTeaObjVOList();


}
