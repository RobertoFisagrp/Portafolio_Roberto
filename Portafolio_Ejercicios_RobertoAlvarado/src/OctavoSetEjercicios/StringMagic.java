package OctavoSetEjercicios;

import java.util.Arrays;

public class StringMagic {

	public boolean areAnagrams(String str1, String str2) {
		if (str1 == null) {
			return false;

		}
		if (str2 == null) {
			return false;

		}
		if (str1.length() != str2.length()) {
			return false;
		}
		String stringInLower = str1.toLowerCase();
		String stringInLower2 = str2.toLowerCase();

		char[] chars = stringInLower.toCharArray();
		char[] chars2 = stringInLower2.toCharArray();
		Arrays.sort(chars);
		Arrays.sort(chars2);
		if (Arrays.equals(chars, chars2)) {
			return true;
		}
		return false;
	}
}