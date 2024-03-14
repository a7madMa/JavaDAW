package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Números del 1 al 5:\n ");

		// La variable contador irá aumentando de 1 a 5.

		int contador = 1;
		// Se comprueba si condición es menor o igual que 5, y si
		// es así, se ejecuta el bloque de instrucciones dentro del
		// while.
		while (contador <= 5) {

			System.out.println(contador);

			// Se actualiza el contador sumándole 1.
			// En algún momento dejará de cumplirse la
			// Condición del while y el bucle terminará.
			contador++;

		}

		System.out.println("Hecho.");
	}

}
