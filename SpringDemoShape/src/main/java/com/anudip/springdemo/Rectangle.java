package com.anudip.springdemo;

public class Rectangle implements Shape
{
	private String color;
	
	//set method
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void draw()
	{
		System.out.println("Painter is drwaing " +color+ " Rectangle");
	}
	


}
