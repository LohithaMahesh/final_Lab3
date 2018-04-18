package com.cg;

public class contractEmp extends Employee {
	private String name;
	Date joinDate;
	double hoursWork;
	int perHour;
	
	public contractEmp(String name, Date joinDate, double hoursWork, int perhour){
		this.name=name;
		this.joinDate=joinDate;
		this.hoursWork=hoursWork;
		this.perHour=perHour;
		
	}

}
