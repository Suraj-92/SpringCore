package org.example;
import org.example.Student1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Asd.xml");
        Student1 student1 = (Student1) context.getBean("student1");
        Student1 student2 = (Student1) context.getBean("student2");
        System.out.println(student1);
        System.out.println(student2);
    }
}
