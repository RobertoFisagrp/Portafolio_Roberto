package SextoSetEjercicios;

public class ArrayMagic4 {

	/**
	 * This method reverses an array.
	 * 
	 * @param array the array to reverse
	 * @return a new array with elements in reverse order
	 */
	public int[] reverseArray(int[] array) {
		if (array.length < 1) {
			return array;
		}
		int[] reverse = new int[array.length];
		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			reverse[start] = array[end];
			reverse[end] = array[start];
			start++;
			end--;
		}
		return reverse;
	}
}
