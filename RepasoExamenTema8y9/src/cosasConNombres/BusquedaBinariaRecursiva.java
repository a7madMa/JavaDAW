package cosasConNombres;

public class BusquedaBinariaRecursiva {

	public static void main(String[] args) {

		int x = 8;
		int[] notas = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		System.out.println(x + " se encuentra en la posición " + busqueda(notas, x, 0, notas.length - 1));

	}

	// Devuelve la posición de x en el array numeros, buscando entre
	// las posiciones i y f.
	private static int busqueda(int[] numeros, int x, int i, int f) {

		System.out.println("Buscando " + x + " entre las posiciones " + i + " y " + f + ".");

		if (f < i) {
			return -1;
		}

		int m = (i + f) / 2;

		if (numeros[m] == x) {
			return m;
		}

		if (numeros[m] < x) {
			return busqueda(numeros, x, m + 1, f);
		} else {
			return busqueda(numeros, x, i, m - 1);
		}

	}

}
