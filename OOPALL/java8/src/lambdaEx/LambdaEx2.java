package lambdaEx;

import java.util.function.Function;

public class LambdaEx2 {
    //static Function<Integer, Integer> f = (i)->{ return i*i;};
    
	static Function<Integer, Integer> f = i-> i*i;
    
	public static void main(String[] args) {
	System.out.println(f.apply(3));

	}

}
