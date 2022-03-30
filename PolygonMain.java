
public class PolygonMain {
	public static void main(String[] args) {
		Polygon polygon; // reference of class Polygon
		
//		polygon = new Polygon();
//		polygon.calcArea(50, 12.5);
//		polygon.displayArea();
//		System.out.println("******************************");
		// reference of super class can refer object of any of its subclass
		polygon = new Rectangle(); // upcasting
		polygon.calcArea(50, 12.5);
		polygon.displayArea();
		System.out.println("******************************");
		polygon = new Triangle();
		polygon.calcArea(50, 12.5);
		polygon.displayArea();
		System.out.println("******************************");
	}
}
