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
        //System.out.println(dao.findAllStudent());
        System.out.println(dao);
        List<StudentDao> list=dao.findAllStudent();
        System.out.println(list);
    }
    //增加学生
    @Test
    void test02(){
        Student student=new Student();
        student.setSid(2017340106);
        student.setSname("张三");
        student.setSpassword("123456");
        student.setSsex("男");
        student.setSage("22");
        student.setSbirthday("19991111");
        student.setSgradeId(2);
        student.setSdeptId(2);
        student.setSstate(1);
        student.setSjudgeId(3);
        dao.saveStudent(student);
    }

    //更新业务  先根据id查找出对应的一条记录，编辑它的值，再将记录保存到数据库中
    @Test
    public void test03() {
        String sid = "2017340106";
        Student student=dao.findBySid(sid);
        //修改
        student.setSbirthday("1998-11-11");
        //保存
        dao.updateStudent(student);

    }
    //删除业务，就是根据指定的id，删除数据库中的记录
    @Test
    public void test04() {
        String sid = "000";
        //删除
        dao.deleteStudent(Integer.parseInt(sid));
    }
}
