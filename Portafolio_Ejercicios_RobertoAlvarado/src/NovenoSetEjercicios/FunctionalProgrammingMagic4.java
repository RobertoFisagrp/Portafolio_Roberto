package NovenoSetEjercicios;

import java.util.List;

public class FunctionalProgrammingMagic4 {

	public static long sumOfSquares(List<Integer> numbers) {
		if (numbers == null || numbers.isEmpty()) {
			return 0;
		}
		long sum = numbers.stream().map(e -> e * e).reduce((n1, n2) -> n1 + n2).get();
		return sum;

	}

}
