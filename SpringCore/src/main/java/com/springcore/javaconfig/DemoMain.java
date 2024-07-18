package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con =
				new AnnotationConfigApplicationContext(JavaConfig.class);// pass class 
		
		// in student class write @Component("firststudent")
		// Student student = con.getBean("firststudent",Student.class);
		
		// in javaconfig create bean and pass the method getStudent
		// in the javaconfig class it is optionl to write when we use bean @ComponentScan(basePackages = "com.springcore.javaconfig")
		Student student = con.getBean("getStudent",Student.class);
		
		System.out.println(student);
		student.study();
	}

}
