package geometry;

public class RightAngeledTriangle extends Figure{

	private double secondLength;
	private double thirdLength;
	
	//Constructor
	public RightAngeledTriangle(double  LENGTH, double  HEIGHT) {
		super(LENGTH, HEIGHT);
		
	}
	
	//Alternativ Constructor
	public RightAngeledTriangle(double  LENGTH, double  SECONDLENGTH, double  THIRDLENGTH) {
		super(LENGTH, calculateHeight(LENGTH, SECONDLENGTH, THIRDLENGTH));
		this.secondLength = SECONDLENGTH;
		this.thirdLength = THIRDLENGTH;
	}
	
	//Getter and Setter
	public double getSecondLength() {
		return secondLength;
	}

	public void setSecondLength(double secondLength) {
		this.secondLength = secondLength;
	}
	
	public double getThirdLength() {
		return thirdLength;
	}

	public void setThirdLength(int thirdLength) {
		this.thirdLength = thirdLength;
	}
	
	//Static Method to get the Height from the Lengths
	public static double calculateHeight(double  LENGTH, double SECONDLENGTH, double THIRDLENGTH) {
		return Math.sqrt(Math.pow(LENGTH, 2) - Math.pow( (THIRDLENGTH/2) , 2));
	}
	
	@Override
	public double calculateArea() {
		return getLength() * getHeight() * 0.5;
	}
	
	@Override
	public double calculateCircumference() {
		return getLength() + getSecondLength() + getThirdLength();
	}
	
    //The we have the second Side, we also know the third One
	public void applyPythagoras(double SECONDLENGTH) {
		this.secondLength = SECONDLENGTH;
		this.thirdLength = Math.sqrt(Math.pow(length, 2) + Math.pow(secondLength , 2));
		
	}
	
	
	
	
	

}

