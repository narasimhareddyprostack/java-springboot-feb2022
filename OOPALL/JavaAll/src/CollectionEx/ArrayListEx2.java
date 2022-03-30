package CollectionEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>();	
		ArrayList marks = new ArrayList();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		al.addAll(marks);
		System.out.println(al);
		al.removeAll(marks);
		System.out.println(al);

	}

}
