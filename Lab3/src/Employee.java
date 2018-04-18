class Employee {
	private String name;
	private double salary;
	Date joinDate;
	private static int count;
	public Employee(String name, double salary, int count, Date joinDate) {
		this.name=name;
		this.salary=salary;
		this.count=count++;
		this.joinDate=joinDate;
	}

public void displayDetails(){
	
System.out.println("name          :"+ name);
System.out.println("salary        : " + salary);
System.out.println("joining date  :" + joinDate);
}


public Invoice[] getInvoices(){
return null;
}
class Invoice{
}
}
