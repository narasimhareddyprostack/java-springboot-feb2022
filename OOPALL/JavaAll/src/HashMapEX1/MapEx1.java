package HashMapEX1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapEx1 {

	public static void main(String[] args) {
		//HashMap<String,String> hm = new HashMap<String,String>();
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(101, "Rahul Gandhi");
		hm.put(102, "Sonia Gandhi");
		hm.put(103, "Priyanka Gandhi");
		System.out.println(hm);
		
		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		hm1.put(104, "New Gandhi");
		hm1.put(103, "Priyanka Vadra");
		
		hm.putAll(hm1);
		System.out.println(hm);
		
		
		
		
		
//		for(Integer obj : hm.keySet()) {
//			System.out.println(obj+":"+hm.get(obj));
//		}
//		for( String str :hm.values()) {
//			System.out.println(str);
//		}
			
	}

}
