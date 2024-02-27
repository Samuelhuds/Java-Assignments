
public class PostGraduateExtendsStudent2 extends Student2 {
	public PostGraduateExtendsStudent2() {
		super();
		}
		//inheriting constructor elements using super
		public PostGraduateExtendsStudent2(String name, long idNumber) {
		super(name, idNumber);
		}
		//calculating the average of student
		public void calculateResult() {
		int total = 0;
		//looping through testscore array and adding values to total
		for(int i=0; i < getNum();i++) {
		total += getTestScore(i);
		}
		//if they have more than or equal to 50 avg return pass else fail
		if(total/getNum()>=50) {
		setGrade("Pass");
		}
		else {
		setGrade("Fail");
		}
	}
}
