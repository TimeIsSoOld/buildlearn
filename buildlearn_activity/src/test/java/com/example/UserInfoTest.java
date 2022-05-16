package com.example;

import com.example.sys.service.UserInfoService;
import com.example.sys.utils.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UserInfoTest {
    @Resource
    private Person person;


    @Resource
    private UserInfoService userInfoService;

    @Test
    void ttt1(){

        System.err.println(person);
    }

    @Test
    void ttt2(){

        System.err.println(userInfoService.getList());
    }

}
