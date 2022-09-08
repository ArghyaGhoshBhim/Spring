package com.mycompany.app;
import com.mycompany.app.config.myConfiguration;
import com.mycompany.app.model.Book;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory=new AnnotationConfigApplicationContext(myConfiguration.class);
//        Book book1=(Book)factory.getBean("myBook");
        Book book1=(Book)factory.getBean(Book.class);
        System.out.println(book1);
        Book book2=(Book)factory.getBean(Book.class);
        book2.setIsbn(120);
        System.out.println(book2);System.out.println(book1);

    	


    }
}