package SextoSetEjercicios;

public class ArrayMagic2 {

	/**
	 * This method finds and returns the second largest element in the given array.
	 * 
	 * @param array the array in which to find the second largest element
	 * @return the second largest element in the array
	 */

	public int findSecondLargestElement(int[] array) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		if (array.length == 0 || array.length == 1) {
			return -1;
		}
		for (int i : array) {
			if (largest < i) {
				secondLargest = largest;
				largest = i;
			} else if (i > secondLargest && i != largest) {
				secondLargest = i;
			}

		}
		if (secondLargest == Integer.MIN_VALUE) {
			return -1;
		}
		return secondLargest;

	}
}