package cadenas;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime una frase:");

		String frase = entrada.nextLine();

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == ' ') {

				break;

			}

			System.out.print(frase.charAt(i));

		}

		entrada.close();

	}

}
