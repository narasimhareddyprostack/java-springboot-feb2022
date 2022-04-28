package lambdaEx;

import java.util.function.Predicate;

public class PredicateEx implements Predicate<Integer> {

	public static void main(String[] args) {
		PredicateEx pe = new PredicateEx();
		System.out.println(pe.test(11));
	}
	@Override
	public boolean test(Integer i) {
		boolean flag = i % 2 == 0;
		return flag;
	}

}
