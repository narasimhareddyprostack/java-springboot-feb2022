class Parent1{
	public void getOne(){
	System.out.println("Parent1 - Method");
	}
}

class Parent2 extends Parent1 {
	public void getTwo(){
		System.out.println("Parent2 - Method");
	}
}

class Child extends Parent2{ }

class Test{
public static void main(String[] args){

Child c1 = new Child();
c1.getOne();
c1.getTwo();
}
}