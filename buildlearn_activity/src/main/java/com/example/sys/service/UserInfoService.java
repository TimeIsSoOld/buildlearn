package com.example.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.sys.entity.UserInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;


public interface UserInfoService extends IService<UserInfo> {

 PageInfo<UserInfo> getList();



}
