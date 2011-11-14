/**
 * Rectangle class
 * 
 * @author Gruppe222
 */
public class Rectangle implements Polygon {

	protected double a;
	protected double b;

	/**
	 * Constructor
	 * 
	 * @param a
	 *            length
	 * @param b
	 *            width
	 */
	public Rectangle(double a, double b) throws InvalidValueException {

		if (a <= 0 || b <= 0) throw new InvalidValueException(a, b);
			
		this.a = a;
		this.b = b;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Polygon#edges()
	 */
	@Override
	public int edges() {
		return 4;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Polygon#area()
	 */
	@Override
	public double area() {
		return a * b;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Polygon#perimeter()
	 */
	@Override
	public double perimeter() {
		return 2 * a + 2 * b;
	}
	
	/**
	 * Scales side a and b by a given Factor
	 * @param factor
	 * @throws InvalidValueException 
	 */
	
	public void scale(double factor) throws InvalidValueException {
		
		if(factor <= 0 ) throw new InvalidValueException(factor);
		this.a = a * factor;
		this.b = b * factor;
	}

}
