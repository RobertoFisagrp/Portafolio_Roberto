package QuintoSetEjercicios;

public class StringMagic2 {

	/**
	 * This method checks if a given string has two consecutive identical
	 * characters.
	 *
	 * @param str The string to check for consecutive duplicates.
	 * @return true if the string has consecutive duplicates, false otherwise.
	 */
	public boolean hasConsecutiveDuplicates(String str) {
		if (str.isEmpty() == true) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (i + 1 < str.length()) {
				Character c = str.charAt(i);
				Character d = str.charAt(i + 1);
				if (c.equals(d) == true) {
					return true;

				}
			}

		}
		return false;

	}
}
