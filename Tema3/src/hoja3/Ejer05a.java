package hoja3;

import java.util.Scanner;

public class Ejer05a {
	public static void main(String[] args) {

		/*
		 * Programa que lee una frase y nos dice por cuántas palabras está formada.
		 */
		Scanner escaner = new Scanner(System.in);

		String frase;
		int contador = 1;

		System.out.println("Introduce una frase: ");
		frase = escaner.nextLine();

		frase = frase.trim();
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				contador++;
			}
		}

		System.out.println("La frase consta de: " + contador + " palabras.");
		escaner.close();
	}
}