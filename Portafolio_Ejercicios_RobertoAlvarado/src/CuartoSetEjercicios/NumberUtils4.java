package CuartoSetEjercicios;

public class NumberUtils4 {

	public int reverseNumber(int number) {
		if (number < 0) {
			return -1;
		}
		int ultimo = 0;
		int reversed = 0;
		while (number > 0) {
			ultimo = number % 10;
			reversed = reversed * 10 + ultimo;
			number = number / 10;
		}
		return reversed;

	}
}
//In this exercise, you are required to complete the method reverseNumber in the NumberUtils class.
//
//This method takes an integer as input and returns the reversed version of the number. For instance, if the input is 123, the method should return 321.
//
//The method handles two edge cases:
//
//If the input number is zero, the method returns 0 since the reverse of 0 is 0.
//
//If the input number is negative, the method returns -1 since the reverse of a negative number is undefined.
//
//The reverseNumber method's signature is as follows:
//
//public int reverseNumber(int number)
//You are expected to provide the implementation of this method, adhering to the behavior explained above.
//
//Examples
//
//reverseNumber(123) should return 321.
//
//reverseNumber(5497) should return 7945.
//
//reverseNumber(-456) should return -1 because the reverse of a negative number is undefined.
//
//reverseNumber(0) should return 0 because the reverse of 0 is 0.
//
//Solution Clues
//
//To reverse the number, you can repeatedly extract the last digit and append it to the reversed number.
//
//You can use the modulo operator % to get the last digit (e.g., number % 10 gives the last digit) and integer division / to remove the last digit from the number (e.g., number /= 10).