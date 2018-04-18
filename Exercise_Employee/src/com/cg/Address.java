package com.cg;
public class Address {
	String line;
	Country country;
	
	
	public String getLine() {
		return line;
	}
	public void setLine(String line){
		this.line=line;
			}
	
	public void setCountry(Country c1){
		this.country=c1;
	}
	public Country getCountry(){
		return country;
		}
}