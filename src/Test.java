public class Test {
	
	public static void main (String [] args) {
		
		try {
			
			/*
			 * Schreiben Sie eine Klasse Test zum Testen Ihrer Lösung. 
			 * Erzeugen Sie Instanzen aller oben genannter Typen, wobei 
			 * aufgrund von Polymorphismus ein einziges Objekt natürlich 
			 * auch mehrere Typen abdecken kann. Überprüfen Sie so gut 
			 * Sie können mittels Testfällen, ob dort, wo Sie eine 
			 * Untertypbeziehung annehmen, Ersetzbarkeit gegeben ist. Wenn 
			 * zwischen zwei der oben beschriebenen Typen keine Untertypbeziehung 
			 * besteht, geben Sie in einem Kommentar in der Testklasse ein 
			 * kurzes Beispiel an, in dem die Ersetztbarkeit verletzt ist. 
			 * 
			 * 
			 * Vergewissern Sie sich der Korrektheit der Untertypbeziehungen 
			 * zusätzlich über geeignete Testfälle. Die Anzahl der Testfälle 
			 * ist nicht entscheidend, wohl aber deren Qualität: Es kommt darauf an, 
			 * dass die Testfälle mögliche Verletzungen der Ersetzbarkeit aufdecken 
			 * können. Umgekehrt sollen Sie sich auch vergewissern, dass Sie keine 
			 * Gelegenheit für Untertypbeziehungen verpasst haben, indem Sie Beispiele 
			 * dafür finden, wie angenommene Untertypbeziehungen das Ersetzbarkeitsprinzip 
			 * verletzen würden. Schreiben Sie die Gegenbeispiele als Kommentare 
			 * neben den Testfällen für Ersetzbarkeit in die Testklasse.
			 * 
			 * 
			 */
			
			// Testcase 1
			// Triangle
			/*Triangle t1 = new Triangle(8, 5, 4);
			
			System.out.println("Triangle Area: " + t1.area());
			System.out.println("Triangle Edges: " + t1.edges());
			System.out.println("Triangle Perimeter: " + t1.perimeter());
			
			t1.setA(10);
			
			// Testcase 2
			// EquilateralTriangle
			p1 = new EquilateralTriangle(9.0);
			
			System.out.println("EquilateralTriangle Area: " + p1.area());
			System.out.println("EquilateralTriangle Edges: " + p1.edges());
			System.out.println("EquilateralTriangle Perimeter: " + p1.perimeter());
			
			p1.s*/
			
			// Testcase 3
			// Rectangle
			Rectangle r1 = new Rectangle(5.0, 10.0);
			
			System.out.println("Rectangle Area: " + r1.area());
			System.out.println("Rectangle Edges: " + r1.edges());
			System.out.println("Rectangle Perimeter: " + r1.perimeter());
			
			r1.scale(2.0);
			
			System.out.println("Rectangle Area: " + r1.area());
			System.out.println("Rectangle Edges: " + r1.edges());
			System.out.println("Rectangle Perimeter: " + r1.perimeter());
			
			// Testcase4
			// Square
			Square s1 = new Square(4.5);
			
			System.out.println("Square Area: " + s1.area());
			System.out.println("Square Edges: " + s1.edges());
			System.out.println("Square Perimeter: " + s1.perimeter());
			
			s1.scale(1.5);
			
			System.out.println("Square Area: " + s1.area());
			System.out.println("Square Edges: " + s1.edges());
			System.out.println("Square Perimeter: " + s1.perimeter());
			
			s1.set(3.0);
			
			System.out.println("Square Area: " + s1.area());
			System.out.println("Square Edges: " + s1.edges());
			System.out.println("Square Perimeter: " + s1.perimeter());
			
			/*Rectangle r1 = new Rectangle(5.0, 3.0);
			Square s = new Square(5.0);
			s.scale(20);
			System.out.println("Rectangle r1 area: " + r1.area());
			System.out.println("Rectangle r1 perimeter: " + r1.perimeter());
			
			System.out.println("Square s area: " + s.area());
			System.out.println("Square s perimeter: " + s.perimeter());
			
			// Test rectangle with invalid values
			// Rectangle r2 = new Rectangle(-3.0, -2.0);
			
			// Regular triangle should be created
			RegularPolygon rp1 = new RegularPolygon(2.0, 60);
			//System.out.println("Regular Polygon rp1 edges: " +rp1.edges());
			//System.out.println("Regular Polygon rp1 perimeter: " + rp1.perimeter());
			// System.out.println("Regular Polygon rp1 area: " +rp1.area());
			
			
			// Polygon should throw Exception
			//RegularPolygon rp2 = new RegularPolygon(4.0, 61);
			//System.out.println("Regular Polygon rp2 edges: " +rp2.edges());
			//System.out.println("Regular Polygon rp2 perimeter: " + rp2.perimeter());
			
			EquilateralTriangle t = new EquilateralTriangle(10);
			t.setA(20);
			t.setB(30);*/
		} catch (InvalidValueException e) {
			e.printStackTrace();
		}
		
		
	}	
}
