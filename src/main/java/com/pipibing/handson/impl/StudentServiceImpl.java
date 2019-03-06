package com.pipibing.handson.impl;

import com.pipibing.handson.api.StudentService;
import com.pipibing.handson.mapper.StudentMapper;
import com.pipibing.handson.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassNameStudentServiceImpl
 * @Description TODO
 * @Author apple
 * @Date 2019/3/6 9:35 AM
 * @Version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public Student getStudent(Student id) {
        return studentMapper.findStudent(id.getId());
    }
}
