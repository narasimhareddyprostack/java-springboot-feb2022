package pack1;
public class Savings_Account extends Account{
Savings_Account(){
	super();
	System.out.println("Savings_Account -Constructor");
}
public static void main(String[] args){
	Savings_Account a1 = new Savings_Account();
}
}