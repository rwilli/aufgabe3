/**
 * Interface IRegularPolygon extends Polygon.
 * 
 * @author Gruppe222
 */
public interface IRegularPolygon extends Polygon {

	/**
	 * Sets the length of every side of the polygon.
	 * 
	 * @param s length of every side
	 * @throws InvalidValueException if length s is smaller than zero
	 */
	void set(int s) throws InvalidValueException;

	/**
	 * Scales the length of every side by a given factor.
	 * 
	 * @param factor scale factor
	 * @throws  InvalidValueException if factor is smaller than zero
	 */
	void scale(int factor) throws InvalidValueException;

}
