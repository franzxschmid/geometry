package geometry;

public class Main {
	
	    public static void main(String[] args) {
	       
	    	// 1.1. Creation of Objects
	    	Rectangle rectangle = new Rectangle(100, 100);
	    	RightAngeledTriangle triangle = new RightAngeledTriangle(100, 100);
	    	Circle circle = new Circle(50);
			
	        // 1.2. Calculation of the Area
	        System.out.println("Area of the Rectangle: " +  rectangle.calculateArea() );
	        System.out.println("Area of the Triangle: " + triangle.calculateArea() );
	        System.out.println("Area of the Circle: " + circle.calculateArea() );
			
	        // 2.1. Parameters for the Geometric Calculator in a Geometry Array (Interface)
	        Geometry[] figurs = new Geometry[]{rectangle, triangle, circle};
			
	        // 2.2. Calculation of the complete Area
	        System.out.println("Complete Area: " + GeometricCalculator.calculateCompleteArea( figurs  ) );
	    }
	
}

