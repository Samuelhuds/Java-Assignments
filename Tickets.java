import java.util.Scanner;
import java.text.DecimalFormat;

public class Tickets {
	public static void main(String[] args) {
		//Setting up decimal format and Scanner
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		//requesting int for A seats sold and double for A seats price
		int ticketA;
		System.out.print("Enter number of A seats sold: ");
		ticketA = input.nextInt();
		double priceA;
		System.out.print("Enter the price of ticket A: ");
		priceA = input.nextDouble();
		//requesting int for B seats sold and double for B seats price
		int ticketB;
		System.out.print("Enter number of B seats sold: ");
		ticketB = input.nextInt();
		double priceB;
		System.out.print("Enter the price of ticket B: ");
		priceB = input.nextDouble();
		//requesting int for C seats sold and double for C seats price
		int ticketC;
		System.out.print("Enter number of C seats sold: ");
		ticketC = input.nextInt();
		double priceC;
		System.out.print("Enter the price of ticket C: ");
		priceC = input.nextDouble();
		//declaring double sales and using calculation to get total sales from A B and C
		double Sales;
		Sales = (ticketA*priceA)+(ticketB*priceB)+(ticketC*priceC);
		//Printing out no. of tickets, ticket price, and total sales in the requested format
		//also using df.format to change the doubles into the format set above
		System.out.println("\n \t \t Tickets Sold \t Price per Ticket");
		System.out.println("\t\t ------------\t ----------------");
		System.out.println("A Tickets:\t\t"+ticketA+ "\t\t" +df.format(priceA) );
		System.out.println("B Tickets:\t\t"+ticketB+ "\t\t" +df.format(priceB) );
		System.out.println("C Tickets:\t\t"+ticketC+ "\t\t" +df.format(priceC) );
		System.out.println("\n\t\t\tTotal Sales €"+df.format(Sales));
		}
}
