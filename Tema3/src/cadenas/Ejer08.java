package cadenas;

// Programa que lee una frase desde el teclado y nos muestra la primera palabra
import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == ' ') {

				break;

			}
			System.out.print(frase.charAt(i));

		}

	}

}
