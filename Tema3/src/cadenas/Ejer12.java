
package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String frase = "";
		System.out.println("Introduce una frase: ");
		frase = entrada.nextLine();
		frase = frase.trim();

		int posEspacio = 0;
		int posEspacioSiguiente = frase.indexOf(" ");
		int numPalabras= 0;
		
		// Contamos
		
		int cont2 = 0;
		boolean leyendoPalabra = false;

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) != ' ') {
				leyendoPalabra = true;
				if (cont2 == 0) {
					cont2++;
				}
			} else if (frase.charAt(i) == ' ' && leyendoPalabra == true) {
				leyendoPalabra = false;
				cont2++;
			}

		}
		String[] palabras = new String[cont2];

		while (posEspacioSiguiente != -1) {

			palabras[numPalabras] = frase.substring(posEspacio, posEspacioSiguiente);

			posEspacio = posEspacioSiguiente + 1;

			posEspacioSiguiente = frase.indexOf(' ', posEspacio);
			numPalabras++;
		}
		palabras[numPalabras] = frase.substring(posEspacio);
		System.out.println(Arrays.toString(palabras));

	}

}