package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
// without xml file 
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration // handles all configuration files
// @ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig 
{
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	@Bean  // it creats the object of return value i.e. it return student
	public Student getStudent()
	{
		// creating a new student object 
		Student student = new Student(getSamosa());
		
		return student;
		
	}
	
	
}
