
public class client {
	public static void main(String[]args) {
		//int score placeholder for entering score from user
		int score;
		//int pOu or post or undergrade is just for holding value of 1 or 2
		int pOu;
		//creating an arraylist to store students in
		List<Student> roster = new ArrayList<>();
		//scanner input
		Scanner input = new Scanner(System.in);
		//asking user for student info
		System.out.println("Please enter 3 students information: ");
		//loop from 1 to 3
		for(int i=0;i<3;i++) {
		//asking if the student is postgrad or undergrad
		System.out.println("Is the student Undergraduate or Postgraduate?");
		System.out.print("Type 1 for Undergraduate and 2 for Postgraduate.");
		//getting int to check if post or under
		pOu = input.nextInt();
		if(pOu==1) {
		//asking for name
		System.out.print("Enter Student name: ");
		String name = input.next();
		//asking for id
		System.out.print("Enter Student ID: ");
		long idNumber = input.nextLong();
		//adding new undergrad with name and id provided
		roster.add(new UnderGraduate(name,idNumber));
		for(int j=0;j<3;j++) {
		//loop to get 3 test results
		System.out.print("Enter test score "+j+": ");
		score = input.nextInt();
		//j is index score is user inputted mark for that test
		roster.get(i).setTestScore(j,score);
		}
		//calculating result
		roster.get(i).calculateResult();
		}
		if(pOu==2) {
		//getting student name and id
		System.out.print("Enter Student name: ");
		String name = input.next();
		System.out.print("Enter Student ID: ");
		long idNumber = input.nextLong();
		//adding undergrad to arraylist
		roster.add(new UnderGraduate(name,idNumber));
		for(int j=0;j<3;j++) {
		//same as above
		System.out.print("Enter test score "+j+": ");
		score = input.nextInt();
		roster.get(i).setTestScore(j,score);
		}
		//calculating result
		roster.get(i).calculateResult();
		}
		}
		//looping through arraylist and printing contents using toString
		for(Student q : roster) {
		System.out.println(q.toString());
		}
	}
}
