package com.smp.smp_demo02.domain;

import lombok.Data;

@Data
public class Teacher {
    private int tid       ;//教师号
    private String tpassword ;//密码
    private String tname     ;//姓名
    private String tsex      ;//性别
    private int tdeptId  ;//年级号
    private String tphone    ;//电话
    private String temail    ;//邮箱
    private long tstate    ;//备注
}
