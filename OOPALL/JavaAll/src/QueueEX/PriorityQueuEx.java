package QueueEX;

import java.util.PriorityQueue;

public class PriorityQueuEx {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add("rahul@gmail.com");
		pq.add("sonia@gmail.com");
		pq.add("priyanka@gmail.com");
	
		//pq.add(10);
		//System.out.println(pq);
		//System.out.println(pq.peek());
		System.out.println(pq.element());

	}

}
