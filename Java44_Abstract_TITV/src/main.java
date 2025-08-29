
public class main {

	public static void main(String[] args) {
		Coordinate td1 = new Coordinate(5, 5);
		Coordinate td2 = new Coordinate(7, 9);
		Coordinate td3 = new Coordinate(12, 1);
		Coordinate td4 = new Coordinate(3, 4);
		
//		Shape s = new Shape(td1); => Error compile because you cannot create instance of abstract class 
		
		Shape p = new Point(td1);
		Shape c = new Circle(td2, 10);
		Shape r = new Rectangle(td3, 5, 10);
		Shape sq = new Square(td4, 2);
		
		System.out.println("Point Area: " + p.calArea());
		System.out.println("Rectangle Area: " + r.calArea());
		System.out.println("Circle Area: " + c.calArea());
		System.out.println("Square Area: " + sq.calArea());
		
	}

}
