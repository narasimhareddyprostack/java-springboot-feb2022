interface Bank{
 int min_Bal = 500;
}
class Test implements Bank{
public static void main(String[] args){
	min_Bal = 600;
	System.out.println(min_Bal);
}

}