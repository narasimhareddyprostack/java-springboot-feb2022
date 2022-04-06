package LinkedListEx;

import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList(); 
		ll.add(10);
		ll.add(1,20);
		ll.addFirst(5);
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		System.out.println(ll.getLast());

	}

}
