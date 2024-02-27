
public abstract class SalesEmployee {
	//declaring private strings for first and last name
	private String firstName;
	private String lastName;
	//optional private static int i didnt end up using
	private static int bikeEmployeeNumber = 1;
	//private string pps number
	private String ppsNumber;
	//protected double sales and commission, done so it can be used in subclasses
	protected double sales;
	protected double commission;
	//optional private int i didnt use
	private int employeeNumber;
	//constructors
	public SalesEmployee() {
	}
	public SalesEmployee(String firstName, String lastName, String ppsNumber) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.ppsNumber = ppsNumber;
	this.employeeNumber = bikeEmployeeNumber++;
	}
	//setters
	public void setFirstName(String a) {
	firstName = a;
	}
	public void setLastName(String b) {
	lastName = b;
	}
	public void setPPS(String c) {
	ppsNumber = c;
	}
	//getters
	public String getFirstName() {
	return firstName;
	}
	public String getLastName() {
	return lastName;
	}
	public String getPPS() {
	return ppsNumber;
	}
	public int getEmployeeNumber() {
	return employeeNumber;
	}
	//toString to return names and pps number
	public String toString() {
	return "Employee name: "+getFirstName()+ " "+getLastName()+", PPS Number: "+getPPS()+" " ;
	}
	//abstract method calculatecommission
	public abstract void calculateCommission();
	

}
