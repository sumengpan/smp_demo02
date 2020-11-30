package com.smp.smp_demo02.controller;

import com.smp.smp_demo02.domain.Result;
import com.smp.smp_demo02.domain.Student;
import com.smp.smp_demo02.service.student.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController extends BaseController{
    private Logger l= LoggerFactory.getLogger(StudentController.class);
    @Autowired
    StudentService studentService;
    //列表查询
    @RequestMapping(path=" ",method = {RequestMethod.GET})
    public Object getList(){
        List<Student> data=studentService.findAll();
        return Result.init(200,"查询成功",data);
    }

    @RequestMapping(path="/{sid} ",method = {RequestMethod.GET})
    public Object getOne(@PathVariable int sid){
        Student student=studentService.findStudentById(sid);
        return Result.init(200,"查询成功",student);
    }

    @RequestMapping(path="/{sid} ",method = {RequestMethod.DELETE})
    public Object deleteOne(@PathVariable int sid){
        try {
            studentService.deleteStudent(sid);
            return Result.init(200,"删除成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.init(200,"删除失败",null);
        }
    }

    @RequestMapping(path=" ",method = {RequestMethod.POST})
    public Object createOne(@RequestBody Student student){
        try {
            studentService.saveStudent(student);
            return Result.init(200,"新增成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.init(200,"新增失败",null);
        }
    }
    @RequestMapping(path="/{sid} ",method = {RequestMethod.PUT})
    public Object updateOne(@PathVariable int sid,@RequestBody Student student){
        try {
            studentService.updateStudent(student);
            return Result.init(200,"修改成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.init(200,"修改失败",null);
        }
    }
}
