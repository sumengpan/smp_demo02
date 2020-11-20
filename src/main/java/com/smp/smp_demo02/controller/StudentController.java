package com.smp.smp_demo02.controller;

import com.github.pagehelper.PageInfo;
import com.smp.smp_demo02.domain.Result;
import com.smp.smp_demo02.domain.Student;
import com.smp.smp_demo02.service.student.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController extends BaseController{
    private Logger l= LoggerFactory.getLogger(StudentController.class);
    @Autowired
    StudentService service;
    //列表查询
    @RequestMapping(path="/toList",method = {RequestMethod.GET})
    public String toList(ModelMap modelMap, @RequestParam(defaultValue = "1") int curr, @RequestParam(defaultValue = "10")int pageSize){
        //调查询分页列表的方法
        PageInfo<Student> pi=service.findByPage(curr,pageSize);
        //将pi到页面
        request.setAttribute("pi",pi);

        modelMap.addAttribute("list",list);
        System.out.println((list + "这是student信息"));
        return "/student/student-list";
        //在application.properties里面配置了跳转/Web-INF/pages/user-list.jsp
    }

    //删除
    @RequestMapping(path="/delete",method ={ RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody
    Object delete(int sid){
        //参数接收页面js提交过来的sid
        boolean flag=service.deleteStudent(sid);
        if(flag){
            return Result.init(200,"删除成功",null);
        }else {
            return Result.init(-200,"删除失败",null);
        }
    }
    @RequestMapping(path="/toAdd",method ={ RequestMethod.GET, RequestMethod.POST})
    public String toAdd(){
        //页面上有一个下拉菜单，需要查询所有的部门
        List<Student> students= service.findAllStudents(getLoginSid());
        //添加到request
        request.setAttribute("students",students);
        return "/student/student-add";
    }
    //添加
    @RequestMapping(path="/add",method ={ RequestMethod.GET, RequestMethod.POST})
    public String add(Student student){
        //接收页面传过来的表单数据
        l.info("add student="+student);
        student.setSid(getLoginSid());
        l.info("add student="+student);
        service.saveStudent(student);
        return "redirect:student/toList";
    }
    //修改
    @RequestMapping(path="/toUpdate",method ={ RequestMethod.GET, RequestMethod.POST})
    public String toUpdate(String sid){
        //sid
        l.info("toUpdate sid="+sid);
        //sid，回显
        Student student =  service.findStudentById(sid);
        l.info("toUpdate student="+student);
        request.setAttribute("student",student);
        //页面上有一个下拉菜单 ，需要查询所有的部门
        List<Student> students = service.findAllStudents(getLoginSid());
        //添加到request
        request.setAttribute("students",students);
        return "/student/student-update";
    }
    @RequestMapping(path = "/update", method = {RequestMethod.GET, RequestMethod.POST})
    public String update(Student student) {//需要接收编辑页面提交的表单数据
        l.info("update student=" + student);
        //更新
        service.updateStudent(student);
        return "redirect:student/toList.do";
    }

}
