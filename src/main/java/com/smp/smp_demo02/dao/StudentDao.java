package com.smp.smp_demo02.dao;


import com.smp.smp_demo02.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("StudentDao")
public interface StudentDao {
    //全查
    @Select("select * from stu")
    List<Student> findAll();

    //增加学生
    @Insert("insert into stu (sid,sname,spassword,ssex,sage,sbirthday,sgradeid,\n" +
            "sdeptid,sjudgeid,sphone,semail,sstate)\n" +
            "values(#{sid},#{sname},#{spassword},#{ssex},#{sage},#{sbirthday},\n" +
            "#{sgradeid},#{sdeptid },#{sjudgeid},#{sphone},#{semail},#{sstate})")
    void saveStudent(Student student);

    //保存修改-->根据id
    @Select("select * from stu where sid=#{sid}")
    Student findBySid(int sid);

    //修改
    @Update("update stu set sname= #{sname},spassword=#{spassword},ssex=#{ssex},sage= #{sage},\n" +
            "sbirthday=#{sbirthday},sgradeid=#{sgradeid},sdeptid=#{sdeptid},\n" +
            "sjudgeid=#{sjudgeid},sphone=#{sphone},semail=#{semail},sstate=#{sstate} where sid =#{sid}")
    void updateStudent(Student student);

    //删除
    @Delete("delete from stu where sid=#{sid}")
    void deleteStudent(int sid);

}
