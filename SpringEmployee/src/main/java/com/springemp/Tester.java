package com.springemp;

import org.springframework.stereotype.Component;

@Component("tes")
public class Tester implements Employee
{
	

	public Tester() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println("Tester can test....");
		
	}

}
