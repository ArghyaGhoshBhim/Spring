package com.springPractice.restPractice.service;

import com.springPractice.restPractice.dao.StudentDao;
import com.springPractice.restPractice.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class StudentImp implements StudentService{
    @Autowired
    private StudentDao studentDao;
    @Override
    public ArrayList<Student> getAllStudent() {
        return (ArrayList<Student>) studentDao.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        if(student!=null)
        return studentDao.save(student);
        else return null;
    }
}
