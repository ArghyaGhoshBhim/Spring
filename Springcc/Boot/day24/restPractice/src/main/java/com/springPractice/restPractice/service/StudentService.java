package com.springPractice.restPractice.service;


import com.springPractice.restPractice.dao.StudentDao;
import com.springPractice.restPractice.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public interface StudentService {
    ArrayList<Student> getAllStudent();
    Student saveStudent(Student student);
}
