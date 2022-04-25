class Test{
public static void main(String[] args){
    try{
	String ename = null;
    int[] size = new int[5];
	System.out.println("Hello,GM");
	System.out.println(10/2);//ArithmeticException
	System.out.println(size[1]);//ArrayIndexOutOfBoundsException
	System.out.println(ename.length());//NullPointerException
	System.out.println("Hello,GA");
	System.out.println("Hello,GN");
	}
	
	catch(NullPointerException ne){
	System.out.println(ne.getMessage());
	}
	catch(ArithmeticException ae){
	System.out.println(ae.getMessage());
	}
	catch(Exception e){
	System.out.println(e.getMessage());
	}
	
}
}