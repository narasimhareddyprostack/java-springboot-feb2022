class Test{
public static void main(String[] args){
	    int[] size = new int[5];
		size[0] = 38;
		size[1] = 40;
		size[2] = 42;
		size[3] = 44;
		size[4] = 46;
		
		//System.out.println(size[0]); //38
		//System.out.println(size[1]); //40
		//System.out.println(size[2]); //42
		//System.out.println(size[-3]); //AIOBException
		System.out.println(size[100]);//AIOBException
	}
}