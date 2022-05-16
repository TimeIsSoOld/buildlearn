package com.example.sys.pojo.vo;

import com.example.sys.entity.ObjectInfo;
import com.example.sys.entity.TeacherInfo;
import lombok.Data;

import java.util.List;

@Data
public class UserTeaObjVO {

    private String uid;
    private String uname;
    private List<ObjectInfo> objectInfosList;
    private List<TeacherInfo> teacherInfosList;


}
