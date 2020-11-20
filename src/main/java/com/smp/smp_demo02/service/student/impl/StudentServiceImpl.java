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
    StudentDao dao;
    @Override
    public PageInfo<Student> findByPage(int curr, int pageSize) {
        //设置参数
        PageHelper.startPage(curr,pageSize);
        //调用全查

        //包装成pageInfo
        PageInfo<Student> pi = new PageInfo<>(list);
        return pi;
    }
    //添加
    @Override
    public void saveStudent(Student student) {
        dao.saveStudent(student);
    }
    //查找修改
    @Override
    public Student findStudentById(String sid) {
        return dao.findBySid(sid);
    }
    //修改
    @Override
    public void updateStudent(Student student) {
        dao.updateStudent(student);
    }
    //删除
    @Override
    public boolean deleteStudent(int sid) {
        dao.deleteStudent(sid);
        return true;
    }
    //根据id查找
    @Override
    public List<Student> findAllStudents(int sid) {
        return dao.findAll(sid);
    }

}
