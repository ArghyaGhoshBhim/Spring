package com.mycompany.app;

import com.mycompany.app.config.MyAppConfig;
import com.mycompany.app.model.Book;
import com.mycompany.app.model.Library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory=new AnnotationConfigApplicationContext(MyAppConfig.class);
//        Book book1=factory.getBean(Book.class);
//        System.out.println("call by type: "+book1);

//        Book book1=(Book) factory.getBean("book");
//        Book book1=(Book) factory.getBean("getBook");
//        System.out.println("call by name: "+book1);
        Library library=factory.getBean(Library.class);
        System.out.println(library);
    }
}
