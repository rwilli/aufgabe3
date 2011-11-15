/**
 * Quadrangle class stands for any kind of quadrangle object
 * and implements the polygon interface
 * 
 * @author Gruppe222
 */
public abstract class Quadrangle implements Polygon {
	
	// length of side a
	protected int a;
	
	// length of the other side b
	protected int b;

	/*
	 * (non-Javadoc)
	 * @see Polygon#edges()
	 */
	@Override
	public int edges() {
		// quadrangle has always 4 edges
		return 4;
	}

	/*
	 * (non-Javadoc)
	 * @see Polygon#area()
	 */
	@Override
	public double area() {
		// length a and b are greater than zero
		return (this.a * this.b);
	}

	/*
	 * (non-Javadoc)
	 * @see Polygon#perimeter()
	 */
	@Override
	public double perimeter() {
		// length a and b are greater than zero
		return ((2 * this.a) + (2 * this.b));
	}

}
