package com.smp.smp_demo02.dao;

import com.smp.smp_demo02.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentDaoTest {
    @Autowired
    StudentDao dao;
    //查找所有的学生
    @Test
    void test01() {
        //System.out.println(dao.findAll());
        System.out.println(dao);
        List<Student> list=dao.findAll();
        System.out.println(list);
    }
    //增加学生
    @Test
    void test02(){
        Student student=new Student();
        student.setSid("2016340116");
        student.setSname("李照辉");
        student.setSpassword("123456");
        student.setSsex("男");

        dao.saveStudent(student);
    }

   //更新业务  先根据id查找出对应的一条记录，编辑它的值，再将记录保存到数据库中
    @Test
    public void test03() {
        String sid = "2016340116";
        Student student=dao.findBySid(sid);
        //修改
        student.setSpostatus("共青团员");
        //保存
        dao.updateStudent(student);

    }
     //删除业务，就是根据指定的id，删除数据库中的记录
    @Test
    public void test04() {
        String sid = "1";
        //删除
        dao.deleteStudent(sid);
    }


}
