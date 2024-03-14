package cadenas;

import java.util.Scanner;

// Programa que te pide cinco palabras y te dice cuál es la que va primero,alfabéticamente.
public class Ejer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String mascotas[] = new String[5];
		int posMin = 0;

		// Leemos los nombres de las mascotas.
		System.out.println("Escribe cinco mascotas:");
		for (int i = 0; i < mascotas.length; i++) {

			System.out.println("Mascot" + (i + 1) + " :");
			mascotas[i] = entrada.nextLine();
		}

		// Buscamos el mínimo del array.

		for (int i = 1; i < mascotas.length - 1; i++) {

			if (mascotas[i].compareTo(mascotas[posMin]) < 0) {

				posMin = i;
			}

		}
		System.out.println("La primera palabra, analfaéticamente, es " + mascotas[posMin] + ".");

	}

}
