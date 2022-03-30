package CollectionEx;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList al  = new ArrayList();//allowed all data types
		//ArrayList<Integer> al1=new ArrayList<Integer>();//Allowed only integer values
		//System.out.println(al);
		al.add(10);
		al.add(20);
		al.add(10);
		al.add("Rahul");
		al.add(null);
		System.out.println(al);
		al.set(4, 45000);
		System.out.println(al);
		//System.out.println(al.get(20));
		System.out.println(al.size());
		System.out.println(al.contains("Rahul"));
		System.out.println(al.isEmpty());
		//System.out.println(al.toArray());
		al.remove(4);
		System.out.println(al);
		al.clear();
		System.out.println(al);
	}

}
