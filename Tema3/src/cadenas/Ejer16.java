package cadenas;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime una frase y te generaré su acrónimo: ");
		String frase = entrada.nextLine();

		// Separamos la frase en palabras sueltas guardadas en un array.

		String[] separada = frase.split(" ");

		// Formamos una cadena con la primera letra de cada palabra.

		String acronimo = "";

		for (int i = 0; i < separada.length; i++) {
			
			acronimo = acronimo + separada[i].charAt(0);
			
		}

		// Pasamo esa cadena a mayúsculas.
		
		acronimo = acronimo.toUpperCase();

		System.out.println("Acrónimo: " + acronimo);
	}

}
