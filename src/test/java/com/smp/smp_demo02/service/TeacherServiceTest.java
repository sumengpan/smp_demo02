package com.smp.smp_demo02.service;

import com.github.pagehelper.PageInfo;
import com.smp.smp_demo02.domain.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class TeacherServiceTest {
    /*private static final Logger l = LoggerFactory.getLogger(TeacherServiceTest.class);
    @Autowired
    TeacherService service;
    @Test
    public void test01() {
        //分页列表
        //页面上显示分页列表，就要求业务方法中提供查询PageInfo的方法
        PageInfo<Teacher> pi = service.findByPage(1, 3);
        l.info("pi = " + pi);
    }
    @Test
    public void test02() {
        //
        //将一个表单数据保存在javaBean中，再将javaBean存到数据库
        Teacher teacher = new Teacher();
        teacher.setTid(1009);
        teacher.setTpassword("123456");
        teacher.setTname("向想");
        teacher.setTsex("女");
        teacher.setTdeptId(3);
        service.saveTeacher(teacher);

    }
    @Test
    public void test03() {
        //
        //更新业务  先根据id查找出对应的一条记录，编辑它的值，再将记录保存到数据库中
        int tid = 1010;
        Teacher teacher = service.findTeacherById(tid);
        l.info("teacher=" + teacher);
        //修改
        teacher.setTphone("154324");
        //保存
        service.updateTeacher(teacher);

    }
   @Test
    public void test04() {
        //
        //删除业务，就是根据指定的id，删除数据库中的记录
        int tid = 1009;
        //删除
        service.deleteTeacher(tid);

    }
    @Test
    public void test05(){
        int tid = 1010;
        List<Teacher> list = service.findAll(tid);
        l.info("list = " + list);
    }*/
}
