package com.smp.smp_demo02.dao;

import com.smp.smp_demo02.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TeacherDaoTest {
    @Autowired
    TeacherDao teacherDao;
    @Test
    void test01() {
        //System.out.println(dao.findAll());
        System.out.println(teacherDao);
        List<Teacher> list=teacherDao.findAll();
        System.out.println(list);
    }
    //增加
    @Test
    void test02(){
        Teacher teacher=new Teacher();
        teacher.setTid("1010");
        teacher.setTname("胡骁");
        teacher.setTpassword("123456");
        teacher.setTsex("女");
        teacherDao.saveTeacher(teacher);
    }

   //更新业务  先根据id查找出对应的一条记录，编辑它的值，再将记录保存到数据库中
    @Test
    public void test03() {
        String tid = "1003";
        Teacher teacher=teacherDao.findByTid(tid);
        //修改
        teacher.setTpostatus("中共党员");
        //保存
        teacherDao.updateTeacher(teacher);

    }
     //删除业务，就是根据指定的id，删除数据库中的记录
    @Test
    public void test04() {
        String tid = "1";
        //删除
        teacherDao.deleteTeacher(tid);
    }


}
