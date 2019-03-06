package com.pipibing.handson.mapper;

import com.pipibing.handson.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassNameStudentMapper
 * @Description TODO
 * @Author apple
 * @Date 2019/3/6 10:56 AM
 * @Version 1.0
 */
@Mapper
public interface StudentMapper {

    @Select("SELECT * FROM STUDENT WHERE id = #{id}")
    Student findStudent(@Param("id") String id);
}
