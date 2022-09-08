package com.mycompany.app.config;
import com.mycompany.app.model.Book;
import com.mycompany.app.model.Library;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Scan all the bean associate with this base package.
 */

@ComponentScan(basePackages = {"com.mycompany.app"})
/**
 * We are telling the spring container
 * that this is our configuration class.
 */

@Configuration
public class MyAppConfig {
    /**
     * Telling that spring that is my Bean class.
     * The default bean name or id is getBook.
     * @Bean(name = "book")---------->now our bean name is 'book'
     *
     */
//    @Bean(name = "book")
//    public Book getBook(){
//        return new Book("My book name", 1200);
//    }

//    @Bean(name = "book1")
//    public Book getBook1(){
//        return new Book("My book name1", 12001);
//    }

    @Bean
    public Library getLibrary(){
        return  new Library("lib name", null);
    }

}
