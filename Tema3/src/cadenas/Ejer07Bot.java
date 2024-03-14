package cadenas;

import java.util.Scanner;

public class Ejer07Bot {

	// Variación en que modificamos la frase sustituyendo las palabrotas por
	// asteriscos.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String frase;

		String[] palabrotas = { "sinvergüenza", "maleducado", "analfabeto", "bribón", "mendrugo", "gitanos" };

		System.out.println("Dima una frase: ");
		frase = entrada.nextLine();

		boolean textoLimpio = true;

		for (int i = 0; i < palabrotas.length; i++) {

			if (frase.indexOf(palabrotas[i]) != -1) {

				textoLimpio = false;

				frase = frase.replace(palabrotas[i], "****");

				System.out.println(frase);

				break;

			}

		}

		if (textoLimpio) {

			System.out.println("Tu frase está limpia");

		} else {

			System.out.println("\nHas escrito una palabrota y la he censurado porque dan asco");

		}

	}

}