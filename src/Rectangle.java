/**
 * Rectangle class extends quadrangle
 * 
 * @author Gruppe222
 */
public class Rectangle extends Quadrangle {
	
	/**
	 * Constructor
	 * 
	 * @param a length of side a
	 * @param b length of side b
	 * @throws InvalidValueException if one side is smaller than zero
	 */
	public Rectangle(int a, int b) throws InvalidValueException {

		if (a <= 0 || b <= 0) 
			throw new InvalidValueException(a, b);
			
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Scales side a and b by a given factor
	 * 
	 * @param factor to scale
	 * @throws InvalidValueException if factor is smaller than zero
	 */
	public void scale(int factor) throws InvalidValueException {
		// scale rectangle 
		if(factor <= 0 ) 
			throw new InvalidValueException(factor);
		
		this.a = a * factor;
		this.b = b * factor;
	}

}
