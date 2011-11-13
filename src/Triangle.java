/**
 * Triangle class implements the interface Polygon.
 * 
 * @author Gruppe222s
 * 
 */
public class Triangle implements Polygon {

	private double a;
	private double b;
	private double c;

	/**
	 * Constructor for a triangle.
	 * 
	 * @param a
	 *            length of side a
	 * @param b
	 *            length of side b
	 * @param c
	 *            length of side c
	 * @throws InvalidValueException
	 */
	public Triangle(double a, double b, double c) throws InvalidValueException {
		
		if (a <= 0 || b <= 0 || c <= 0) throw new InvalidValueException(a, b, c);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Polygon#edges()s
	 */
	@Override
	public int edges() {
		// a triangle always has 3 edges.
		return 3;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Polygon#area()
	 */
	@Override
	public double area() {
		// Heron's formula is used for the area of an irregular triangle
		// s is half the perimeter
		double s = 1 / 2 * perimeter();

		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Polygon#perimeter()
	 */
	@Override
	public double perimeter() {
		// returns the sum of the three edges.
		return this.a + this.b + this.c;
	}

}
