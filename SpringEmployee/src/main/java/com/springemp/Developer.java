package com.springemp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Nivedita")
public class Developer implements Employee
{
	@Autowired
	// inject 
	@Qualifier("man")
	
	Employee emp;
	

	public Developer(Employee emp) {
		super();
		this.emp = emp;
	}

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println("Developer is developing..");
		
	}

}
