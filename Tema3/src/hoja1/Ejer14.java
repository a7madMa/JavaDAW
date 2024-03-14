package hoja1;

public class Ejer14 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que rellene un array llamado primos con los 100 primeros
		 * números primos. Recuerda que un número entero es primo si no puede dividirse
		 * por ninguno que no sea 1 o él mismo. Los primeros números primos son: 2, 3,
		 * 5, 7, 11, 13, 17, 19, 23, 29, ...
		 */

		// declaramos variables y arrays
		int num = 2;
		boolean esPrrimo = true;
		int[] numeros = new int[100];
		int posicion = 0;
		int i = 2;

		// Entramos en bucle infinito porque no sabemos el numero primo que ocupa pos.
		// 100
		while (true) {

			/*
			 * Comprobamos si el número es primo dividiendolo por todos los números
			 * anteriores a él y 2 (que es el único número par que es primo)
			 */
			for (i = 2; i <= (num / 2); i++) {

				// Si en algún momento el resto de la división es 0, el número no es primo y
				// asignamos false
				if (num % i == 0) {

					esPrrimo = false;
				}
			}
			// Si el número es primo, lo añadimos al array
			if (esPrrimo) {

				numeros[posicion] = num;
				posicion++;

			}
			if (posicion == 100) {
				break;
			}

			// Reinicios y actualizaciones de variables/contadores
			num++;
			esPrrimo = true;
			i = 2;

		}
		// Mostramos la posición y el número primo que contiene
		System.out.println("\nLos 100 primeros números primos son: ");
		for (int k = 0; k < numeros.length; k++) {
			System.out.println("Posición --> [" + k + "]" + "  Número primo --> " + numeros[k]);
		}
	}
}