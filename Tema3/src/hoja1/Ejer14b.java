package hoja1;

public class Ejer14b {

	public static void main(String[] args) {
		/*
		 * Modifica el ejercicio 14 para que, al comprobar si un número es
		 * primo, se divida sólo entre los primos que ya se han encontrado
		 * (y que ya están en el array.
		 */

		
		// Por ejemplo, para comprobar si 11 es primo, bastaría dividirlo
		// entre 2, 3, 5 y 7.
		
		// declaramos variables y arrays
		// Número candidato a primo.
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