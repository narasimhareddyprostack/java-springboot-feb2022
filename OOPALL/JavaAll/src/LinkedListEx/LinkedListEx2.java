package LinkedListEx;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>(); 
		ll.add(10);
		ll.add(20);
		ll.add(30);
		LinkedList newList = new LinkedList(); 
		newList.addAll(ll);
		System.out.println(newList);
		Collections.sort(newList, Collections.reverseOrder());
		System.out.println(newList);
		newList.add(40);
		System.out.println(newList);
		newList.addLast(50);
		System.out.println(newList);
		Object[] arr = newList.toArray();
		for(Object value : arr) {
			System.out.println(value);
		}

	}

}
