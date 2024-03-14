package hoja2Bucles;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {

		/*
		 * Tabla del 1 Tabla del 2 Tabla del 3 ... Tabla del 10
		 */

		Scanner entrada = new Scanner(System.in);

		// Bucle que muestra las 10 primeras tablas de
		// Multiplicar
		for (int i = 1; i <= 10; i++) {

			// Mostramos la tabla del número i.
			System.out.println("\nTabla del " + i + ":");
			for (int j = 0; j <= 10; j++) {

				System.out.println(i + "x" + j + "=" + i * j);

			}

		}

	}

}
