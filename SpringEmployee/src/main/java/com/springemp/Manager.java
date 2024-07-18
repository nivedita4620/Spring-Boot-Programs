package com.springemp;

import org.springframework.stereotype.Component;

@Component("man")
public class Manager implements Employee
{
	

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work()
	{
		System.out.println("Manager is manageing..");
		
	}

}
