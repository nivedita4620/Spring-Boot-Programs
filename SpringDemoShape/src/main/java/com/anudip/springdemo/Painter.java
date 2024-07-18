package com.anudip.springdemo;

public class Painter implements Performer
{
	Shape shape; // reference
	
	
	public Painter(Shape shape) {
		super();
		this.shape = shape;
	}

	@Override
	public void perform()
	{
		shape.draw();
	}
	

}
