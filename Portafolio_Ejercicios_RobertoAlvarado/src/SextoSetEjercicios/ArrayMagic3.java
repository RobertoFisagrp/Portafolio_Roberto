package SextoSetEjercicios;

public class ArrayMagic3 {

	/**
	 * This method checks if the input array is sorted in ascending order.
	 * 
	 * @param array the array to check
	 * @return true if the array is sorted, false otherwise
	 */
	public boolean isSorted(int[] array) {

		if (array.length == 0) {
			return true;
		}
		int iterator = array[0];
		for (int i = 1; i < array.length; i++) {
			if (iterator < array[i] || iterator == array[i]) {
				iterator = array[i];
			} else {
				return false;
			}
		}
		return true;
	}
}
