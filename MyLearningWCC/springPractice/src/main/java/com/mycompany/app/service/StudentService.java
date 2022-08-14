package com.mycompany.app.service;

import com.mycompany.app.model.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.FileSystemResource;

import javax.security.auth.x500.X500Principal;

public class StudentService {

    public static void main(String[] args){
//        Student student=new Student();
//        student.setName("arghya");
//        student.setRollNumber(10);

//        Student student=new Student(10, "arghya");

//        Now we will put all our xml configuration into the java program
//        Here we making a bean factory which produce bean or object for us WHEN IT IS REQUIRED.
//        lazy loading
//        BeanFactory factory= new XmlBeanFactory(new FileSystemResource("spring.xml"));

//        We have tell the factory what bean i want from factory.
//        factory.getBean("student") here we passing id of the bean.(<bean id="student" class="com.mycompany.app.model.student">)
//        Student student=(Student) factory.getBean("student");
//        System.out.println(student);
//        Student student1=(Student) factory.getBean("student1");
//        System.out.println(student1);

//        Autowire bytype
//        Student student2=(Student) factory.getBean("student2");
//        System.out.println("student2"+student2);

//        name -> search for a bean of requiredName(address) and inject it
//        Student student3=(Student) factory.getBean("student3");
//        System.out.println("student3"+student3);





//        *********************************Scope************************
/**        By default the scope of the bean is single turn ->means create only one object once or for every object memory location is same.
 *
 */
        BeanFactory factory=new XmlBeanFactory(new FileSystemResource("scope.xml"));
        Student student=(Student) factory.getBean("student");

        Student student1=(Student) factory.getBean("student");
        student1.setName("bapi");
        System.out.println(student1);
        System.out.println(student);


    }

}
