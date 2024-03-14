package hoja1;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime las 10 notas: ");

		double[] notas = new double[10];

		int i = 0;
		while (i < notas.length) {

			System.out.println("Dime la nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
			i++;

		}
		System.out.println("Veces que aparece i = " + i);
		System.out.println("La lista de notas es la siguiente: ");

		for (int j = 0; j < notas.length; j++) {

			System.out.println(notas[j] + " €");

		}

	}

}
