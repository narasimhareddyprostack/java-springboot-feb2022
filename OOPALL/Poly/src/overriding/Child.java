package overriding;

public class Child extends Parent {
	public void m1() {
		System.out.println("Child class m1()");
	}
	public void m1(int a) {
		System.out.println("Child class m1( int ) - 1 arg");		
	}
}
