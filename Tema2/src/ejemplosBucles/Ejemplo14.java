package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo14 {

	public static void main(String[] args) {

		// Programa que pide 10 nombres.
		// Si uno de los nombres es "parar", el bucle
		// termina en ese mismo momento.

		Scanner entrada = new Scanner(System.in);

		String nombre;

		for (int i = 1; i <= 10; i++) {

			System.out.println("Escribe un nombre: ");
			nombre = entrada.nextLine();

			if (nombre.equals("parar")) {
				System.out.println("Parando.");
				// La instrucción break hace que el bucle termina de golpe.
				// Lo que se escribe debajo del break tampoco se ejecutaria
				// Porque terminaria en el break.
				break;
			}

		}
		System.out.println("Gracias por escribir estos nombres. ");

	}

}
