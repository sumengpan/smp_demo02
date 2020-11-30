package com.smp.smp_demo02.service.student;

import com.github.pagehelper.PageInfo;
import com.smp.smp_demo02.domain.Student;

import java.util.List;

public interface StudentService {

    //增加
    void saveStudent(Student student);
    //查找修改
    Student findStudentById(int sid);

    void updateStudent(Student student);

    void deleteStudent(int sid);

    List<Student> findAll();
}
