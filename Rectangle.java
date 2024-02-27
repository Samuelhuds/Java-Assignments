
import java.io.Serializable;
public class Rectangle extends Shapes implements ShapesRelate,Serializable{
	//declaring private doubles
	private double length;
	private double width;
	public Rectangle() {
		this(0.0,0.0);
	}
	public Rectangle(double length, double width) {
		this.length=length;
		this.width = width;
	}
	//getters and setters for length and width
	public void setLength(double a) {
		length = a;
	}
	public void setWidth(double b) {
		width = b;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	//toString
	public String toString() {
		return "Rectangle length: "+getLength()+", Rectangle Width: "+getWidth()+", Rectangle Area: "+getArea()+"";
	}
	//calculate area of rectangle length * width
	public void calculateArea() {
		area = length*width;
		System.out.println("Rectangle Area: "+area+"");
	}
}