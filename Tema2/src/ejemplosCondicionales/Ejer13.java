package ejemplosCondicionales;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una nota del 1 al 10 y te diré la calificación correspondiente");

		double nota = entrada.nextDouble();

		if (nota < 5) {
			System.out.println("la nota es insuficiente");

		} else if (nota == 5) {
		} else if (nota == 5) {
			
			System.out.println("La nota es un suficiente");
		} else if (nota == 7 && (nota == 8)) {
			
			System.out.println("La nota es un notable");
		} else if (nota == 9 && (nota == 10)) {
			
			System.out.println("La nota es un Excelente");

		}

	}
}
