package com.score.config_remove;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{



	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(javaConfig.class);
        Person p=(Person)context.getBean("getPerson");
        System.out.println(p);
        p.pname();
	}

}
