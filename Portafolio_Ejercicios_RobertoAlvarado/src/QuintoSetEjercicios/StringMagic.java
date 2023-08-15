package QuintoSetEjercicios;

public class StringMagic {

	/**
	 * This method counts the number of uppercase letters in a given string.
	 *
	 * @param str The string to count uppercase letters in.
	 * @return The number of uppercase letters in the string.
	 */
	public int countUppercaseLetters(String str) {
		int count = 0;
		if (str.isEmpty() == true) {
			return 0;
		}
		for (int i = 0; i < str.length(); i++) {
			Character s = str.charAt(i);
			if (Character.isUpperCase(s) == true) {
				count++;
			}
		}
		return count;
	}
}
