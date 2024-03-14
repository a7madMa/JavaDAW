package hoja2Bucles;

import java.util.Scanner;

public class Ejer23 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota;
		// Pedimos cinco notas.
		for (int i = 1; i <= 5; i++) {

			do {
				System.out.println("Nota " + i + ": ");
				nota = entrada.nextDouble();
			} while (nota < 0 || nota > 10);
			System.out.println();

		}

	}

}
