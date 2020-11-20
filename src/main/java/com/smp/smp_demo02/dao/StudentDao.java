package com.smp.smp_demo02.dao;


import com.smp.smp_demo02.domain.Student;

import java.util.List;

public interface StudentDao {
    //全查
    List<Student> findAll();
    //增加学生
    void saveStudent(Student student);

    //保存修改-->根据id
    Student findBySid(String sid);
    //修改
    void updateStudent(Student student);
    //删除
    void deleteStudent(int sid);

}
