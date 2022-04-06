package CollectionEx;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx4 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(37);
		al.add(2);
		al.add(4);
		al.add(15);
		al.add(1);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);

	}

}
