
public class Contact {
	//Creating a private string name and a private long Number
	private String name;
	private long number;
	//creating constructor with name and Number arguments
	public Contact(String name, long number) {
	this.name=name;
	this.number = number;
	}
	//getters for Number and Name
	public long getNumber() {
	return number;
	}
	public String getName() {
	return name;
	}
	//Setters for Number and Name
	public void setNumber(long i) {
	number = i;
	}
	public void setName(String n) {
	name = n;
	}
	//toString
	public String toString() {
	 return "Contact name: "+getName()+" , Number: "+getNumber()+"" ;
	 }


}
