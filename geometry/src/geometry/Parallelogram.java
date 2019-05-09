package geometry;

public class Parallelogram extends Figure{
	
	private int secondLength;
	private int secondHeight;
	
	//Constructor
	Parallelogram(final int LENGTH, final int HEIGHT){
		super(LENGTH, HEIGHT);
	}
	
	// Getter und Setter
	public int getSecondLength() {
		return secondLength;
	}
	
	public void setSecondLength(int secondLength) {
		this.secondLength = secondLength;
	}
	
	public int getSecondHeight() {
		return secondHeight;
	}
	
	public void setSecondHeight(int secondHeight) {
		this.secondHeight = secondHeight;
	}	
	
	@Override
	public double calculateArea() {
		return getLength() * getHeight();
	}
	
	//Overload Method: calculate with the second Length instead of the Height
	public double calculateArea(int secondLength) {
		return getLength() * secondLength;
	}
	
	@Override
	public double calculateCircumference() {
		return 2 * (getLength() + getSecondLength());
	}

	
}
