package com.smp.smp_demo02.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.smp.smp_demo02.domain.Student;
import com.smp.smp_demo02.service.student.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class StudentServiceTest {
    private static final Logger l = LoggerFactory.getLogger(StudentServiceTest.class);
    @Autowired
    StudentService service;
    @Test
    public void test01() {
        //分页列表
        //页面上显示分页列表，就要求业务方法中提供查询PageInfo的方法
        //String sgradeId = "3";

        PageHelper.startPage(1,3);
        List<Student> list=service.findAll();
        PageInfo<Student> pi=new PageInfo<>(list);

        l.info("pi = " + pi);
    }
    @Test
    public void test02() {
        //
        //将一个表单数据保存在javaBean中，再将javaBean存到数据库
        Student student = new Student();
        student.setSid(2017340102);
        student.setSname("刘依婷");
        student.setSpassword("123456");
        student.setSsex("女");
        student.setSage("21");
        student.setSbirthday("1999-05-06");
        student.setSgradeId(3);
        student.setSdeptId(1);
        student.setSjudgeId(1);
        student.setSstate(1);
        service.saveStudent(student);

    }
    @Test
    public void test03() {
        //
        //更新业务  先根据id查找出对应的一条记录，编辑它的值，再将记录保存到数据库中
        String sid = "2017340101";
        Student student = service.findStudentById(sid);
        l.info("student=" + student);
        //修改
        student.setSbirthday("1999-03-02");
        //保存
        service.updateStudent(student);

    }
    @Test
    public void test04() {
        //
        //删除业务，就是根据指定的id，删除数据库中的记录
        int sid = Integer.parseInt("2");
        //删除
        service.deleteStudent(sid);

    }
    @Test
    public void test05(){
        int sid = 1;
        List<Student> list = service.findAll();
        l.info("list = " + list);
    }
}
