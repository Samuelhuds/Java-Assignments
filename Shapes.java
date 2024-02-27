
public abstract class Shapes implements ShapesRelate {
//declaring protected double area
protected double area;
public Shapes() {
super();
}
//getter for Area
public double getArea() {
return area;
}
//abstract method calculateArea
public abstract void calculateArea();
//compare shapes check which shape is largest
public int compareShapes(ShapesRelate other) {
Shapes shape = (Shapes) other;
if(this.getArea()>shape.getArea()){
return 1;
}
else if (this.getArea()>shape.getArea()) {
return -1;
}
else {
return 0;
}
}
}
