package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo
{
	@Value("#{22+12}")
	private int x;
	
	@Value("#{22-11}")
	private int y;

	// method call
	@Value("#{ T(java.lang.Math).sqrt(25)}")
	private int z;
	
	// variable
	@Value("#{T(java.lang.Math).E }")
	private double e;
	
	// object
	@Value("#{new java.lang.String('Nivedita Sonkawade')}")
	private String name;
	
	@Value("#{ 8 > 3}")
	private boolean isActive;
	
	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

	
	
	
}
