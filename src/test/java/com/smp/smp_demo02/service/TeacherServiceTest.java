package com.smp.smp_demo02.service;

import com.smp.smp_demo02.domain.Teacher;
import com.smp.smp_demo02.service.teacher.TeacherService;
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
    private static final Logger l = LoggerFactory.getLogger(TeacherServiceTest.class);
    @Autowired
    TeacherService service;
    @Test
    public void test01() {
        List<Teacher> list=service.findAll();
        System.out.println(list);
    }
    @Test
    public void test02() {
        //
        //将一个表单数据保存在javaBean中，再将javaBean存到数据库
        Teacher  teacher= new Teacher();
        teacher.setTid("1004");
        teacher.setTname("张海花");
        teacher.setTpassword("123456");
        teacher.setTsex("女");
        service.saveTeacher(teacher);

    }
   @Test
    public void test03() {
        //
        //更新业务  先根据id查找出对应的一条记录，编辑它的值，再将记录保存到数据库中
        String tid = "1004";
        Teacher teacher = service.findTeacherById(tid);
        l.info("teacher=" + teacher);
        //修改
       teacher.setTpostatus("中共党员");
        //保存
        service.updateTeacher(teacher);

    }
    @Test
    public void test04() {
        //
        //删除业务，就是根据指定的id，删除数据库中的记录
        String tid ="1";
        //删除
        service.deleteTeacher(tid);

    }
}
