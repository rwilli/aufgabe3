/**
 * Interface IRegularPolygon extends Polygon.
 * 
 * @author Gruppe222
 */
public interface IRegularPolygon extends Polygon {

	/**
	 * Sets the length of every side of the polygon.
	 * 
	 * @param s
	 *            length of every side
	 * @throws InvalidValueException 
	 */
	void set(double s) throws InvalidValueException;

	/**
	 * Scales the length of every side by a given factor.
	 * 
	 * @param factor
	 *            scale factor
	 * @throws  InvalidValueException
	 */
	void scale(double factor) throws InvalidValueException;

}
