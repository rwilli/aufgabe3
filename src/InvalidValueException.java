	/**
 * @author Gruppe222
 * 
 */
public class InvalidValueException extends Exception {

	/**
	 * Generated serial ID
	 */
	private static final long serialVersionUID = -8752354250140507631L;

	public InvalidValueException(double a, double b, double c) {
		super("Triangle side lengths: \na = " + a + "\nb = " + b + "\nc = " + c
				+ "\nAll values have to be greater than 0");
	}

	public InvalidValueException(double s) {
		super("Side length: " + s + " The value has to be greater than 0");
	}

	public InvalidValueException(double a, double b) {
		super("Rectangle side lengths: \na = " + a + "\nb = " + b
				+ "\nAll values have to be greater than 0");
	}
	
	public InvalidValueException(long denom) {
		super("Denominator value: " + denom + " Denominator cannot be 0");
	}
	
	public InvalidValueException(int angle) {
		super("Invalid angle: " + angle + " degrees. Angle has to be greater equal or greater 60");
	}
	
	public InvalidValueException(int edges, int angle) {
		super("Invalid angle: " + angle + " degrees. Angle has to fit the formula for Regular Polygon");
	}
}
