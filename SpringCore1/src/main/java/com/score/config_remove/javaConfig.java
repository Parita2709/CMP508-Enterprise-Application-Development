package com.score.config_remove;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Component("p1")
@Configuration
@ComponentScan(basePackages="com.score.config_remove")
public class javaConfig {
	@Bean
	public Person  getPerson()
	{
		Person p1=new Person();
		return p1;
	}
}
