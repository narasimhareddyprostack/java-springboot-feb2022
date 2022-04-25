package HashMapEX1;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapEx3 {

	public static void main(String[] args) {
		TreeMap<String, String> m = new TreeMap<String,String>();
		m.put("loc", "Noida");
		m.put("id", "101");
		m.put("salary", "45000");
		m.put("name", "Rahul Gandhi");
		
		System.out.println(m);
//		Set s = m.keySet();
//		for(Object key:s) {
//			System.out.println(m.get(key));
//		}
//		Collection c = m.values();
//		for( Object value:c) {
//			System.out.println(value);
//		}
		Set s1 = m.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry entry =(Entry) itr.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
