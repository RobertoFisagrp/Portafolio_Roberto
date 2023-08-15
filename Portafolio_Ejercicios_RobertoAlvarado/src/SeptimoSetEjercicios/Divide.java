package SeptimoSetEjercicios;

class Divide implements Operation {
	public int perform(int x, int y) {
		if (y == 0) {
			return -1;
		}
		return x / y;
	}
}