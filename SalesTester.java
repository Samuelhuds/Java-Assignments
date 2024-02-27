import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class SalesTester {
	public static void main(String[]args) {
		//int to check if user wants agent or person added
		int AgentorPerson;
		//int number of employess
		int numberEmployed;
		//array list of sales employees
		List<SalesEmployee> roster = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		//getting number of employess user wishes to add
		System.out.print("Please enter number of sales employees: ");
		numberEmployed = input.nextInt();
		//looping from 0 to number of employees
		for(int i=0; i<numberEmployed;i++) {
		//getting user input for sales person or sales agent
		//1 for agent 2 for person
		System.out.print("Is the employee a Sales Person or Sales Agent?: ");
		System.out.print("Type 1 for Sales Agent and 2 for Sales Person: ");
		AgentorPerson = input.nextInt();
		//if agent
		if(AgentorPerson == 1) {
		//asks for first name last name and pps number
		System.out.print("Enter Employee First Name: ");
		String fName = input.next();
		System.out.print("Enter Employee Second Name: ");
		String sName = input.next();
		System.out.print("Enter Employee PPS: ");
		String PPS = input.next();
		//adding salesagent to roster arraylist
		roster.add(new SalesAgent(fName,sName,PPS));
		}
		if(AgentorPerson == 2) {
		//asks for first name last name and pps number
		System.out.print("Enter Employee First Name: ");
		String fName = input.next();
		System.out.print("Enter Employee Second Name: ");
		String sName = input.next();
		System.out.print("Enter Employee PPS: ");
		String PPS = input.next();
		//adding salesperson to roster arraylist
		roster.add(new SalesPerson(fName,sName,PPS));
		}
		}
		//loops through roster printing tostring then calculating and printing commission using
		//user inputted sales figure
		for(SalesEmployee q : roster) {
		System.out.println(q.toString());
		q.calculateCommission();
		}
		}

}
