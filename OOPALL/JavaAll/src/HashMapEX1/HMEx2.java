package HashMapEX1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HMEx2 {
public static void main(String[] args) {
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(101, "Rahul Gandhi");
	hm.put(102, "Sonia Gandhi");
	hm.put(103, "Priyanka Gandhi");
	System.out.println(hm);
//	Set s = hm.entrySet();
//	Iterator itr= s.iterator();
//	while(itr.hasNext()) {
//		Map.Entry entry=	(Entry) itr.next();
//		System.out.println(entry.getKey()+":"+entry.getValue());
//	}
	for(Integer i : hm.keySet()) {
		System.out.println(hm.get(i));
	}
	
}
}
