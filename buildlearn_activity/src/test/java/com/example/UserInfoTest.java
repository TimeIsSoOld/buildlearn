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


    @Test
    void ttt1(){

        System.err.println(person);
    }

}
