package OctavoSetEjercicios;

public class StringMagic2 {

	public String reverseWordsInSentence(String sentence) {
		StringBuilder str2 = new StringBuilder();

		if (sentence == null) {
			return "INVALID";
		}
		if (sentence.equals("")) {
			return "";
		}

		String[] rev = sentence.split(" ");
		for (String str : rev) {
			StringBuilder revw = new StringBuilder(str).reverse();
			str2.append(revw).append(" ");

		}
		return str2.toString().trim();
	}

}
