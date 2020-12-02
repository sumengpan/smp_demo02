package com.smp.smp_demo02.domain;

import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class Student {
    private int sid;//学号、账号、用户名
    private String sname;//姓名
    private String spassword;//密码
    private String ssex;//性别
    private String sage;//年龄
    private String sbirthday;//生日
    private int sgradeid;//班级号
    private int sdeptid;//年级号
    private int sjudgeid;//得分
    private String sphone;//电话
    private String semail;//邮箱
    private long sstate;//备注

}
