package com.smp.smp_demo02.service.student;

import com.smp.smp_demo02.domain.Student;

import java.util.List;

public interface StudentService {

    //增加
    void saveStudent(Student student);
    //查找修改
    Student findStudentById(String sid);

    void updateStudent(Student student);

    void deleteStudent(String sid);

    List<Student> findAll();
    //用户登录
    Student stulogin(Student student);
}
