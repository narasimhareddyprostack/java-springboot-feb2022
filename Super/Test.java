class Bank{	
double min_Bal = 500.00;
Bank(){
	System.out.println("Bank Class Constructor");
}
public double getMin_Bal(){
	return min_Bal;
}
}
class Savings_Account extends Bank{
	double min_Bal = 600.00;
	public double getMin_Bal(){
		return super.getMin_Bal();	
	}
	public void getDetails(){
		System.out.println(super.min_Bal);
	}
	public static void main(String[] args){
	Savings_Account a1 = new Savings_Account();
	
	}
}

