package StaticMethodEx;

interface I{
	public abstract void m1();
	default void m2() {
		System.out.println("Default Method");
	}
	public static void m3() {
		//by default  interface  all static methods not available 
		//in implementation classes 
		System.out.println("Interface Static Method");
	}
}
public class Test implements I{
	public void m1() {}
	public void m2() {
		System.out.println("Test class Default method");
	}
	public static void m3() {
		System.out.println("Test Class Static method m3()");

	}
	public static void main(String[] args) {
		
//		Test t = new Test();
//		t.m1();
//		t.m2();
//		t.m3();
//		Test.m3();
//		//t.m3();
//		I.m3();
		
	}

}
