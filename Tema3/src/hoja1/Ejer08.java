package hoja1;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime las 10 notas: ");

		double[] notas = new double[10];

		int i = 0;
		while (i < notas.length) {

			System.out.println("Dime la nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();

			if (notas[i] < 0) {

				System.out.println("No se permiten números negativos. ");
				break;
			}
			i++;

		}

		System.out.println("La lista de notas es la siguiente: ");

		for (int j = 0; j < notas.length;) {

			if (notas[j] < 0) {

				break;
			}

			System.out.println(notas[j]);
			j++;
		}

	}

}
