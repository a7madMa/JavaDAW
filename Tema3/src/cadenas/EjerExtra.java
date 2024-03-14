package cadenas;

import java.util.Scanner;

public class EjerExtra {
	public static void main(String[] args) {
		/*
		 * Programa que busca una palabra dentro de una frase mostrándonos todas las
		 * posiciones donde aparece.
		 */

		Scanner escaner = new Scanner(System.in);

		System.out.println("Introduce una frase: ");
		String frase = escaner.nextLine();

		System.out.println("Introduce una palabra: ");
		String palabra = escaner.nextLine();

		int contador = frase.indexOf(palabra);

		while (contador != -1) {
			System.out.println("La palabra " + palabra + " aparece en la posición " + contador);
			contador = frase.indexOf(palabra, contador + 1);
		}
		escaner.close();
	}
}