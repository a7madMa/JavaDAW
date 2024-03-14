package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una palabra y te la escribiré 10 veces: ");
		String palabra = entrada.nextLine();

		// Bucle while
		int i = 1;
		while (i <= 10) {
			System.out.println("La palabra és: " + palabra);
			i++;
		}

		// Bucle for.
		// for (inicialización; condición; actualización).
		// Dentro del corchete se indica lo que queremos que haga en este caso el print.
		System.out.println("Bucel for: ");

		// Declaramos una variable contador j y la inicializacom
		// con el valor 1. Mientras j <=10 el bucle se repetirá.
		// En cada vuelta del bucle, la j aumentará en 1.

		for (int j = 1; j <= 10; j++) {

			System.out.println(palabra);
		}

	}

}
