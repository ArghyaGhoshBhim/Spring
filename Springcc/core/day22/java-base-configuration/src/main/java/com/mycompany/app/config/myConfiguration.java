package com.mycompany.app.config;

import com.mycompany.app.model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class myConfiguration {

@Bean(name = "myBook")
@Scope("singleton")
    public Book getBook(){
    return  new Book("spring book",5);
}

}
