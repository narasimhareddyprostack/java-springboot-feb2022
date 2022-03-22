public class Display{
	/*
	public void m1(String s){
	System.out.println("String Version method");
	}
	*/
	public void m1(StringBuffer sb){
	System.out.println("StringBuffer Version method");
	}
	
	public void m1(Object obj){
	System.out.println("Object version method");
	}
	
	public static void main(String[] args){
	Display d  = new Display();
	//d.m1("Rahul Gandhi");
	d.m1(null);
	//d.m1(new StringBuffer("Priyanka"));
	
}
}