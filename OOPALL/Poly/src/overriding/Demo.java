package overriding;

public class Demo {

	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.m1();
		
		Child c1 = new Child();
		c1.m1();
		c1.m1(100);
		Parent p2 = new Parent();
		p2.m1();
		//Child c2 = new Parent();
	}

}
