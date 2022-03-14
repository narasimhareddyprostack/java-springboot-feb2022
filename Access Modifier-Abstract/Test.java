abstract class A{
	void m1(){
		System.out.println(" Class A m1() method");
	}
	abstract void m2();
}

class Test extends A{

    void m2(){
	System.out.println("Test Class - m2()");
	}
	public static void main(String[] args){
		Test t1 = new Test();
		t1.m1();
		t1.m2();	
	}
}

