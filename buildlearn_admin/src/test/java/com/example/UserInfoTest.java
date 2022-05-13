package com.example;

import com.example.sys.service.UserInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UserInfoTest {
    @Resource
    private UserInfoService userInfoService;


    @Test
    void ttt1(){

        System.err.println(userInfoService.getList());
    }

}
