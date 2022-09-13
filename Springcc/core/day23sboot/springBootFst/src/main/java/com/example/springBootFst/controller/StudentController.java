package com.example.springBootFst.controller;


import com.example.springBootFst.model.Student;
import com.example.springBootFst.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("student")
public class StudentController {
    private ArrayList<Student>students=new ArrayList<>();

    @Autowired
    private StudentService service;

    StudentController(){
        students.add(new Student("ram", (byte) 25, 'A', 5, 85, 'M', 1));
        students.add(new Student("sam", (byte)20, 'C', 4, 65, 'M', 2));
        students.add(new Student("rini", (byte)25, 'C', 2, 75, 'F', 3));
        students.add(new Student("ram", (byte)25, 'A', 6, 35, 'M', 4));
        students.add(new Student("ram", (byte)25, 'B', 5, 85, 'M', 5));
        students.add(new Student("sam", (byte)20, 'B', 4, 65, 'M', 6));
        students.add(new Student("rini", (byte)25, 'D', 2, 75, 'F',7));
        students.add(new Student("ram", (byte)25, 'A', 6, 35, 'M', 8));
    }


    @GetMapping
    public ResponseEntity<ArrayList<Student>>getListStudent(){
        return new ResponseEntity<ArrayList<Student>>(students, HttpStatus.FOUND);
    }

    @PostMapping("addStudent")
    public ResponseEntity<Student>addStudent(@RequestBody Student student){
        students=service.addStudent(students, student);
        return new ResponseEntity<Student>(student, HttpStatus.CREATED);
    }

    @DeleteMapping("deleteByName/{name}")
    public ResponseEntity<ArrayList<Student>> deleteStudentByName(@PathVariable String name){
        ArrayList<Student>deletedStudents=service.deleteStudentByName(students, name);
        students.removeAll(deletedStudents);
        return new ResponseEntity<ArrayList<Student>>(deletedStudents, HttpStatus.CREATED);
    }

    @DeleteMapping("deleteBySem/{sem}")
    public ResponseEntity<ArrayList<Student>> deleteStudentByName(@PathVariable int sem){
        ArrayList<Student>deletedStudents=service.deleteStudentBySem(students, sem);
        students.removeAll(deletedStudents);
        return new ResponseEntity<ArrayList<Student>>(deletedStudents, HttpStatus.CREATED);
    }

    @GetMapping("getByDiv/{div}")
    public ResponseEntity<ArrayList<Student>>getStudentByDiv(@PathVariable char div){
        ArrayList<Student>list=service.getStudentByDiv(students, div);
        return new ResponseEntity<ArrayList<Student>>(list, HttpStatus.FOUND);
    }

    @GetMapping("getBySem/{sem}")
    public ResponseEntity<ArrayList<Student>>getStudentByDiv(@PathVariable int sem){
        ArrayList<Student>list=service.getStudentBySem(students, sem);
        return new ResponseEntity<ArrayList<Student>>(list, HttpStatus.FOUND);
    }


    @GetMapping("getMarks/{marks}")
    public ResponseEntity<ArrayList<Student>> getMarks(@PathVariable int marks){
        ArrayList<Student>list=service.getMarks(students, marks);
        return new ResponseEntity<ArrayList<Student>>(list, HttpStatus.FOUND);
    }



    @PutMapping("update")
    public ResponseEntity<Student>updateStudent(@RequestBody Student student){

        Student std= service.updateStudent(students, student.getId());
        students.remove(std);
        students.add(student);
        return new ResponseEntity<Student>(student,HttpStatus.CREATED);
    }



}
