package hoja2;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean nombreEncontrado = false;
		String nombre[] = new String[10];
		for (int i = 0; i < nombre.length; i++) {

			System.out.println("Dime un nombre: ");
			nombre[i] = entrada.nextLine().toLowerCase();

			if (nombre[i].equals("nadie")) {
				break;

			}
			if (nombre[i].equals("calderón")) {
				nombreEncontrado = true;
				break;

			}

		}
		if (nombreEncontrado) {

			System.out.println("de la barca");

		} else {

			System.out.println("Nombre no encontrado");
		}
	}
}