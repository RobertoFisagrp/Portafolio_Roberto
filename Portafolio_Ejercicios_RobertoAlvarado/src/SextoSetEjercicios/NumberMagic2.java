package SextoSetEjercicios;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic2 {
	/**
	 * This method generates a list of multiples of a given number less than a
	 * specified limit.
	 * 
	 * @param number the number to find multiples of
	 * @param limit  the upper bound for the multiples
	 * @return a List of multiples of the number less than the limit
	 */
	public List<Integer> determineMultiples(int number, int limit) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		if (limit < number) {
			return lista;
		}
		if (number <= 0 || limit <= 0) {
			return lista;
		}
		for (int i = 1; i * number < limit; i++) {
			lista.add(i * number);
		}
		return lista;
	}
}
