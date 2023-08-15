package QuintoSetEjercicios;

public class StringMagic3 {

	/**
	 * This method finds the rightmost digit in a given string.
	 *
	 * @param str The string to find the rightmost digit in.
	 * @return The rightmost digit in the string. If no digit is found, return -1.
	 */
	public int getRightmostDigit(String str) {
		int digit = -1;
		if (str.isEmpty() == true) {
			return -1;
		}
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (Character.isDigit(c)) {
				digit = Character.getNumericValue(c);
			}

		}
		return digit;

	}
}
