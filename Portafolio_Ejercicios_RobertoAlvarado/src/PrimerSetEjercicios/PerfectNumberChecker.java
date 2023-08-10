package PrimerSetEjercicios;

public class PerfectNumberChecker {
	public boolean isPerfectNumber(int number) {
		int divisores = 0;
		for (int i = 1; i <= number; i++) {
			if (i != number) {
				if (number % i == 0) {
					divisores = divisores + i;

				}
			}
		}
		if (divisores == number && number != 0) {
			return true;
		}
		return false;
	}
}
//In this exercise, your task is to implement a method in the PerfectNumberChecker class that checks whether a number is a "perfect number".
//
//A Perfect Number is a positive integer that is equal to the sum of all of its positive divisors, excluding itself.
//
//For example, the number 6 is a perfect number because its divisors are 1, 2, and 3. The sum of these divisors is equal to 6, so 6 is a perfect number. Similarly, 28 is also a perfect number because its divisors (1, 2, 4, 7, 14) sum up to 28.
//
//public class PerfectNumberChecker {
//    public boolean isPerfectNumber(int number) {
//        // Write code here
//    }
//}
//Instructions
//
//The isPerfectNumber(int number) method should return true if the number is a perfect number, and false otherwise.
//
//A perfect number is always a positive integer. If the number is zero or a negative number, return false.
//
//You can assume that the input number will always be an integer.