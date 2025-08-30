
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Raw type -> compiler KHÔNG kiểm soát được T
        Box2 box = new Box2<Integer>(100);

        // Chỗ này compiler KHÔNG báo lỗi
        box = new Box2<String>("oops");

        // Nhưng khi ép kiểu sai thì toang
        Integer x = (Integer) box.getValue(); 
        System.out.println(x);
        
//		Box2<Integer> box = new Box2<>(100);
//		box = new Box2<>("oops"); // ❌ Compile error ngay, không chạy được

	}

}
