package com.cg;

public class Contractor {
	private String name;
	private double rate;
	
	public Contractor(String name, double rate) {
	
		this.name=name;
		this.rate=rate;
	}
	public void displayDetails(){
		
		System.out.println("name          :"+ name);
		System.out.println("rate          : " + rate);
	}
}
