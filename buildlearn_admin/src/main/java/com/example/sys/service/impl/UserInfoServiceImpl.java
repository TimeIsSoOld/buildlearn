package com.example.sys.service.impl;

import com.example.sys.dao.UserInfoDao;
import com.example.sys.entity.UserInfo;
import com.example.sys.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public List<UserInfo> getList() {
        return userInfoDao.getList();
    }
}
