package geometry;

public class Circle implements Geometry{
	
	int radius;
	int diameter;
	boolean isDiameter;
	
	//Constructor using the Radius
	public Circle(int radius){
		this.radius = radius;
	}
	
	//Constructor using the Diameter
	public Circle(int diameter, boolean isDiameter){
		this((diameter/2));
	}
	
	@Override
	public double calculateArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	@Override
	public double calculateCircumference() {
		return 2 * radius * Math.PI;
	}
	
}
