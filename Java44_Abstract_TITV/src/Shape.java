
public abstract class Shape {
	protected Coordinate coordinate;
	
	public Shape(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public abstract double calArea();
}
