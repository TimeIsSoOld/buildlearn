package com.example.sys.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "user_info", autoResultMap = true)
public class UserInfo {


    private String id;
    private String name;
    private Integer age;
    private String phone;


}
