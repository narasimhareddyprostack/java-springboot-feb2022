package pack1;
public class Savings_Account extends Account{
double acc_Bal;
Savings_Account(int a, String b, double c){
	//super(a,b);
	this.acc_Bal = c;
	System.out.println("Savings_Account -Constructor");
}
public static void main(String[] args){
	Savings_Account a1 = new Savings_Account(101,"Rahul Gandhi", 5000.00);
	System.out.println(a1.acc_Id);
	System.out.println(a1.acc_Name);
	System.out.println(a1.acc_Bal);
	}
}