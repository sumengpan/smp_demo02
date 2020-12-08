package com.smp.smp_demo02.controller;

import com.smp.smp_demo02.domain.Result;
import com.smp.smp_demo02.domain.Teacher;
import com.smp.smp_demo02.service.teacher.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController extends BaseController{
    private Logger l= LoggerFactory.getLogger(TeacherController.class);
    @Autowired
    TeacherService teacherService;
    //列表查询
    @RequestMapping(path=" ",method = {RequestMethod.GET})
    public Object getList(){
        List<Teacher> data=teacherService.findAll();
        return Result.init(200,"查询成功",data);
    }

    @RequestMapping(path="/{tid} ",method = {RequestMethod.GET})
    public Object getOne(@PathVariable String tid){
        Teacher teacher=teacherService.findTeacherById(tid);
        return Result.init(200,"查询成功",teacher);
    }

    @RequestMapping(path="/{tid} ",method = {RequestMethod.DELETE})
    public Object deleteOne(@PathVariable String tid){
        try {
            teacherService.deleteTeacher(tid);
            return Result.init(200,"删除成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.init(200,"删除失败",null);
        }
    }

    @RequestMapping(path=" ",method = {RequestMethod.POST})
    public Object createOne(@RequestBody Teacher teacher){
        try {
            teacherService.saveTeacher(teacher);
            return Result.init(200,"新增成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.init(200,"新增失败",null);
        }
    }

    @RequestMapping(path="/{tid} ",method = {RequestMethod.PUT})
    public Object updateOne(@PathVariable String tid,@RequestBody Teacher teacher){
        try {
            teacherService.updateTeacher(teacher);
            return Result.init(200,"修改成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.init(200,"修改失败",null);
        }
    }

}
