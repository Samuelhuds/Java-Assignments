import java.util.Scanner;
public class leapyear {
	public static void main(String[]args){
		//Getting user input for year and assigning new year int to next inputted int
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a year: ");
		int year = input.nextInt();
		//using if loop to check logic statement for most complicated scenario first, if the year is divisible by
		//100 4 and 400, return that the year is a leap year
		if(year%100==0&&year%4==0&&year%400==0) {
		System.out.println(""+year+" is a leap year.");
		}
		//Else statement to check other scenarios
		else {
		//If the year is not divisible by 4 or if the year is divisible by both 4 and 100 (no need to check 400 as already covered above)
		//return that it is not a leap year
		if(year%4!=0||year%4==0&&year%100==0) {
		System.out.println(""+year+" is not a leap year.");
		}
		//here we can just say that it is a leap year as we have eliminated all non leap years in previous loops
		else {
		System.out.println(""+year+" is a leap year.");
		}
		}
		}

}
