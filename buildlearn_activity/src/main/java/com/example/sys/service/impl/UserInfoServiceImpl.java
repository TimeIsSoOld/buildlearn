package com.example.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sys.dao.UserInfoDao;
import com.example.sys.entity.UserInfo;
import com.example.sys.pojo.vo.UserTeaObjVO;
import com.example.sys.pojo.vo.UserVO;
import com.example.sys.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfo> implements UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;




    @Override
    public PageInfo<UserInfo> getList() {

        PageHelper.startPage(2,1);


        return new PageInfo<>(this.userInfoDao.getList());

    }

    @Override
    public List<UserVO> getUserVOList() {
        return this.userInfoDao.getUserVOList();
    }


    @Override
    public List<UserTeaObjVO> getUserTeaObjVOList() {
        return this.userInfoDao.UserTeaObjVO();
    }
}
