package com.anudip.springdemo;

public class Singer implements Performer
{

	@Override
	public void perform()
	{
		System.out.println("Singer is Singing..");
	}

}
