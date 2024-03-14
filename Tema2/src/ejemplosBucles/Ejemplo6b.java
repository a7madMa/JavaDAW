package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo6b {

	public static void main(String[] args) {
		// Programa que vaya pidiendo nombres de persona al usuario.
		// Cuando el usuario escriba "Pepe", el programa responderá con
		// "ese nombre no me gusta" y terminará

		Scanner entrada = new Scanner(System.in);

		System.out.println("Te voy a pedir nombres de personas");

		System.out.println("Nombre: ");
		String nombre = entrada.nextLine();

		while (!nombre.equals("pepe")) {

			System.out.println("Nombre: ");
			nombre = entrada.nextLine();

		}

		System.out.println("\n Este nombre no me gusta!");

		entrada.close();
	}

}
