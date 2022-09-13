package com.example.springBootFst.service;


import com.example.springBootFst.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


    public ArrayList<Student>addStudent(ArrayList<Student>students, Student student){
        students.add(student);
        return students;
    }

    public ArrayList<Student>deleteStudentByName(ArrayList<Student>students, String name){
        ArrayList<Student>deleteStudents=new ArrayList<>();
        for(Student student:students){
            if(student.getName().equals(name)){
                deleteStudents.add(student);
                System.out.println(student);
            }
        }
        return deleteStudents;
    }

    public ArrayList<Student>deleteStudentBySem(ArrayList<Student>students, int sem){
        ArrayList<Student>deleteStudents=new ArrayList<>();
        for(Student student:students){
            if(student.getSem()==sem){
                deleteStudents.add(student);
                System.out.println(student);
            }
        }
        return deleteStudents;
    }


    public ArrayList<Student>getStudentByDiv(ArrayList<Student>students, char div) {
        ArrayList<Student>listStudent=new ArrayList<>();
        for(Student student:students){
            if(student.getDivision()==div){
                listStudent.add(student);
                System.out.println(student);
            }
        }
        return listStudent;
    }
    public ArrayList<Student>getStudentBySem(ArrayList<Student>students, int sem) {
        ArrayList<Student>listStudent=new ArrayList<>();
        for(Student student:students){
            if(student.getSem()==sem){
                listStudent.add(student);
                System.out.println(student);
            }
        }
        return listStudent;
    }



    public ArrayList<Student>getMarks(ArrayList<Student>students, int marks){
        ArrayList<Student>list=new ArrayList<>();
        for(Student student:students){
            if(student.getMarks()>=marks){
                list.add(student);
            }
        }
        return list;
    }

    public Student updateStudent(ArrayList<Student>students, int id){
        for(Student student:students){
            if(student.getId()==id){
                return  student;
            }
        }
        return null;

    }


}
