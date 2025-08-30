import java.util.Scanner;
import java.util.Stack;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Character> stackStr = new Stack<>();
		
//		stackStr.peek() => lấy giá trị ra, nhưng không xóa khỏi stack
//		stackStr.pop() => lấy giá trị ra, xóa khỏi stack
//		stackStr.push() => đưa giá trị vào stack
//		stackStr.clear() => xóa tất cả phần tử trong stack
//		stackStr.contains() => xác định giá trị có tồn tại trong stack không
		
		System.out.println("Input string: ");
		String s = sc.nextLine();
		
		for(int i = 0; i < s.length(); i++) {
			stackStr.push(s.charAt(i));
		}
		System.out.println("Reversed String: ");
		for(int i = 0; i < s.length(); i++) {
			char c = stackStr.pop();
			System.out.print(c);
		}
		
		//Chuyển số thập phân sang nhị phân
		System.out.println("Input number: ");
		int num = sc.nextInt();
		Stack<Integer> stackInt = new Stack<>();
		while(num > 0) {
			stackInt.push(num % 2);
			num = num / 2;
		}
		System.out.println("Binary number: ");
		while(!stackInt.isEmpty()) {
			int n = stackInt.pop();
			System.out.print(n);
		}
	}

}
