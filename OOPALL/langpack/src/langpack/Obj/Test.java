package langpack.Obj;

public class Test {

	public static void main(String[] args) {
		String s1= new String("Rahul");
		String s2= new String("Rahul");
		StringBuffer s3 = new StringBuffer("Rahul");
		//System.out.println(10 == 10);  //primitive content comparision
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
