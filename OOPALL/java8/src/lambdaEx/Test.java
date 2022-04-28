package lambdaEx;

public class Test {
	
	

	public static void main(String[] args) {
		String ename ="Rahul Gandhi";
		Test t = new Test();
		Runnable r1 = ()->System.out.println("Hello");
		r1.run();

	}

}