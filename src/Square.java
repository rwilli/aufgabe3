/**
 * Square class extends the class Rectangle and implements IRegularPolygon.
 * 
 * @author Gruppe222
 * 
 */
public class Square extends Rectangle implements IRegularPolygon {

	/**
	 * The constructor calls the constructor of the super class Rectangle
	 * 
	 * @param s
	 *            length of side
	 * @throws InvalidValueException
	 */
	public Square(double s) throws InvalidValueException {
		super(s, s);
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
		
		this.a = s;
		this.b = s;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IRegularPolygon#scale(double)
	 */
	@Override
	public void scale(double factor)throws InvalidValueException{
		if(factor <= 0) 
			throw new InvalidValueException(factor); 
		
		super.scale(factor);
	}
	
}
