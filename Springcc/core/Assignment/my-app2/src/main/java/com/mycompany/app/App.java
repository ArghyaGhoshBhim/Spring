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

//        Address address=factory.getBean(Address.class);
//        System.out.println(address);


        Employee employee1=(Employee) factory.getBean("employee1");
        System.out.println(employee1);

        Employee employee2=(Employee) factory.getBean("employee2");
        System.out.println(employee2);
      

    }
}