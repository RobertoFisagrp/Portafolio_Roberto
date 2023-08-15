package OctavoSetEjercicios;

public class MyString {

	public String str;

	public MyString(String str) {
		this.str = str;
	}

	public boolean isHexadecimalChar(char ch) {
		return ((ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F'));

	}

	public boolean isHexadecimal() {
		if (str == null || str.equals("")) {
			return false;
		}
		for (char ch : str.toCharArray()) {
			if (!isHexadecimalChar(ch) && !Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

}
