import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ExDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq = new ArrayDeque<String>();
		dq.offer("TITV 1");
		dq.offer("Nguyen Van A");
		dq.offer("Nguyen Van B");
		dq.offerFirst("TITV 2"); 
		dq.offerLast("TITV 3"); 
		while(!dq.isEmpty()) {			
			System.out.println(dq.poll());
		}
	}

}
