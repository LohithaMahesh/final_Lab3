
public class Date {
	int date;
	int month;
	int year;
	date joinDate;
	
public Date(int date, int month, int year, date joinDate) {
	this.date=date;
	this.month=month;
	this.year=year;
	this.joinDate=formattedDate;
	
	// @Override
	 public String toString() {
	 	 String formateddate = day + "/" + month + "/" + year;
	 	 return formateddate;
	 	
	 }

	 public Invoice[] getInvoices(){
	 return null;
	 }
	 class Invoice{
	 }

	 }
