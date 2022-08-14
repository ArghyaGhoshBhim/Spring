package com.mycompany.app.config;


import com.mycompany.app.model.Address;
import com.mycompany.app.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//By the help of this annotation we are telling that this is our configuration file instead of xml
@Configuration
public class ApplicationConfig {

//    This annotaion used to tell spring that this our bean.
    @Bean
    public Student getStudentBean(){
        return new Student(18, "virat", null);
    }


    @Bean
    public Address getAdressBean(){
        return new Address("bolpur", "westBengal");

    }
    @Bean
    public Address getAdressBean1(){
        return new Address("bankura", "westBengal");

    }


}
