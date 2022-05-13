package com.example.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.sys.dao.UserInfoDao;
import com.example.sys.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


public interface UserInfoService extends IService<UserInfo> {

 List<UserInfo> getList();



}
