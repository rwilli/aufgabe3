/**
 * Polygon interface represents any geometric shape with 3 or more edges.
 * 
 * @author Gruppe222
 */
public interface Polygon {

	/**
	 * Returns the number of edges of a polygon as integer.
	 * 
	 * @return Integer the number of edges. Is always >= 3
	 */
	// edges >= 3
	int edges();

	/**
	 * Returns the area of a polygon as double.
	 * 
	 * @return double the area
	 */
	// area > 0
	double area();

	/**
	 * Returns the perimeter of a polygon as double.
	 * 
	 * @return double the perimeter
	 */
	// perimeter > 0
	double perimeter();

}
