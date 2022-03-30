class Account{
int acc_Id;
String acc_Name;
Account(int a, String b){
this.acc_Id = a;
this.acc_Name = b;
System.out.println("Account Class - Constructor");
}
public void m1(){
System.out.println("Account Class - m1()");

}
public static void main(String[] args){

Account a1 = new Account(101,"Rahul Gandhi");
Account a2 = new Account(102,"Sonia Gandhi");
System.out.println("Acc Id:"+a1.acc_Id + " Acc Name:"+a1.acc_Name);
System.out.println("Acc Id:"+a2.acc_Id + " Acc Name:"+a2.acc_Name);

}
}