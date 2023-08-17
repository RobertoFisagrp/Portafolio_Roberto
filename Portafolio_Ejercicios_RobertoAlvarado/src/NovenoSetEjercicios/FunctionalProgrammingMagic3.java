package NovenoSetEjercicios;

import java.util.List;

public class FunctionalProgrammingMagic3 {

	public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
		if (courses == null) {
			List<Integer> lista = List.of();
			return lista;
		}

		return courses.stream().map(e -> e.length()).toList();

	}
}
