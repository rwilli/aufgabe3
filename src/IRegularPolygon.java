/**
 * Interface IRegularPolygon extends Polygon.
 * 
 * @author Gruppe222
 */
public interface IRegularPolygon extends Polygon {

	/**
	 * Sets the length of every side of the polygon.
	 * 
	 * Length s must be greater than zero.
	 * 
	 * 
	 * @param s length of every side
	 * @throws InvalidValueException if length s is smaller than zero
	 */
	// s > 0
	void set(int s) throws InvalidValueException;

	/**
	 * Scales the length of every side by a given factor.
	 * 
	 * Scale factor must be greater than zero.
	 * Length a and b are greater than zero.
	 * Length a or b * factor is greater than zero.
	 * 
	 * @param factor to scale
	 * @throws  InvalidValueException if factor is smaller than zero
	 */
	// factor > 0
	void scale(int factor) throws InvalidValueException;

}
