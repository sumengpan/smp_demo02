package com.smp.smp_demo02.service.student.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.smp.smp_demo02.service.student.StudentService;
import com.smp.smp_demo02.dao.StudentDao;
import com.smp.smp_demo02.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private Logger l= LoggerFactory.getLogger(this.getClass());
    @Autowired
    StudentDao studentDao;
    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }


    @Override
    public Student stulogin(Student student) {
        return studentDao.stulogin(student);
    }

    //查找修改
    @Override
    public Student findStudentById(String sid) {
        return studentDao.findBySid(sid);
    }
    //添加
    @Override
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }
    //修改
    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }
    //删除
    @Override
    public void deleteStudent(String sid) {
        studentDao.deleteStudent(sid);
    }


}
