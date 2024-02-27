

import java.util.Scanner;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class ShapesTester {
public static void main(String[]args) {
	//int shape type 1 for circle 2 for rectangle
	int ShapeType;
	//asking for number of shapes
	int numberOfShapes;
	//array list of shapes
	List<Shapes> shapes = new ArrayList<>();
	//setting largest shape to null
	Shapes largest = null;
	Scanner input = new Scanner(System.in);
	//asking user for number of shapes
	System.out.print("Please enter number of shapes: ");
	numberOfShapes = input.nextInt();
	//looping from 0 to number of shapes
	for(int i=0; i<numberOfShapes;i++) {
		System.out.print("Is the shape a Circle or Rectangle? ");
		System.out.print("Type 1 for Circle and 2 for Rectangle: ");
		ShapeType = input.nextInt();
		//if 1 then ask for radius of circle and add a circle to arraylist
		if(ShapeType == 1) {
			System.out.print("Enter Radius: ");
			double rad = input.nextDouble();
			shapes.add(new Circle(rad));
		}
		//if 2 then ask for length and width and add a rectangle to arraylist
		if(ShapeType == 2) {
		System.out.print("Enter length: ");
		double len = input.nextDouble();
		System.out.print("Enter width: ");
		double wid = input.nextDouble();
		shapes.add(new Rectangle(len, wid));
		}
	}
	//call largestshape method and print largest area
	largest = largestShape(shapes);
	System.out.print("Largest Area: "+largest.toString()+"");
	//serialize and deserialize
	serialize(shapes);
	deSerialize();
	}
	//largest shapes method
	public static Shapes largestShape(List<Shapes> list) {
		Shapes largest;
		int index = 0;
		//loops through list using compareShapes to find largest and returns largest
		largest = list.get(index);
		for(int i =0; i<list.size(); i++) {
			list.get(i).calculateArea();
			if(((list.get(i)).compareShapes(largest))>0){
				largest = list.get(i);
			}
		}
		return largest;
	}
	//serialize
	public static void serialize(List<Shapes>list) {
	try {
		FileOutputStream fileStream = new
		FileOutputStream("Shapes.dat");
		ObjectOutputStream os = new ObjectOutputStream(fileStream);
		os.writeObject(list);
		os.close();
	}
		catch(Exception e) {
			e.printStackTrace();
	}
	}
	//deserialize
	public static void deSerialize() {
		try {
			FileInputStream fileStream = new
			FileInputStream("Shapes.dat");
			ObjectInputStream os = new ObjectInputStream(fileStream);
			List<Shapes> shapes = (ArrayList<Shapes>) os.readObject();
		for(Shapes s : shapes) {
			System.out.println(s.toString());
		}
		os.close();
		}
		catch( Exception e) {
			e.printStackTrace();
		}
	}
}