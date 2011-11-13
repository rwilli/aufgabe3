public class Test {
	
	public static void main (String [] args) {
		
		try {
			Rectangle r1 = new Rectangle(5.0, 3.0);
			Square s = new Square(5.0);
			
			System.out.println("Rectangle r1 area: " + r1.area());
			System.out.println("Rectangle r1 perimeter: " + r1.perimeter());
			
			System.out.println("Square s area: " + s.area());
			System.out.println("Square s perimeter: " + s.perimeter());
			
			// Test rectangle with invalid values
			// Rectangle r2 = new Rectangle(-3.0, -2.0);
			
			// Regular triangle should be created
			RegularPolygon rp1 = new RegularPolygon(2.0, 60);
			System.out.println("Regular Polygon rp1 edges: " +rp1.edges());
			System.out.println("Regular Polygon rp1 perimeter: " + rp1.perimeter());
			// System.out.println("Regular Polygon rp1 area: " +rp1.area());
			
			
			// Polygon should throw Exception
			RegularPolygon rp2 = new RegularPolygon(4.0, 61);
			System.out.println("Regular Polygon rp2 edges: " +rp2.edges());
			System.out.println("Regular Polygon rp2 perimeter: " + rp2.perimeter());
			
		} catch (InvalidValueException e) {
			e.printStackTrace();
		}
		
		
	}	
}
