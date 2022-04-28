package DefaultEx;

interface Interface1{
public abstract void m1();

default void m2() {
	System.out.println("Interface1 default Method!");
}
}
class Test1 implements Interface1{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}
class Test2 implements Interface1{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}
class TestClass implements Interface1{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	public void m2() {
		System.out.println("TestClass - default m2 method");
	}
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.m1();
		tc.m2();
	}
}