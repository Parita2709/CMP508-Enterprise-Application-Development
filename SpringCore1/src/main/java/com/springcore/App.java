
package com.springcore;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 *
 */
public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        context = new ClassPathXmlApplicationContext("com/springcore/config1.xml");
        Student s1=(Student)context.getBean("student1");
        System.out.println(s1);
        //context.registerShutdownHook();
    }
}
