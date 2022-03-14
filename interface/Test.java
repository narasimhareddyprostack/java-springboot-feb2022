interface A{
	public abstract void m1();
	public abstract void m2();
	//public	void m3();
	//public	abstract void m4();
	
}

class Test implements A{
	public void m1(){
		System.out.println("m1() method");
	}
	public void m2(){
		System.out.println("m2() method");
	}
	public  static void main(String[] args){
		Test t = new Test();
		t.m1();
		t.m2();
	}
}