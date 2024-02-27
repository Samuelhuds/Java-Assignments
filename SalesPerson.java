import java.util.Scanner;
import java.text.DecimalFormat;

public class SalesPerson extends SalesEmployee {
	public SalesPerson() {
		super();
		}
		public SalesPerson(String firstName, String lastName, String ppsNumber) {
		super(firstName, lastName, ppsNumber);
		}
		//calculate commission
		public void calculateCommission() {
		//decimal format to limit to 2 decimals
		DecimalFormat df = new DecimalFormat("0.00");
		//asks for total sales
		System.out.print("Enter Employee Sales: ");
		Scanner input = new Scanner(System.in);
		sales = input.nextDouble();
		//calculates commission
		commission = sales*0.15;
		//returns commission
		System.out.println("Commission: "+df.format(commission)+" ");
		}
}
