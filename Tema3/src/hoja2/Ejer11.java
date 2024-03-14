package hoja2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int edades[] = new int[10];
		int posMin = 0;
		int posMax = 0;
		int aux;

		for (int i = 0; i < edades.length; i++) {

			System.out.print("Dime la edad" + " " + (i + 1) + ": ");
			edades[i] = entrada.nextInt();

		}

		for (int i = 0; i < edades.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < edades.length; j++) {

				if (edades[j] < edades[posMin]) {
					posMin = j;
				}

			}
			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;
			System.out.println(Arrays.toString(edades));

		}
		System.out.println("\nLa edad mas alta ha sido: " + edades[edades.length -1] + " años");
		System.out.println("\nLa edad mas baja ha sido: " + edades[0] + " años");

	}

}
