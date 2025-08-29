package main;

import java.util.Arrays;

public class Test {
	public static int[]reverse(int[] x) {
		int[] res = new int[x.length];
		int index = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			res[index++] = x[i];
		}
		return res;
	}
	public static void main(String[] args) {
		int[] a = new int[] {1, 8, 2, 6, 4, 3, 7, 9};
		int[] b = new int[15];
		
		
		System.out.println("a: " + Arrays.toString(a));
		//Hàm sắp xếp
		Arrays.sort(a);
		System.out.println("a - sau khi sắp xếp: " + Arrays.toString(a));
		
		//Hàm tìm kiếm - Chỉ áp dụng cho mảng đã sắp xếp 
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, -1));
		
		//Hàm điền giá trị
		Arrays.fill(b, 5);
		System.out.println("b [after fill with 5]: " + Arrays.toString(b));
		
		//Hàm sắp xếp giảm dần
		Arrays.sort(a);
		a = Test.reverse(a);
		System.out.println("a - sau khi sắp xếp: " + Arrays.toString(a));
	}
}
