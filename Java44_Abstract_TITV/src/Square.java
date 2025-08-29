
public class Square extends Shape {
	private double edge;

	public Square(Coordinate coordinate, double edge) {
		super(coordinate);
		this.edge = edge;
	}

	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		double e = this.getEdge();
		return e * e;
	}
	
	
}
