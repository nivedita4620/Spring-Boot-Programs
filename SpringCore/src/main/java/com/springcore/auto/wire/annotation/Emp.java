package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp
{
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	public void setAddress(Address address) {
		System.out.println("Setting value");
		this.address = address;
		
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Consructor..");
	}


}
