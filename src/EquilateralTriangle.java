/**
 * Regular Triangle class extends the class Triangle and implements the
 * interface IRegularPolygon
 * 
 * @author Gruppe222
 * 
 */
public class EquilateralTriangle extends Triangle implements IRegularPolygon {

	/**
	 * The constructor calls the constructor of the super class Triangle.
	 * 
	 * @param s length of side
	 * @throws InvalidValueException if side is smaller than zero
	 */
	public EquilateralTriangle(int s) throws InvalidValueException {
		super(s, s, s);	
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
		
		this.a = this.b = this.c = s;
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
		
		this.a = this.b = this.c = this.a * factor;
	}

	/*
	 * (non-Javadoc)
	 * @see Triangle#setA(double)
	 */
	@Override
	public void setA(int a) throws InvalidValueException {
		this.set(a);
	}

	/*
	 * (non-Javadoc)
	 * @see Triangle#setB(double)
	 */
	@Override
	public void setB(int b) throws InvalidValueException {
		this.set(b);
	}

	/*
	 * (non-Javadoc)
	 * @see Triangle#setC(double)
	 */
	@Override
	public void setC(int c) throws InvalidValueException {
		this.set(c);
	}
	
}
