package practicaExamenTema3;

import java.util.Iterator;
import java.util.Scanner;

public class OrdenarMenorAMayor {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// Para ordenar un array de menor a mayor debemos crear las variable: posMin y
		// posMax;
		int posMin = 0;
		int posMax = 0;
		int aux;
		int edades[] = new int[5];

		// For para preguntar los numeros.
		for (int i = 0; i < edades.length; i++) {

			System.out.print("Dime la edad" + " " + (i + 1) + ": ");
			edades[i] = entrada.nextInt();
		}

		// Creamos un for para ordenar de menor a mayor.

		for (int i = 0; i < edades.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < edades.length; j++) {

				if (edades[j] < edades[posMin]) {
					posMin = j;
				}
			}

			// Intercambiamos las posiciones.
			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;

		}

		System.out.println("\nLa edad mas alta ha sido: " + edades[edades.length - 1] + " años");
		System.out.println("\nLa edad mas baja ha sido: " + edades[0] + " años");

	}
}
