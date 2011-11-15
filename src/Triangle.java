/**
 * Triangle class implements the interface Polygon.
 * 
 * @author Gruppe222s
 * 
 */
public class Triangle implements Polygon {

	// length of side a
	protected int a;
	
	// length of side b
	protected int b;
	
	// length of side c
	protected int c;

	/**
	 * Constructor for a triangle.
	 * 
	 * @param a length of side a
	 * @param b length of side b
	 * @param c length of side c
	 * @throws InvalidValueException if one length is smaller than zero
	 */
	public Triangle(int a, int b, int c) throws InvalidValueException {
		
		if (a <= 0 || b <= 0 || c <= 0) 
			throw new InvalidValueException(a, b, c);
		
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
		// a triangle has always 3 edges.
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
		double s = (1 / 2) * perimeter();
		
		return Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
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
	
	/**
	 * Set the side A
	 * @param a new length of side a
	 * @throws InvalidValueException 
	 */
	public void setA(int a) throws InvalidValueException{
		if (a <= 0 ) 
			throw new InvalidValueException(a);
		
		this.a = a;
	}
	
	/**
	 * Set the side B
	 * @param b new length of side b
	 * @throws InvalidValueException 
	 */
	public void setB(int b) throws InvalidValueException{
		if (b <= 0) 
			throw new InvalidValueException(b);
		
		this.b = b;
	}
	
	/**
	 * Set the side C
	 * @param c new length of side c
	 * @throws InvalidValueException 
	 */
	public void setC(int c) throws InvalidValueException{
		if (c <= 0) 
			throw new InvalidValueException(c);
		
		this.c = c;
	}

}
