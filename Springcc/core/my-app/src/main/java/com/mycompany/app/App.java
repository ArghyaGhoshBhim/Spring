package com.mycompany.app;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring2.xml"));
        Book book=factory.getBean(Book.class);
        System.out.println(book);

    }
}
