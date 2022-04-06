package HashSetEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HasetSetEx2 {

	public static void main(String[] args) {
		HashSet hs = new HashSet(); 
		hs.add(10);
		hs.add(20);
		hs.add(1);
		hs.add(5);
		
		ArrayList al = new ArrayList();
		al.addAll(hs);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
	}

}
