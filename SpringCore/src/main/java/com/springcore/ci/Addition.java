package com.springcore.ci;

import java.security.PublicKey;

public class Addition
{	
	private int a;
	
	private int b;

	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
		System.out.println("Consructor : int , int");
	}
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b =(int) b;
		
		System.out.println("Consructor : double , double");
	
	}
		public void doSum()
		{
			System.out.println("Sum is : " +(this.a +this.b));
		}
	
	

}
