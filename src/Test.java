/**
 * @author Gruppe 222
 * 
 * Class for testing 
 *
 */
public class Test {
	
	/**
	 * 
	 * @param args
	 */
	public static void main (String [] args) {
		
		try {
			// because of polymorphism one polygon object is used for all subtypes
			Polygon p;
			
			// because of polymorphism one abstract quadrangle object is used for
			// the subtypes square and rectangle
			Quadrangle q;
			
			// because of polymorphism one iregularpolygon object is used for
			// the subtypes equilateraltriangle, regularpolygon and square
			IRegularPolygon rp;
			
			// because of polymorphism one triangle object is used for
			// the subtype equilateraltriangle
			Triangle t;
			
			/* 
			 * Testcase1
			 * 
			 * create from interface polygon instance rectangle with given parameters
			 */
			System.out.println("---------------Testcase 1---------------");
			p = new Rectangle(5, 3);
			System.out.println("Rectangle area: " + p.area());
			System.out.println("Rectangle edges: " + p.edges());
			System.out.println("Rectangle perimeter: " + p.perimeter());
			
			((Rectangle) p).scale(3);
			System.out.println("Rectangle area: " + p.area());
			System.out.println("Rectangle edges: " + p.edges());
			System.out.println("Rectangle perimeter: " + p.perimeter());
			
			/*
			 * Testcase2
			 * 
			 * create from interface polygon instance square with given parameter
			 */
			System.out.println("---------------Testcase 2---------------");
			p = new Square(6);
			System.out.println("Square area: " + p.area());
			System.out.println("Square edges: " + p.edges());
			System.out.println("Square perimeter: " + p.perimeter());
			
			((Square) p).scale(2);
			System.out.println("Square area: " + p.area());
			System.out.println("Square edges: " + p.edges());
			System.out.println("Square perimeter: " + p.perimeter());
			
			((Square) p).set(3);
			System.out.println("Square area: " + p.area());
			System.out.println("Square edges: " + p.edges());
			System.out.println("Square perimeter: " + p.perimeter());
			
			/*
			 * Testcase 3
			 * 
			 * create from interface polygon instance triangle with given parameters
			 */
			System.out.println("---------------Testcase 3---------------");
			p = new Triangle(3, 7, 9);
			System.out.println("Triangle area: " + p.area());
			System.out.println("Triangle edges: " + p.edges());
			System.out.println("Triangle perimeter: " + p.perimeter());
						
			((Triangle) p).setA(7);
			((Triangle) p).setB(12);
			((Triangle) p).setC(4);
			System.out.println("Triangle area: " + p.area());
			System.out.println("Triangle edges: " + p.edges());
			System.out.println("Triangle perimeter: " + p.perimeter());
			
			/*
			 * Testcase 4
			 * 
			 * create from interface polygon instance equilateraltriangle with given parameter
			 */
			System.out.println("---------------Testcase 4---------------");
			p = new EquilateralTriangle(8);
			System.out.println("EquilateralTriangle area: " + p.area());
			System.out.println("EquilateralTriangle edges: " + p.edges());
			System.out.println("EquilateralTriangle perimeter: " + p.perimeter());
			
			((EquilateralTriangle) p).scale(2);
			System.out.println("EquilateralTriangle area: " + p.area());
			System.out.println("EquilateralTriangle edges: " + p.edges());
			System.out.println("EquilateralTriangle perimeter: " + p.perimeter());
						
			((EquilateralTriangle) p).set(4);
			System.out.println("EquilateralTriangle area: " + p.area());
			System.out.println("EquilateralTriangle edges: " + p.edges());
			System.out.println("EquilateralTriangle perimeter: " + p.perimeter());
			
			((EquilateralTriangle) p).setA(2);
			System.out.println("EquilateralTriangle area: " + p.area());
			System.out.println("EquilateralTriangle edges: " + p.edges());
			System.out.println("EquilateralTriangle perimeter: " + p.perimeter());
			
			((EquilateralTriangle) p).setB(9);
			System.out.println("EquilateralTriangle area: " + p.area());
			System.out.println("EquilateralTriangle edges: " + p.edges());
			System.out.println("EquilateralTriangle perimeter: " + p.perimeter());
			
			((EquilateralTriangle) p).setC(13);
			System.out.println("EquilateralTriangle area: " + p.area());
			System.out.println("EquilateralTriangle edges: " + p.edges());
			System.out.println("EquilateralTriangle perimeter: " + p.perimeter());
			
			/*
			 * Testcase 5
			 * 
			 * create from interface polygon instance regularpolygon with given parameters
			 */
			System.out.println("---------------Testcase 5---------------");
			p = new RegularPolygon(12, 60);
			System.out.println("RegularPolygon area: " + p.area());
			System.out.println("RegularPolygon edges: " + p.edges());
			System.out.println("RegularPolygon perimeter: " + p.perimeter());	
			
			((RegularPolygon) p).scale(4);
			System.out.println("RegularPolygon area: " + p.area());
			System.out.println("RegularPolygon edges: " + p.edges());
			System.out.println("RegularPolygon perimeter: " + p.perimeter());
			
			((RegularPolygon) p).set(3);
			System.out.println("RegularPolygon area: " + p.area());
			System.out.println("RegularPolygon edges: " + p.edges());
			System.out.println("RegularPolygon perimeter: " + p.perimeter());
			
			/*
			 * Testcase 6
			 * 
			 * create from abstract class quadrangle instance rectangle with given parameters
			 * after that, create instance square with given parameter
			 */
			System.out.println("---------------Testcase 6---------------");
			q = new Rectangle(2, 3);
			System.out.println("Rectangle area: " + q.area());
			System.out.println("Rectangle edges: " + q.edges());
			System.out.println("Rectangle perimeter: " + q.perimeter());
			
			q = new Square(4);
			System.out.println("Square area: " + q.area());
			System.out.println("Square edges: " + q.edges());
			System.out.println("Square perimeter: " + q.perimeter());

			/*
			 * Testcase 7
			 * 
			 * create from interface regularpolygon instance square with given parameter
			 * then create instance regularpolygon with given parameters
			 * and after that create instance equilateraltriangle with given parameter
			 */
			System.out.println("---------------Testcase 7---------------");
			rp = new Square(13);
			System.out.println("Square area: " + rp.area());
			System.out.println("Square edges: " + rp.edges());
			System.out.println("Square perimeter: " + rp.perimeter());	
			
			rp.scale(3);
			System.out.println("Square area: " + rp.area());
			System.out.println("Square edges: " + rp.edges());
			System.out.println("Square perimeter: " + rp.perimeter());
			
			rp.set(18);
			System.out.println("Square area: " + rp.area());
			System.out.println("Square edges: " + rp.edges());
			System.out.println("Square perimeter: " + rp.perimeter());
			
			
			rp = new RegularPolygon(9, 60);
			System.out.println("RegularPolygon area: " + rp.area());
			System.out.println("RegularPolygon edges: " + rp.edges());
			System.out.println("RegularPolygon perimeter: " + rp.perimeter());
			
			rp.scale(5);
			System.out.println("RegularPolygon area: " + rp.area());
			System.out.println("RegularPolygon edges: " + rp.edges());
			System.out.println("RegularPolygon perimeter: " + rp.perimeter());
			
			rp.set(13);
			System.out.println("RegularPolygon area: " + rp.area());
			System.out.println("RegularPolygon edges: " + rp.edges());
			System.out.println("RegularPolygon perimeter: " + rp.perimeter());
			
			rp = new EquilateralTriangle(9);
			System.out.println("EquilateralTriangle area: " + rp.area());
			System.out.println("EquilateralTriangle edges: " + rp.edges());
			System.out.println("EquilateralTriangle perimeter: " + rp.perimeter());
			
			/*
			 * Testcase 8
			 * 
			 * create from class triangle instance triangle with given parameters
			 * and then instance euqilateraltriangle with given parameter
			 */
			System.out.println("---------------Testcase 8---------------");
			t = new Triangle(5, 12, 15);
			System.out.println("Triangle area: " + t.area());
			System.out.println("Triangle edges: " + t.edges());
			System.out.println("Triangle perimeter: " + t.perimeter());
			
			t = new EquilateralTriangle(16);
			System.out.println("EquilateralTriangle area: " + t.area());
			System.out.println("EquilateralTriangle edges: " + t.edges());
			System.out.println("EquilateralTriangle perimeter: " + t.perimeter());
			
			((EquilateralTriangle) t).set(5);	
			System.out.println("EquilateralTriangle area: " + t.area());
			System.out.println("EquilateralTriangle edges: " + t.edges());
			System.out.println("EquilateralTriangle perimeter: " + t.perimeter());
					
		} catch (InvalidValueException e) {
			e.printStackTrace();
		}	
	}	
}
