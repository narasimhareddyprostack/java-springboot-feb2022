package IteratorEx;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratorDemo {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
