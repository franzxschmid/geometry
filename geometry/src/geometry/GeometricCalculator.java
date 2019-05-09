package geometry;

public class GeometricCalculator {

    public static double calculateCompleteArea(final Geometry[] f) {
        
    	double result = 0;
    	
        for (Geometry figur : f) {
            result += figur.calculateArea();
        }
        return result;
    }
	
}
