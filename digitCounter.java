import java.util.Scanner;
public class digitCounter {
	public static void main(String[] args) {
		//starter statement
		System.out.println("This Program counts the number of digits in an integer entered by the user. Enter -1 to exit.");
		//int digit is our digit and int end is just a variable to hold the value of digit for the number of digits statement later
		int digit;
		int end;
		//int counter is our counter
		int counter;
		//requesting the first digit from the user and collecting using scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		digit = input.nextInt();
		//while the digit is not equal to minus 1
		while(digit!=-1) {
		//setting counter to 1 for start of while loop each time as every number will be at least 1 integer
		counter = 1;
		//setting the end int to be the same as the digit int
		end = digit;
		//while loop which checks if digit is more than or equal to 10
		while(digit>=10){
		//setting digit to be digit/10 and adding 1 to the counter
		digit = digit/10;
		counter++;
		}
		//once digit is less than 10 print out the end statement and request a new number before the loop resets
		System.out.println("Number of digits in "+end+" is "+counter+" ");
		System.out.print("Enter number: ");
		digit = input.nextInt();
		}
		//if the program is given -1 it will instead just print this termination line and break
		System.out.println("Program terminated...");
		}


}
