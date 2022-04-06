import java.util.ArrayList;
import java.util.Collections;

public class TreeSetEx4 {
public static void main(String[] args) {
	int[] salary = {45001, 55002,65003,75004};
	//indexing        0     1    2      3
	ArrayList al = new ArrayList();
	for(int sal:salary) {
		al.add(sal);
	}
	Collections.sort(al);
	System.out.println(al.get(al.size()-2));
}
}
