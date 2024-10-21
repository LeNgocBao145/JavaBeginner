package main;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String s = "Xin chào các bạn, tui là Peter!";
		
		String[] a = s.split("[ ,]+");
		System.out.println(Arrays.toString(a));
		
		String[] b = s.split(",");
		System.out.println(Arrays.toString(b));
		
		String s2 = "Xin chào, mình là Peter. Mình là lập trinh viên!";
		String[] c = s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));
	}
}
