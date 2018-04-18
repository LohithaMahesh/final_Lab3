package com.cg;

public class Entry {
		
	public static void main(String args[]){
		Employee[] e = new Employee [5];
		Address[] a = new Address[5];
		Country[] c1= new Country[5];
		City[] c2 = new City[5];
		
		int i;
		for(i=0; i<5; i++) {
			e[i] = new Employee();
			a[i]= new Address();
			c1[i]=new Country();
			c2[i]=new City();
	    
		}
			e[0].setName("Lohitha");
		    e[1].setName("Sharika");
		    e[2].setName("Anusha");
		    e[3].setName("Preethi");
		    e[4].setName("Manisha");
		
		    
		    
		    	a[0].setLine("M");
		    	a[1].setLine("T");
		    	a[2].setLine("A");
		    	a[3].setLine("B");
		    	a[4].setLine("D");
		    	
		    	
		    	
		    		c1[0].setName("India");
		    		c1[1].setName("USA");
		    		c1[2].setName("UK");
		    		c1[3].setName("China");
		    		c1[4].setName("Srilanka");
		    		
		    		
		    		
		    			c2[0].setName("Red");
		    			c2[1].setName("Green");
		    			c2[2].setName("Yellow");
		    			c2[3].setName("White");
		    			c2[4].setName("Black");
		    	
		    			for(i=0; i<5; i++) {
		    				e[i].setAddress(a[i]);
		    				a[i].setCountry(c1[i]);
		    				c1[i].setCity(c2[i]);
		    			
		    	System.out.println("Employee name is    	:" +e[i].getName());
		    	System.out.println("Employee Address is	    :" +e[i].getAddress().getLine());
		    	System.out.println("Employee Country is 	:" +e[i].getAddress().getCountry().getName());
		    	System.out.println("Employee city is    	:" +e[i].getAddress().getCountry().getCity().getName());
		    	System.out.println("------------------------------------------------------------------------------------------------");			
		    			}
	}
}

