package com.example.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sys.dao.UserInfoDao;
import com.example.sys.entity.UserInfo;
import com.example.sys.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfo> implements UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;



    @Override
    public List<UserInfo> getList() {

        PageHelper.startPage(1,50);


        return this.list();

    }
}
