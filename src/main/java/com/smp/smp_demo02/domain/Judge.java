package com.smp.smp_demo02.domain;

import lombok.Data;

@Data
public class Judge {
    private int jid       ;//项目号
    private String jname     ;//名称
    private String jclassify ;//分类
    private String jscore    ;//分数
    private String jdescribe ;//描述
    private String jstate    ;//备注
}
