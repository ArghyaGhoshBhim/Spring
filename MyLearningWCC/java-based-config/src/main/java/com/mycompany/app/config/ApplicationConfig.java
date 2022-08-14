package com.mycompany.app.config;


import com.mycompany.app.model.Address;
import com.mycompany.app.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

/**
 * It will scan all the bean which we have declared as @Component with in this basedPackage.
 */
@ComponentScan(basePackages = {"com.mycompany.app.model"})
//By the help of this annotation we are telling that this is our configuration file instead of xml
@Configuration
public class ApplicationConfig {

//    This annotaion used to tell spring that this our bean and here we are creating bean.
    @Bean(initMethod = "myInit")
    public Student getStudentBean(){
        return new Student(18, "virat", null);
    }

/**
    @Bean
    public Address getAdressBean(){
        return new Address("bolpur", "westBengal");

    }
    **/

//    the default name of a bean is class name but first char in small
//    But we can provide name of the bean like below.
 /**   @Bean(name = "adr1")
    public Address getAdressBean1(){
        return new Address("bankura", "westBengal");

    }
**/

}
