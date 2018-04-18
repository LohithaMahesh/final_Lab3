package util.com.cg;

public class Employee {
	int empid;
	String firstName;
	String lastName;
	static int count=1001;	
	int salary;
	String grade;
	
	
public Employee(String fn, String ln, int sal, String grade, int dd, int mm, int yyyy) {
				count++;
				this.empid=count++;
				this.firstName=fn;
				this.lastName=ln;
				this.salary=sal;
				this.grade=grade;
}
public void displayDetails() {
System.out.println("id"+ id);
System.out.println("firstName"+ firstName);
System.out.println("lastName"+ lastName);
System.out.println("salary"+ salary);
System.out.println("grade"+ grade);
}
	