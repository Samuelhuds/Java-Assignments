
public class Student2 {
	//Creating a private string name and a private long idNumber
	private String name;
	private long idNumber;
	private String grade;
	private int[] testScore = new int[3];
	private static final int NUM_TESTS = 3;
	//creating constructor with no argument
	public Student2() {
	this("Unsigned",0);
	}
	//creating constructor with name and idNumber arguments
	public Student2(String name, long idNumber) {
	super();
	this.name=name;
	this.idNumber = idNumber;
	}
	//getters
	public int getTestScore(int index) {
	return testScore[index];
	}
	public int getNum(){
	return NUM_TESTS;
	}
	public String getGrade() {
	return grade;
	}
	public long getID() {
	return idNumber;
	}
	public String getName() {
	return name;
	}
	//Setters
	public void setNum(int j) {
	j=NUM_TESTS;
	}
	public void setID(long i) {
	idNumber = i;
	}
	public void setName(String n) {
	name = n;
	}
	public void setGrade(String m) {
	grade = m;
	}
	public void setTestScore(int index, int marks) {
	testScore[index] = marks;
	}
	//toString
	public String toString() {
	 return "Student name: "+getName()+" , ID Number: "+getID()+", Result:"+getGrade()+"" ;
	 }
	//calculate result
	public void calculateResult() {
	}

}
