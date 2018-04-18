public class Employee {
		String name;
		Address address;
		public Employee(String name) {
			this.name=name;
				}
		public String getName(){
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		}
 class Address {
	 String line;
	 Country country;
	 public Address(String line) {
		 this.line=line;
	 }
	 public String getLine(){
		 return line;
	 }
		 public void setLine(String line){
			 this.line=line;
			 }
			 
class Country {
		String name;
		City city;
		public Country(String name){
			this.name=name;
		}
		public String getName(){
			return name; 
		}
			public void setName(String name){
				this.name=name;
		}
}
class City {
	   String name;
	   public City(String name){
		   this.name=name;
	   }
	   public String getName(){
		   return name;
	   }
		   public void setName(String name){
			   this.name=name;
		   }


		
		
		 	
			  			  
		
	 	
	

