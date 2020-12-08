package com.smp.smp_demo02.dao;

import com.smp.smp_demo02.domain.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("TeacherDao")
public interface TeacherDao {
    //全查
    @Select("select * from teacher")
    List<Teacher> findAll();

    //增加
    @Insert("insert into teacher (tid,tpassword,tname,tsex,tbirthday,tpostatus," +
            "tnative,tfolk,tidcard,tpst,tdid,tphone,temail,tpower,tstate)\n" +
            "values (#{tid},#{tpassword},#{tname},#{tsex},#{tbirthday},#{tpostatus},#{tnative}," +
            "#{tfolk},#{tidcard},#{tpst},#{tdid},#{tphone},#{temail},#{tpower},#{tstate})")
    void saveTeacher(Teacher teacher);

    //保存修改-->根据id
    @Select("select * from teacher where tid=#{tid}")
        Teacher findByTid(String tid);

    //修改
    @Update("update teacher set tpassword=#{tpassword},tname=#{tname},tsex=#{tsex}," +
            "tbirthday=#{tbirthday},tpostatus=#{tpostatus},tnative=#{tnative},tfolk=#{tfolk}," +
            "tidcard=#{tidcard},tpst=#{tpst},tdid=#{tdid},tphone=#{tphone},temail=#{temail}," +
            "tpower=#{tpower},tstate=#{tstate} where tid=#{tid}")
    void updateTeacher(Teacher teacher);

    //删除
    @Delete("delete from teacher where tid=#{tid}")
    void deleteTeacher(String tid);
    //登录查找
    @Select("select * from teacher where tid=#{tid}")
    Teacher tealogin(Teacher teacher);
}
