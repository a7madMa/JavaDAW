package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo09 {

	public static void main(String[] args) {
		// El método Math.random() devuelve un número mayor o
		// igual a 0, y menor que 1.

		System.out.println(Math.random());
		int i = 1;
		while (i <= 10) {
			System.out.println(Math.random());
			i++;

			// Si multiplicamos Math.random() por 2 y le sumamos 1, obtendremos
			// Números decimales mayores o iguales a 1 y menores que 3.

			System.out.println("\n");

			while (i <= 10) {
				int numAleatorio = (int) (6 * Math.random() + 1);
				System.out.println(numAleatorio);
				i++;

			}
		}

	}
}
