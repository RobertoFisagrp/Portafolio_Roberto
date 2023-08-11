package CuartoSetEjercicios;

public class BiNumber {

	private int number1;
	private int number2;

	public BiNumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}

	public int calculateLCM() {
		int max = 0;
		if (number1 < 0 || number2 < 0) {
			return -1;
		}
		if (number1 == 0 || number2 == 0) {
			return 0;
		}
		max = Math.max(number1, number2);
		int lcm = max;
		while (lcm % number1 != 0 || lcm % number2 != 0) {
			lcm = lcm + max;
		}
		return lcm;

	}
}
