
public class Triangle extends Polygon{
	public Triangle() {
		System.out.println("Triangle");
	}
	@Override
	public void calcArea(double length, double breadth) {
		System.out.println("Triangle class");
		area = 0.5 * length * breadth;
	}
}
