package com.anudip.springdemo;

public class Coffee implements HotDrink
{
	

	@Override
	public void prepareHotDrink() 
	{
		System.out.println("I am preparing Coffee..");
	}

}
