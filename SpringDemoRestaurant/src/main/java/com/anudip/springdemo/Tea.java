package com.anudip.springdemo;

public class Tea implements HotDrink
{

	@Override
	public void prepareHotDrink()
	{
		System.out.println("I am preparing Tea..");
		
	}
}
