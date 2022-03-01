class Demo{

int a = 100;
int b = 200;
static int c = 10;

public static void main(String[] args){
	Demo d1 = new Demo();
	System.out.println(d1.a + d1.b); //300
	System.out.println(d1.a + d1.b + d1.c);//310
	d1.c = 100;
	d1.a = 10;
	System.out.println(d1.a + d1.b + d1.c);//310
	Demo d2 = new Demo();
	System.out.println(d2.a+ d2.b+d2.c);
	}
}