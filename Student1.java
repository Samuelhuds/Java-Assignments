
public class Student1 {
	//Creating a private string name and a private long idNumber
	private String name;
	private long idNumber;
	//creating constructor with no argument
	public Student1() {
	}
	//creating constructor with name and idNumber arguments
	public Student1(String name, long idNumber) {
	this.name=name;
	this.idNumber = idNumber;
	}
	//getters for ID and Name
	public long getID() {
	return idNumber;
	}
	public String getName() {
	return name;
	}
	//Setters for ID and Name
	public void setID(long i) {
	idNumber = i;
	}
	public void setName(String n) {
	name = n;
	}
	//toString
	public String toString() {
	 return "Student name: "+getName()+" , ID Number: "+getID()+"" ;
	 }

}
