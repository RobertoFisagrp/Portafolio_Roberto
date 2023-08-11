package CuartoSetEjercicios;

public class NumberUtils3 {

	public int getSumOfDigits(int number) {
		int sum = 0;
		if (number < 0) {
			return -1;
		}
		do {
			sum = sum + (number % 10);
			number = number / 10;
		} while (number % 10 > 0 || number / 10 >= 1);

		return sum;
	}
}
