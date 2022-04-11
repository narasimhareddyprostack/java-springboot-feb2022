package HashSetEx;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet a = new HashSet();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		HashSet b = new HashSet();
		b.add(30);
		b.add(40);
		b.add(70);
		b.add(80);
		b.add(90);
		b.add(100);
		
		//a.addAll(b);//union
		//a.retainAll(b);//intersection
		//a.contains(b); // A
		a.removeAll(b); //only A
		System.out.println(a);
		
	}

}
