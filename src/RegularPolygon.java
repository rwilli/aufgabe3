/**
 * RegularPolygon class implements the interfaces IRegularPolygon and Polygon.
 * 
 * @author Gruppe222
 * 
 */
public class RegularPolygon implements IRegularPolygon {

	private int s;
	private int angle;

	public RegularPolygon(int s, int angle) throws InvalidValueException {

		// The smallest possible RegularPolygon is an equilateral triangle,
		// having three 60 degree angles. Therefore every smaller value is
		// forbidden. Additionally, the side length cannot be smaller than or 0.
		if (s <= 0)
			throw new InvalidValueException(s);
		if (angle < 60)
			throw new InvalidValueException(angle);
		
		this.s = s;
		this.angle = angle;

		if (edges() == -1) {
			throw new InvalidValueException(angle);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Polygon#edges()
	 */
	@Override
	public int edges() {

		try {
			// See if a given angle makes a regular polygon.
			// The following formula is used:
			// n = 2 / (1 - angle/180)
			Fraction f = new Fraction(angle, 180);
			f = f.returnComplement();
			Fraction result = f.divideNumberByFraction(2, f);
			if (result.fractionIsInteger()) {
				return (int) (result.num / result.denom);
			}
		} catch (InvalidValueException e) {

			e.printStackTrace();
		}

		return -1;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Polygon#area()
	 */
	@Override
	public double area() {
		// calculates the area of a regular polygon using the method
		// calculateApothem() to determine the length of a side to the center
		// (measured at 90¡ angle from side)
		double apothem = calculateApothem();
		return 0.5 * perimeter() * apothem;
	}

	/**
	 * Calculates the apothem of a regular polygon.
	 * 
	 * The Apothem is always greater zero
	 * 
	 * @return the apothem as double
	 */
	public double calculateApothem() {
		return this.s / 2 * Math.tan(Math.PI / edges());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Polygon#perimeter()
	 */
	@Override
	public double perimeter() {
		return edges() * s;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IRegularPolygon#set(double)
	 */
	@Override
	public void set(int s) throws InvalidValueException {

		if (s <= 0)
			throw new InvalidValueException(s);

		this.s = s;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IRegularPolygon#scale(double)
	 */
	@Override
	public void scale(int factor) throws InvalidValueException {

		if (factor <= 0)
			throw new InvalidValueException(factor);

		this.s = s * factor;
	}

}
