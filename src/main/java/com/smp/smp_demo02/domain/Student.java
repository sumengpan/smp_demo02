package com.smp.smp_demo02.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Student {
    private String sid;//学号
    private String sname;        //姓名
    private String spassword;    //密码
    private String sidcard;      //身份证号
    private String ssex;         //性别
    private Date sbirthday;  //出生年月
    private String spostatus;    //政治面貌
    private String snative;      //籍贯
    private String sfolk;        //民族
    private String shealth;      //健康状况
    private String scid;         //班级
    private String sgid;         //年级
    private String sdid;         //所属学院
    private Date sadmissiond;//入学时间
    private String sadmissionm;  //入学方式
    private String sstudyway;    //就读方式
    private String saddress;     //家庭住址
    private String sphone;       //电话
    private String semail;       //邮箱
    private int spower;          //权限
    private long sstate;      //备注
}
