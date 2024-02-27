
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		//using scanner input to get array size from the user
		Scanner input = new Scanner(System.in);
		int arraySize;
		//declaring a double sum and setting it to 0 to be used later
		double sum;
		sum = 0;
		//asking for array size and getting it via user input
		System.out.print("Enter size of array: ");
		arraySize = input.nextInt();
		//creating array of type double using size from userinput
		double[] array;
		array = new double[arraySize];
		//for loop from i=0 to length of array
		for(int i=0; i<array.length;i++) {
		//getting user input for each array entry
		System.out.print("Enter Array["+i+"]: ");
		array[i]=input.nextDouble();
		}
		//for loop from i=0 to length of array
		for(int i=0; i<array.length;i++) {
		//printing each array entry out
		System.out.println("Array["+i+"]= "+array[i]+"");
		//using our sum double from earlier to sum each entry
		sum= sum + array[i];
		}
		//printing out sum
		System.out.print("Sum of Array: "+sum+"");
		}


}
