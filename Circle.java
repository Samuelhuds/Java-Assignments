
import java.io.Serializable;
public class Circle extends Shapes implements ShapesRelate,Serializable{
//declaring doubles radius and PI using Math.PI
private double radius;
private double PI = Math.PI;
public Circle() {
this(0.0);
}
public Circle(double radius) {
this.radius = radius;
}
//setter and getter for radius
public void setRadius(double a) {
radius = a;
}
public double getRadius() {
return radius;
}
//calculate area for circle pi radius^2
public void calculateArea() {
area = Math.PI*(radius * radius);
System.out.println("Circle Area: "+area+"");
}
//toString
public String toString() {
return "Circle Radius: "+getRadius()+", PI "+Math.PI+", Area: "+getArea()+"";
}
}
