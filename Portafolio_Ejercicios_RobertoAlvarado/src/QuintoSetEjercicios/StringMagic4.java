package QuintoSetEjercicios;

public class StringMagic4 {
	public String findLongestWord(String sentence) {
		if (sentence.isEmpty()) {
			return "";
		}
		String[] words = sentence.split(" ");
		int maxLength = 0;
		String longestWord = "";
		for (String word : words) {
			if (word.length() > maxLength) {
				maxLength = word.length();
				longestWord = word;

			}
		}
		return longestWord;

	}
}
