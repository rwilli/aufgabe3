/**
 * InvalidValueException class
 * 
 * @author Gruppe222
 */
public class InvalidValueException extends Exception {

	/**
	 * Generated serial ID
	 */
	private static final long serialVersionUID = -8752354250140507631L;

	/**
	 * Message used for Triangle class.
	 * 
	 * @param a
	 *            value of side a of triangle
	 * @param b
	 *            value of side b of triangle
	 * @param c
	 *            value of side c of triangle
	 */
	public InvalidValueException(int a, int b, int c) {
		super("Triangle side lengths: \na = " + a + "\nb = " + b + "\nc = " + c
				+ "\nAll values have to be greater than 0");
	}

	/**
	 * Message for one double value.
	 * 
	 * @param s
	 *            value that caused exception
	 */
	public InvalidValueException(double s) {
		super("Value: " + s + " The value has to be greater than 0");
	}

	/**
	 * Message used for Rectangle class.
	 * 
	 * @param a
	 *            value of side a of rectangle
	 * @param b
	 *            value of side b of rectangle
	 */
	public InvalidValueException(int a, int b) {
		super("Rectangle side lengths: \na = " + a + "\nb = " + b
				+ "\nAll values have to be greater than 0");
	}

	/**
	 * Message for an invalid fraction. Division by 0 has to be avoided.
	 * 
	 * @param denom
	 */
	public InvalidValueException(long denom) {
		super("Denominator value: " + denom + " Denominator cannot be 0");
	}

	/**
	 * Message for an invalid angle
	 * 
	 * @param angle
	 *            the invalid angle causing the exception
	 */
	public InvalidValueException(int angle) {
		super(
				"Invalid angle: "
						+ angle
						+ " degrees. Angle has to be greater equal or greater than 60 degrees and must fit the formula for a regular polygon");
	}

}
