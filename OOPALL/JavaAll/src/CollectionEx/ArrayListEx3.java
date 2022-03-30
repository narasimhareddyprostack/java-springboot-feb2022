package CollectionEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList al =  new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
//		for(int i=0; i<=al.size()-1; i++) {
//				System.out.println(al.get(i));
//		}
		for(Object value:al) {
			System.out.println(value);
		}
	}

}
