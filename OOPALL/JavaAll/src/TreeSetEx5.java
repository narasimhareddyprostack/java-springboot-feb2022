import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx5 {
public static void main(String[] args) {
	int[] salary = {55002,75004,45001,65003};
	SortedSet s = new TreeSet();
	for(int sal:salary) {
		s.add(sal);
	}
	
	s.remove(s.last());
	System.out.println(s.last());
	
}
}
