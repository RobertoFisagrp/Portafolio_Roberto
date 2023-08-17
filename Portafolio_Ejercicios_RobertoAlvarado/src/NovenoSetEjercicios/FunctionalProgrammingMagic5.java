package NovenoSetEjercicios;

import java.util.List;

public class FunctionalProgrammingMagic5 {

	public static int findMaxEvenNumber(List<Integer> numbers) {
		if (numbers == null || numbers.isEmpty()) {
			return 0;

		}
		int max = numbers.stream().filter(e -> e % 2 == 0).max((e1, e2) -> Integer.compare(e1, e2)).orElse(0);

		return max;

	}
}
