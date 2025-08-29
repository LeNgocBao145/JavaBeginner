package main;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
//		Interface là gì?
//			Một Interface trong Java là một bản thiết kế của một lớp.
//
//			Nó chỉ có các phương thức trừu tượng và các hằng số. (Lưu ý: từ Java 8 trở đi, Interface có thể có thêm các phương thức default và static).
//
//			Tất cả các hằng số được mặc định là public static final.
//
//			Tất cả các phương thức trừu tượng là public theo mặc định.
//
//			Tương tự như lớp abstract, nó không thể được khởi tạo thành đối tượng.
//
//		Mục đích:
//			Để đạt được tính trừu tượng hoàn toàn và mô phỏng đa kế thừa trong Java.
//		Lưu ý:
//			Một lớp có thể triển khai một hoặc nhiều interface tại một thời điểm. Điều này có nghĩa là một lớp có thể kế thừa các hành vi (phương thức) từ nhiều interface khác nhau, đây là cách Java thực hiện đa kế thừa.
//
//			Một interface có thể kế thừa từ một interface khác, tương tự cách một lớp có thể kế thừa một lớp khác. Điều này cho phép mở rộng chức năng của một interface đã có bằng cách tạo ra một interface mới kế thừa từ nó.
		
		Sort selectionSort = new SelectionSort();
		int[] arr = new int[] {9, 0, 3, 7};
		int[] res = selectionSort.sortAscending(arr);
		System.out.println(Arrays.toString(res));
		
		Sort insertionSort = new SelectionSort();
		int[] arr2 = new int[] {10, 0, 30, 7};
		int[] res2 = insertionSort.sortAscending(arr2);
		System.out.println(Arrays.toString(res2));
	}

}
