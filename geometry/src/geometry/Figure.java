package geometry;

// Basic Abstract Figure just contains Length and Height and implements the Interface
public abstract class Figure implements Geometry {

    double length;
    double height;
	
    //Constructor
    public Figure(final double LENGTH, final double HEIGHT) {
    	length = LENGTH;
    	height = HEIGHT;
    }

    //Getter und Setter
    public double getLength() {
        return length;
    }

    public void setLength(final double LENGTH) {
    	length = LENGTH;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(final double HEIGHT) {
    	height = HEIGHT;
    }
}









