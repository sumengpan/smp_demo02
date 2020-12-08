package com.smp.smp_demo02.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Teacher {
    private String tid;  //教师号
    private String tpassword;  //密码
    private String tname;  //姓名
    private String tsex;  //性别
    private Date tbirthday;  //出生日期
    private String tpostatus;  //政治面貌
    private String tnative;  //籍贯
    private String tfolk;  //民族
    private String tidcard;  //身份证号
    private String tpst;  //职称
    private String tdid;  //所属学院
    private String tphone;  //电话
    private String temail;  //邮箱
    private int tpower;  //权限
    private String tstate;  //备注
}
