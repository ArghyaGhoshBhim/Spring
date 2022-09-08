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

        BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring2.xml"));
        Library library=factory.getBean(Library.class);

        System.out.println(library);
      

    }
}