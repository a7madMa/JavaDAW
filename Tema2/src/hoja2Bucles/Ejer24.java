package hoja2Bucles;

import java.util.Scanner;

public class Ejer24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		// Pedimos cinco notas.
		double nota;
		double NotaFinal = 0;
		for (int i = 1; i <= 5; i++) {

			do {
				System.out.println("Nota " + i + ": ");
				nota = entrada.nextDouble();
			} while (nota < 0 || nota > 10);
			NotaFinal = NotaFinal + nota;
			System.out.println();

			System.out.println("La Suma de las notas és :" + NotaFinal + " y la media és: " + (NotaFinal / 5));

		}

	}

}
