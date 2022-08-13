package com.mycompany.app.service;

import com.mycompany.app.model.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class StudentService {

    public static void main(String[] args){
//        Student student=new Student();
//        student.setName("arghya");
//        student.setRollNumber(10);

//        Now we will put all our xml configuration into the java program
//        Here we making a bean factory which produce bean or object for us WHEN IT IS REQUIRED.
//        lazy loading
        BeanFactory factory= new XmlBeanFactory(new FileSystemResource("spring.xml"));

//        We have tell the factory what bean i want from factory.
//        factory.getBean("student") here we passing id of the bean.(<bean id="student" class="com.mycompany.app.model.student">)
        Student student=(Student) factory.getBean("student");
        System.out.println(student);


    }

}
