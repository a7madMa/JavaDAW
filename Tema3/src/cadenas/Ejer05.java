package cadenas;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String frase;

		System.out.println("Dime una frase");
		frase = entrada.nextLine();

		// Imprimimos la frase
		System.out.println("Frase: " + frase);

		int contadorPalabras = 0;
		boolean enPalabra = false;

		for (int i = 0; i < frase.length(); i++) {
			char caracterActual = frase.charAt(i);

			// Si el carácter actual no es un espacio en blanco, marca que estamos en una
			// palabra
			if (caracterActual != ' ') {
				enPalabra = true;
			} else if (enPalabra) {
				contadorPalabras++;
				enPalabra = false;

				// Si encontramos un espacio en blanco y estábamos en una palabra, aumentamos el
				// contador

			}
		}

		// Nos aseguramos de contar la última palabra si la frase no termina con un
		// espacio en blanco
		if (enPalabra) {
			contadorPalabras++;
		}

		System.out.println("La frase está formada por " + contadorPalabras + " palabra(s).");

		entrada.close();
	}
}
