package cadenas;

import java.util.Scanner;

// Programa que lee una frase y nos dice por cuántas palabras está formada. Usa el
// método indexOf(int caracter, int posicion)

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String frase;

		System.out.println("Escribe una frase: ");
		frase = entrada.nextLine();

		int numPalabras = 1;
		int posEspacio = 0;

		while (posEspacio != -1) {

			numPalabras++;
			posEspacio = frase.indexOf(" ", posEspacio + 1);

		}
		System.out.println("La frase esta formada por: " + numPalabras + " Palabras.");

		entrada.close();
	}

}
