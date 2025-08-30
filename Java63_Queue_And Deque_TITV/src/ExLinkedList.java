import java.util.LinkedList;
import java.util.Queue;

public class ExLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> ll = new LinkedList<>();
		ll.offer("TITV 1");
		ll.offer("Nguyen Van A");
		ll.offer("Nguyen Van B");
		ll.offer("TITV 2"); 
		while(!ll.isEmpty()) {			
			System.out.println(ll.poll());
		}
	}

}
