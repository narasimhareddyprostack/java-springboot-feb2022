class Demo{
    public static void main(String[] args){
	int a = 100;
	int b = 200;
	int c = 300;
	String d = "Rahul";
    System.out.println(a+b+c);   //600 
    System.out.println(a+b+c+d); //600Rahul  
    System.out.println(a+d+b+c); //100Rahul200300  
   
    }
}