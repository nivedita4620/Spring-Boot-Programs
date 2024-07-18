package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component("firststudent") // create bean
public class Student
{
	private Samosa samosa;
	
	
	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	
	Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}


	Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void study()
	{
		this.samosa.display();
		System.out.println("Student reading book..");
	}
}
