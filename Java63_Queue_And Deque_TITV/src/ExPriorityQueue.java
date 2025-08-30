import java.util.PriorityQueue;
import java.util.Queue;

public class ExPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> pq = new PriorityQueue<String>();
		pq.offer("TITV 1");
		pq.offer("Nguyen Van A");
		pq.offer("Nguyen Van B");
		pq.offer("TITV 2"); 
		while(!pq.isEmpty()) {			
			System.out.println(pq.poll());
		}
	}

}
