public class Test {
	
	public static void main (String [] args) {
		
		try {
			
			/*
			 * Schreiben Sie eine Klasse Test zum Testen Ihrer L�sung. 
			 * Erzeugen Sie Instanzen aller oben genannter Typen, wobei 
			 * aufgrund von Polymorphismus ein einziges Objekt nat�rlich 
			 * auch mehrere Typen abdecken kann. �berpr�fen Sie so gut 
			 * Sie k�nnen mittels Testf�llen, ob dort, wo Sie eine 
			 * Untertypbeziehung annehmen, Ersetzbarkeit gegeben ist. Wenn 
			 * zwischen zwei der oben beschriebenen Typen keine Untertypbeziehung 
			 * besteht, geben Sie in einem Kommentar in der Testklasse ein 
			 * kurzes Beispiel an, in dem die Ersetztbarkeit verletzt ist. 
			 * 
			 * 
			 * Vergewissern Sie sich der Korrektheit der Untertypbeziehungen 
			 * zus�tzlich �ber geeignete Testf�lle. Die Anzahl der Testf�lle 
			 * ist nicht entscheidend, wohl aber deren Qualit�t: Es kommt darauf an, 
			 * dass die Testf�lle m�gliche Verletzungen der Ersetzbarkeit aufdecken 
			 * k�nnen. Umgekehrt sollen Sie sich auch vergewissern, dass Sie keine 
			 * Gelegenheit f�r Untertypbeziehungen verpasst haben, indem Sie Beispiele 
			 * daf�r finden, wie angenommene Untertypbeziehungen das Ersetzbarkeitsprinzip 
			 * verletzen w�rden. Schreiben Sie die Gegenbeispiele als Kommentare 
			 * neben den Testf�llen f�r Ersetzbarkeit in die Testklasse.
			 * 
			 * 
			 */
			
			// Testcase 1
			// Triangle
			
			
			// Testcase 2
			// EquilateralTriangle
			
			// Testcase 3
			// Rectangle
			
			// Testcase4
			// Square
			
			
			
			Rectangle r1 = new Rectangle(5.0, 3.0);
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
			t.setB(30);
		} catch (InvalidValueException e) {
			e.printStackTrace();
		}
		
		
	}	
}
