
public class Circle extends Shape {
	private double radius;

	public Circle(Coordinate coordinate, double radius) {
		super(coordinate);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		double r = this.getRadius();
		return Math.PI * r * r;
	}
	
	
}
