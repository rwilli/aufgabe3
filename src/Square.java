/**
 * Square class extends the class Rectangle and implements IRegularPolygon.
 * 
 * @author Gruppe222
 * 
 */
public class Square extends Quadrangle implements IRegularPolygon {

	/**
	 * The constructor calls the constructor of the super class Rectangle
	 * 
	 * @param s length of side
	 * @throws InvalidValueException if side is smaller than zero
	 */
	public Square(double s) throws InvalidValueException {
		this.a = this.b = s;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IRegularPolygon#set(double)
	 */
	@Override
	public void set(double s) throws InvalidValueException {
		// set side of the square if it is taller than zero
		// otherwise throw exception
		if (s <= 0)
			throw new InvalidValueException(s);
		
		this.a = this.b = s;
	}

    /* (non-Javadoc)
	 * 
	 * @see IRegularPolygon#scale(double)
	 */
	@Override
	public void scale(double factor) throws InvalidValueException {
		// scale square with given factor if factor is taller than zero
		// otherwise throw exception
		if(factor <= 0) 
			throw new InvalidValueException(factor); 
		
		this.a = this.b = a * factor;
	}
	
}
