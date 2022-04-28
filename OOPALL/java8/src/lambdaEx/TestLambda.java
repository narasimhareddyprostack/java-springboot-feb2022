package lambdaEx;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestLambda {
	
	static Function<Integer, Integer> f = (a) ->{ 
		 return a*a;
		 };
	static Predicate<Integer> p	 = i ->  i%2 ==0; 
	static Consumer<Integer> c;

	public static void main(String[] args) {
		boolean result =p.test(15);
		System.out.println(result);
		int number = f.apply(4);
		System.out.println(number);
	}
}