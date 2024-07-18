package com.anudip.springdemo;

/*object-> Tea and Coffee
 * Injection of tea and coffee class possible way
 *  2 ways
1. constructor
2. setter way*/

public class Resturant 
{
	//by using constructor
	HotDrink hotdrink; // reference of HotDrink interface
	
	String welcomeNote;
	
	public Resturant(HotDrink hotDrink) // pass hotDrink
	{
		super();
		this.hotdrink = hotDrink;
	}


	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}


	void prepareDrink()
	{
		hotdrink.prepareHotDrink();
	}

	void greetCustomer()
	{
		System.out.println(welcomeNote);
	}
	
}
