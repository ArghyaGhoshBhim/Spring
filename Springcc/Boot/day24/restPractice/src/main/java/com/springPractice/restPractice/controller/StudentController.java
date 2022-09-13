package com.springPractice.restPractice.controller;

import com.springPractice.restPractice.entity.Student;
import com.springPractice.restPractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<ArrayList<Student>> getAllStudent(){
        ArrayList<Student>response=studentService.getAllStudent();
        return new  ResponseEntity<ArrayList<Student>>(response, HttpStatus.FOUND);
    }


    @PostMapping
    public ResponseEntity<Student>saveStudent(@RequestBody Student student){
        Student response=studentService.saveStudent(student);
        return new ResponseEntity<Student>(response, HttpStatus.CREATED);
    }


}
