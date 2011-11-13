/**
 * Regular Triangle class extends the class Triangle and implements the
 * interface IRegularPolygon
 * 
 * @author Gruppe222
 * 
 */
public class RegularTriangle extends Triangle implements IRegularPolygon {

	private double s;

	/**
	 * The constructor calls the constructor of the super class Triangle.
	 * 
	 * @param s
	 *            length of side
	 * @throws InvalidValueException
	 */
	public RegularTriangle(double s) throws InvalidValueException {

		super(s, s, s);
		this.s = s;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IRegularPolygon#set(double)
	 */
	@Override
	public void set(double s) throws InvalidValueException {
		if (s <= 0) throw new InvalidValueException(s);
		this.s = s;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see IRegularPolygon#scale(double)
	 */
	@Override
	public void scale(double factor) {
		this.s = s * factor;
	}

}
