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
			System.out.println("---------------Testcase 1---------------");
			Rectangle r1 = new Rectangle(5, 3);
			System.out.println("Rectangle r1 area: " + r1.area());
			System.out.println("Rectangle r1 edges: " + r1.edges());
			System.out.println("Rectangle r1 perimeter: " + r1.perimeter());
			
			r1.scale(3);
			System.out.println("Rectangle r1 area: " + r1.area());
			System.out.println("Rectangle r1 edges: " + r1.edges());
			System.out.println("Rectangle r1 perimeter: " + r1.perimeter());
			
			// Testcase 2
			System.out.println("---------------Testcase 2---------------");
			Square s1 = new Square(6);
			System.out.println("Square s1 area: " + s1.area());
			System.out.println("Square s1 edges: " + s1.edges());
			System.out.println("Square s1 perimeter: " + s1.perimeter());
			
			s1.scale(2);
			System.out.println("Square s1 area: " + s1.area());
			System.out.println("Square s1 edges: " + s1.edges());
			System.out.println("Square s1 perimeter: " + s1.perimeter());
			
			s1.set(3);
			System.out.println("Square s1 area: " + s1.area());
			System.out.println("Square s1 edges: " + s1.edges());
			System.out.println("Square s1 perimeter: " + s1.perimeter());
			
			 // Testcase 3
			System.out.println("---------------Testcase 3---------------");
			Quadrangle q1 = new Rectangle(2, 3);
			System.out.println("Rectangle q1 area: " + q1.area());
			System.out.println("Rectangle q1 edges: " + q1.edges());
			System.out.println("Rectangle q1 perimeter: " + q1.perimeter());
			
			q1 = new Square(4);
			System.out.println("Square r1 area: " + q1.area());
			System.out.println("Square r1 edges: " + q1.edges());
			System.out.println("Square r1 perimeter: " + q1.perimeter());
			
			// Testcase 4
			System.out.println("---------------Testcase 4---------------");
			Triangle t1 = new Triangle(3, 7, 9);
			System.out.println("Triangle t1 area: " + t1.area());
			System.out.println("Triangle t1 edges: " + t1.edges());
			System.out.println("Triangle t1 perimeter: " + t1.perimeter());
			
			t1.setA(7);
			t1.setB(12);
			t1.setC(4);
			System.out.println("Triangle t1 area: " + t1.area());
			System.out.println("Triangle t1 edges: " + t1.edges());
			System.out.println("Triangle t1 perimeter: " + t1.perimeter());
			
			// Testcase 5
			System.out.println("---------------Testcase 5---------------");
			EquilateralTriangle et1 = new EquilateralTriangle(8);
			System.out.println("EquilateralTriangle et1 area: " + et1.area());
			System.out.println("EquilateralTriangle et1 edges: " + et1.edges());
			System.out.println("EquilateralTriangle et1 perimeter: " + et1.perimeter());
			
			et1.scale(2);
			System.out.println("EquilateralTriangle et1 area: " + et1.area());
			System.out.println("EquilateralTriangle et1 edges: " + et1.edges());
			System.out.println("EquilateralTriangle et1 perimeter: " + et1.perimeter());
			
			et1.set(4);
			System.out.println("EquilateralTriangle et1 area: " + et1.area());
			System.out.println("EquilateralTriangle et1 edges: " + et1.edges());
			System.out.println("EquilateralTriangle et1 perimeter: " + et1.perimeter());
			
			et1.setA(2);
			System.out.println("EquilateralTriangle et1 area: " + et1.area());
			System.out.println("EquilateralTriangle et1 edges: " + et1.edges());
			System.out.println("EquilateralTriangle et1 perimeter: " + et1.perimeter());
			
			et1.setB(9);
			System.out.println("EquilateralTriangle et1 area: " + et1.area());
			System.out.println("EquilateralTriangle et1 edges: " + et1.edges());
			System.out.println("EquilateralTriangle et1 perimeter: " + et1.perimeter());
			
			et1.setC(13);
			System.out.println("EquilateralTriangle et1 area: " + et1.area());
			System.out.println("EquilateralTriangle et1 edges: " + et1.edges());
			System.out.println("EquilateralTriangle et1 perimeter: " + et1.perimeter());
			
			// Testcase 6
			System.out.println("---------------Testcase 6---------------");
			RegularPolygon rp1 = new RegularPolygon(12, 60);
			System.out.println("RegularPolygon rp1 area: " + rp1.area());
			System.out.println("RegularPolygon rp1 edges: " + rp1.edges());
			System.out.println("RegularPolygon rp1 perimeter: " + rp1.perimeter());	
			
			rp1.scale(4);
			System.out.println("RegularPolygon rp1 area: " + rp1.area());
			System.out.println("RegularPolygon rp1 edges: " + rp1.edges());
			System.out.println("RegularPolygon rp1 perimeter: " + rp1.perimeter());
			
			rp1.set(3);
			System.out.println("RegularPolygon rp1 area: " + rp1.area());
			System.out.println("RegularPolygon rp1 edges: " + rp1.edges());
			System.out.println("RegularPolygon rp1 perimeter: " + rp1.perimeter());

			// Testcase 7
			System.out.println("---------------Testcase 7---------------");
			IRegularPolygon rp2 = new Square(13);
			System.out.println("RegularPolygon rp2 area: " + rp2.area());
			System.out.println("RegularPolygon rp2 edges: " + rp2.edges());
			System.out.println("RegularPolygon rp2 perimeter: " + rp2.perimeter());	
			
			rp2 = new RegularPolygon(9, 60);
			System.out.println("RegularPolygon rp2 area: " + rp2.area());
			System.out.println("RegularPolygon rp2 edges: " + rp2.edges());
			System.out.println("RegularPolygon rp2 perimeter: " + rp2.perimeter());
			
			rp2 = new EquilateralTriangle(9);
			System.out.println("RegularPolygon rp2 area: " + rp2.area());
			System.out.println("RegularPolygon rp2 edges: " + rp2.edges());
			System.out.println("RegularPolygon rp2 perimeter: " + rp2.perimeter());
			
		} catch (InvalidValueException e) {
			e.printStackTrace();
		}
		
		
	}	
}
