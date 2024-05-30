package cosasConNombres;

public class BusquedaBinaria {

	public static void main(String[] args) {

		int[] edades = { 10, 20, 30, 40, 50, 70, 80, 90 };

		int x = 20;
		int pos = busqueda(x, edades);

		if (pos != -1) {
			System.out.println("El número " + x + " está en la posición " + pos + ".");
		} else {
			System.out.println("El número " + x + " no se encuentra en el array.");
		}

	}

	private static int busqueda(int x, int[] numeros) {

		int i = 0; // Extremo izquierdo de búsqueda
		int f = numeros.length - 1; // Extremo derecho de búsqueda
		int m; // Punto medio entre i y f

		while (i <= f) {

			// Calculamos la posición en medio de i y f.
			m = (i + f) / 2;

			// Comparamos el valor en m con el valor buscado.
			if (x == numeros[m]) {
				// Hemos encontrado el valor buscado.
				return m;
			} else if (x < numeros[m]) {
				f = m - 1;
			} else {
				i = m + 1;
			}

		}

		return -1;

	}

}