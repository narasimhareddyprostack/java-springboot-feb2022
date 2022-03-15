interface Bank1{
  public static final  int min_Bal =500;
  public abstract	void m1();
}
interface Bank2{
   public static final int min_Bal=600;
	public abstract void m2();
}
class Test implements Bank1, Bank2{

public void m1(){
//business
}
public void m2(){
//business
}

	public static void main(String[] args){
	System.out.println(Bank1.min_Bal);
	}
}