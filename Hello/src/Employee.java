
public class Employee {
	int empId;
	String firstName;
	String lastName;
	static int count=0;	
	int salary;
	String grade;
    Date joinDate;


public Employee(String fn, String ln, int sal, String grade, Date joinDate) {
	
	this.firstName=fn;
	this.lastName=ln;
	this.salary=sal;
	this.grade=grade;
	this.joinDate=joinDate;
}

public void displayDetails() {
		
	count++;
	System.out.println("empid     :" + empId);
	System.out.println("firstName :" + firstName);
	System.out.println("lastName  :" + lastName);
	System.out.println("salary    :" + salary);
	System.out.println("grade     :" + grade);
	System.out.println("joinDate  :" + joinDate);
}


public Invoice[] getInvoices() {
	return null;
	
}
class Invoice {
	
}
}
}

