package com.smp.smp_demo02.controller;

import com.smp.smp_demo02.domain.Student;
import com.smp.smp_demo02.domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//1》子类继承父类，可以自动拥有父类的非私有成员（方法或者变量）
public class BaseController {
    //定义一个可以返回sid
    public int getLoginSid(){
        Student student=(Student) session.getAttribute("loginStudent");
        if(student!=null){
            return student.getSid();
        }else {
            return 1;
        }
    }
    public int getLoginTid(){
        Teacher teacher=(Teacher) session.getAttribute("loginTeacher");
        if(teacher!=null){
            return teacher.getTid();
        }else {
            return 1;
        }
    }
    //2 如果在父类中定义成员变量 request,session,response,并且注入对象
    // 以后控制器方法可以直接使用
    @Autowired
    protected HttpServletRequest request;
    //注入session
    @Autowired
    protected HttpSession session;
    //注入response
    //@Autowired
    protected HttpServletResponse response;//需要disable inspection

}
