package geometry;

public class Rectangle extends Figure {

	//Constructor Rectangle
    public Rectangle(final double LENGTH, final double HEIGHT) {
        super(LENGTH, HEIGHT);
    }

    @Override
    public double calculateArea() {
        return getLength()*getHeight();
    }
    
	@Override
	public double calculateCircumference() {
		return 2 * (getLength() + getHeight());
	}
}
