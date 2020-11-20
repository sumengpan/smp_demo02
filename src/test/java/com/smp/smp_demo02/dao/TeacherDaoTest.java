package com.smp.smp_demo02.dao;

import com.smp.smp_demo02.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TeacherDaoTest {
    /*@Autowired
    TeacherDao dao;
    @Test
    void test01(){
        System.out.println(dao);
        List<TeacherDao> list=dao.findAllTeacher();
        System.out.println(list);
    }
    @Test
    void test02(){
        Teacher teacher=new Teacher();
        teacher.setTid(1010);
        teacher.setTpassword("123456");
        teacher.setTname("朱强");
        teacher.setTsex("男");
        teacher.setTdeptId(1);
        dao.saveTeacher(teacher);
    }
    @Test
    void test03(){
        int tid=1010;
        Teacher teacher=dao.findByTid(tid);
        teacher.setTphone("1543234");
        dao.updateTeacher(teacher);
    }
    @Test
    void test04(){
        int tid=1005;
        dao.deleteTeacher(tid);
    }*/

}
