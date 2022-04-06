package HashSetEx;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		//initial capacity : 16 and fill ratio/load factor is: 0.75
		//Allowed heterogenous elemenets
		HashSet hs = new HashSet(); 
		
		//allowed only Integer 
		//initial capacity 100, and load factor 0.60
		HashSet<Integer> eids = new HashSet<Integer>(100,0.6f);
		
		eids.add(101);
		eids.add(101);
		eids.add(null);
		eids.add(102);
		eids.add(103);
		System.out.println(eids);
		for(Integer i:eids) {
			System.out.println(i);
		}
		System.out.println("******");
//		for(int i=0;i<=eids.size()-1; i++) {
//			System.out.println(eids.);
//		}
	}

}
