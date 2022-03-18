class Parent{
	public double amount=1000000.00;
	public double getAmount(){
		return this.amount;
	}
}
class Child extends Parent{}

class Test{
	public static void main(String[] args){
			Parent p2 = new Child();
			System.out.println(p2.amount);
			System.out.println(p2.getAmount());
	}
}


/*
		Parent p1= new Parent();
		System.out.println(p1.amount);
		System.out.println(p1.getAmount());*/
		
		
		/*
			Child c1 = new Child();
			System.out.println(c1.amount);
			System.out.println(c1.getAmount());
		*/
		/*
			Parent p2 = new Child();
			System.out.println(p2.amount);
			System.out.println(p2.getAmount());
		*/