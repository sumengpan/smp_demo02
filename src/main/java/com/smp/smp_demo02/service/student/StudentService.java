package com.smp.smp_demo02.service.student;

import com.github.pagehelper.PageInfo;
import com.smp.smp_demo02.domain.Student;

import java.util.List;

public interface StudentService {
    //分页列表显示
    PageInfo<Student> findByPage(int curr, int pageSize);

    //增加
    void saveStudent(Student student);
    //查找修改
    Student findStudentById(String sid);

    void updateStudent(Student student);

    boolean deleteStudent(int sid);

    List<Student> findAllStudents(int sid);
}
