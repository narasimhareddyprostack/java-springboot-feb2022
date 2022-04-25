package ExceptionHandling;
class MoneyException extends RuntimeException{
	MoneyException(String s){
		System.out.println(s);
	}
}	
public class Test {

	public static void main(String[] args)  {
		try {
			int money = 100;
			if(money > 500) {
				System.out.println("Go To Movies");
			}else {
				throw new MoneyException("Get More Money......");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		

	}

}
