package lambdaEx;

import java.util.function.Predicate;

public class PredicateExOne {
	static Predicate<Integer> p = i -> i % 2 ==0;
	public static void main(String[] args) {
		System.out.println(p.test(11));

	}

}
