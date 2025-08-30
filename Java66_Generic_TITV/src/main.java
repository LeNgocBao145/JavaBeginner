
public class main {

	public static void main(String[] args) {
		Box box = new Box(15);
		System.out.println(box.getValue());
		
//		Box box = new Box(15.5); // Error
//		Box box = new Box("Fifteen"); //Error
		
		//Generic
		Box2<Double> box_db = new Box2<>(15.5);
		System.out.println(box_db.getValue());
		Box2<String> box_str = new Box2<>("Fifteen");
		System.out.println(box_str.getValue());
		
		
	}

}
