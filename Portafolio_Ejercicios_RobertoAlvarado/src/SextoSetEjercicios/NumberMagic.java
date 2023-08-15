package SextoSetEjercicios;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic {

	/**
	 * This method returns all factors of a given number in an ArrayList.
	 * 
	 * @param number the number to find factors of
	 * @return a List of factors of the number
	 */
	public List<Integer> determineAllFactors(int number) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		if (number <= 0) {
			return lista;
		}
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				lista.add(i);
			}

		}
		return lista;

	}
}
