package wrapper;

public class Test{
public static void main(String[] args) {
	Integer I = new Integer(100);
	byte b  = I.byteValue();
	float f =  I.floatValue();
	double d = I.doubleValue();
	System.out.println(b);  // 100
	System.out.println(f); // 100.00f
	System.out.println(d); // 100.00
	Float f1 = Float.valueOf(f);
	System.out.println(f1);
	
	
	
}
}
