
public class Rectangle extends Polygon{
	public Rectangle() {
		System.out.println("Rectangle");
	}
	@Override
	public void calcArea(double length, double breadth) {
		System.out.println("Rectangle class");
		area = length * breadth;
	}
}
