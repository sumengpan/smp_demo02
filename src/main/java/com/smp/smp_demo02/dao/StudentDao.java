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
    @Select("select * from student")
    List<Student> findAll();

    //增加学生
    @Insert("insert into student (sid,sname,spassword,sidcard,ssex,sbirthday,spostatus," +
            "snative,sfolk,shealth,scid,sgid,sdid,sadmissiond,sadmissionm,sstudyway," +
            "saddress,sphone,semail,spower,sstate)\n" +
            "values(#{sid},#{sname},#{spassword},#{sidcard},#{ssex},#{sbirthday},#{spostatus}," +
            "#{snative},#{sfolk},#{shealth},#{scid},#{sgid},#{sdid},#{sadmissiond}," +
            "#{sadmissionm},#{sstudyway},#{saddress},#{sphone},#{semail},#{spower},#{sstate})")
    void saveStudent(Student student);

    //保存修改-->根据id
    @Select("select * from student where sid=#{sid}")
    Student findBySid(String sid);

    //修改
    @Update("update student set sname=#{sname},spassword=#{spassword},sidcard=#{sidcard}," +
            "ssex=#{ssex},sbirthday=#{sbirthday},spostatus=#{spostatus},snative=#{snative}," +
            "sfolk=#{sfolk},shealth=#{shealth},scid=#{scid},sgid=#{sgid},sdid=#{sdid}," +
            "sadmissiond=#{sadmissiond},sadmissionm=#{sadmissionm},sstudyway=#{sstudyway}," +
            "saddress=#{saddress},sphone=#{sphone},semail=#{semail},spower=#{spower}," +
            "sstate=#{sstate} where sid =#{sid}")
    void updateStudent(Student student);

    //删除
    @Delete("delete from student where sid=#{sid}")
    void deleteStudent(String sid);

    //登录查找
    @Select("select * from student where sid=#{sid}")
    Student stulogin(Student student);
}
