package cadenas;

import java.util.Scanner;

public class Ejer07Alter {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String frase;

		String[] palabrotas = { "sinvergüenza", "maleducado", "analfabeto", "bribón", "mendrugo" };

		System.out.println("Dima una frase: ");
		frase = entrada.nextLine();

		boolean textoLimpio = true;

		for (int i = 0; i < palabrotas.length; i++) {

			if (frase.indexOf(palabrotas[i]) != -1) {

				textoLimpio = false;
				break;

			}

		}

		if (textoLimpio) {

			System.out.println("Tu frase está limpia");

		} else {

			System.out.println("Ha escrito una palabrota");

		}

	}

}