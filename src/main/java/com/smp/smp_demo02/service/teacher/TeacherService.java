package com.smp.smp_demo02.service.teacher;


import com.smp.smp_demo02.domain.Teacher;

import java.util.List;

public interface TeacherService {

    //增加
    void saveTeacher(Teacher teacher);

    //查找修改
    Teacher findTeacherById(String tid);

    void updateTeacher(Teacher teacher);

    void deleteTeacher(String tid);

    List<Teacher> findAll();
    //用户登录
    Teacher tealogin(Teacher teacher);
}
