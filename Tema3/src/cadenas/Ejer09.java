package cadenas;

import java.util.Scanner;

// Programa que lee una frase desde el teclado y la muestra quitando la primera palabra
public class Ejer09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe una frase: ");
		
		String frase = entrada.nextLine();

		int espacio = frase.indexOf(" ");

		for (int i = espacio + 1; i < frase.length(); i++) {

			System.out.print(frase.charAt(i));
		}

	}

}
