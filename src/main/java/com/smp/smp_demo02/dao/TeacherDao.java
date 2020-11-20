package com.smp.smp_demo02.dao;


import com.smp.smp_demo02.domain.Teacher;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TeacherDao extends Mapper {
    List<TeacherDao> findAllTeacher();

    void saveTeacher(Teacher teacher);

    Teacher findByTid(int tid);

    void updateTeacher(Teacher teacher);

    void deleteTeacher(int tid);

    List<Teacher> findAll(int tid);
}
