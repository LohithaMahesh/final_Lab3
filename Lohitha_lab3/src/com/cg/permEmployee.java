package com.cg;

import java.util.ArrayList;
import java.util.Scanner;

public class permEmployee {
	public static String name;
	public static String joinDate;
	public static String salary;
permEmployee() {}	
	static Scanner sc = new Scanner(System.in);
    static Scanner sd = new Scanner(System.in);
    static int tempvar;
    static int tempEmpNo;
    static ArrayList<permEmployee> list = new ArrayList<permEmployee>();

    static String names[] = { "Lohitha", "Sharika", "Anusha", "Madhav", "Sahir" };
    static String joinDates[] = {  "14-Aug-2018", "14-Aug-2018", "14-Aug-2018","14-Aug-2018","14-Aug-2018"};
    static String salaries[] = {"20000.00","20000.00", "20000.00", "20000.00","20000.00"};
    
    public static void main(String[] args) 
    {
        for (int i = 0; i < 5; i++) {
            name = names[i];
            joinDate = joinDates[i];
            salary = salaries[i];

            permEmployee p = new permEmployee(name, joinDate, salary);
            list.add(p);
         	
                   
}
        }
}