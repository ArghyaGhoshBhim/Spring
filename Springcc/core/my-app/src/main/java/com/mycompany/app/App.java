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
    	
    	//lazy loading-> object are loaded only when they r required
//        System.out.println( "Hello World!" );
        BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring2.xml"));
        //Here spring will make the obj for us and maintain the life cycle
//        Book book=factory.getBean(Book.class);//call by class name
        
//        get the book obj by name
        Book book1=(Book)factory.getBean("book1");//call the setter
        System.out.println(book1);
        
        Book book3=(Book)factory.getBean("book3");//call the constructor
        System.out.println(book3);
      

    }
}