package com.cg;

class contractEmployee extends Contractor {
	private int noOfHours;
	private static int count;
	private Contractor contractor;
	private double salary;
	private String joinDate;
	
	 
	/*public contractEmployee()
		{
		super();
		count=count+1;
		}
	*/
	public contractEmployee() {
		this.noOfHours=noOfHours;
		this.salary=salary;
		this.joinDate=joinDate;
		this.rate=rate;
		// TODO Auto-generated constructor stub
	}
		
	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}

	
	
	public double getSalary() {
		   salary = noOfHours * contractor.getRate();
		   return salary;     
			// TODO Auto-generated method stub
			}

	public void setContractor(Contractor c){
		this.contractor=c;
	
	}
	public Contractor getContractor(){
		return contractor;
	}

	public String getJoinDate() {
		
		return joinDate;
	}
	public void setJoinDate(String joinDate){
		this.joinDate=joinDate;
	}

}