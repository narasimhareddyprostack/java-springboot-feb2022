package QueueEX;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue(5);
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		
//		for(Object obj:pq) {
//			System.out.println(obj);
//			
//		}
		Iterator itr = pq.iterator();
		while(itr.hasNext()) {
				System.out.println(itr.next());
		}
	}

}
