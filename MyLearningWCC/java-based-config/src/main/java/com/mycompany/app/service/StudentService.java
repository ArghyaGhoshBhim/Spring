package com.mycompany.app.service;

import com.mycompany.app.config.ApplicationConfig;
import com.mycompany.app.model.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class StudentService {

    public static void main(String[] args){

        ApplicationContext factory=new AnnotationConfigApplicationContext(ApplicationConfig.class);

//        Creating bean by type.
        Student student=factory.getBean(Student.class);
        System.out.println(student);


    }

}
