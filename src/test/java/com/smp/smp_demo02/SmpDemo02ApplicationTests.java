package com.smp.smp_demo02;

import com.smp.smp_demo02.domain.Student;
import com.smp.smp_demo02.service.student.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@Slf4j
class SmpDemo02ApplicationTests {
    private Logger l= LoggerFactory.getLogger(SmpDemo02ApplicationTests.class);
    @Autowired
    StudentService studentService;

    /*@Test
    void test01() {
        //根据 email查询对应的用户
        int sid = 2017340105;
        String spassword = "123456";
        Student student = studentService.findStudentById(sid);
        System.out.println("test01 student " + student);
        if (student != null) {
            //1:找到
            //比较账号密码
            if (student.getSpassword().equals(spassword)) {
                //正确
                l.info("正确");
                //System.out.println("正确，用户登录");
            } else {
                //密码不对
                l.info("密码不对");
                //System.out.println("密码不对");
            }
        } else {
            //2:没找到
            //用户不存在
            l.info("用户不存在");
            //System.out.println("用户不存在");
        }
    }*/


}
