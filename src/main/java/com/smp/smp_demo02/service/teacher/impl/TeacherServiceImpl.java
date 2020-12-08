package com.smp.smp_demo02.service.teacher.impl;

import com.smp.smp_demo02.dao.TeacherDao;
import com.smp.smp_demo02.domain.Teacher;
import com.smp.smp_demo02.service.teacher.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {
    private Logger l= LoggerFactory.getLogger(this.getClass());
    @Autowired
    TeacherDao teacherDao;

    @Override
    public void saveTeacher(Teacher teacher) {
        teacherDao.saveTeacher(teacher);
    }

    @Override
    public Teacher findTeacherById(String tid) {
        return teacherDao.findByTid(tid);
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        teacherDao.updateTeacher(teacher);
    }

    @Override
    public void deleteTeacher(String tid) {
        teacherDao.deleteTeacher(tid);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherDao.findAll();
    }

    @Override
    public Teacher tealogin(Teacher teacher) {
        return teacherDao.tealogin(teacher);
    }
}
