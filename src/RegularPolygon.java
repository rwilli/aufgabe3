/**
 * RegularPolygon class implements the interfaces IRegularPolygon and Polygon.
 * 
 * @author Gruppe222
 * 
 */
//TODO Polygon unnštig ? 
public class RegularPolygon implements IRegularPolygon, Polygon {

	private double s;
	private int angle;

	public RegularPolygon(double s, int angle) throws InvalidValueException {

		// Wieso <0 ? und  <60 ? 
		if (s <= 0) throw new InvalidValueException(s);
		if (angle < 60) throw new InvalidValueException(angle);
		
		this.s = s;
		this.angle = angle;
		
		if (edges() == -1) {
			throw new InvalidValueException(edges(), angle);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Polygon#edges()
	 */
	@Override
	public int edges() {
		
		Fraction f;
		try {
			f = new Fraction(angle, 180);
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
		// TODO
		
		return 0.0;
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
	public void set(double s) throws InvalidValueException {

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
	public void scale(double factor) throws InvalidValueException{
		
		if(factor <= 0) throw new InvalidValueException(factor);
	    this.s = s * factor;
	}

}
