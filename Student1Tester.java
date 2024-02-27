
public class Student1Tester {
	public static void main(String[]args) {
		//creating array of type student
		Student[]cs;
		cs = new Student[4];
		//creating four students with different names and IDs
		Student student1 = new Student("Bill",18467574);
		Student student2 = new Student("Chris",18465747);
		Student student3 = new Student("Ted",18467832);
		Student student4 = new Student("Joe",19467583);
		//assigning the four students to the array
		cs[0]=student1;
		cs[1]=student2;
		cs[2]=student3;
		cs[3]=student4;
		//looping through the array using the toString to print name and ID for each entry
		for(int i=0; i<cs.length;i++) {
		System.out.println(cs[i].toString());
		}
		}
}
