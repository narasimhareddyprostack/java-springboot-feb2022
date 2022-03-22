public class Display{
	public void m1(){
		System.out.println("Zero - Argument - method");
	}
	public void m1(int a){
		System.out.println("1 - Argument - method");
	}
	public void m1(float f){
		System.out.println("1 float - Argument - method");
	}

	public static void main(String[] args){
	Display d  = new Display();
	d.m1(10f);
}
}