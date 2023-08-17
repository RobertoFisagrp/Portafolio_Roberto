package NovenoSetEjercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingMagic2 {

	/**
	 * This method generates the cubes of the first n natural numbers.
	 * 
	 * @param n The number of natural numbers for which cubes are to be calculated.
	 * @return List<Integer> This returns a list of cubes of the first n natural
	 *         numbers.
	 */
	public static List<Integer> getCubesOfFirstNNumbers(int n) {
		if (n == 0) {
			List<Integer> lista = new ArrayList<Integer>();
			return lista;
		}

		return IntStream.range(1, n + 1).map(e -> e * e * e).boxed().collect(Collectors.toList());
	}
}
