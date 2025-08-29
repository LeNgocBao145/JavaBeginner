package main;

public class Test {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(23, 10, 2024);
		MyDate md2 = new MyDate(11, 1, 2021);
		MyDate md3 = new MyDate(23, 10, 2024);
		System.out.println(md3.hashCode());
		System.out.println(md1);
		
		if(md1.equals(md2))
		{
			System.out.println("md1 == md3");
		}else {
			System.out.println("md1 != md3");
		}
	}
}
