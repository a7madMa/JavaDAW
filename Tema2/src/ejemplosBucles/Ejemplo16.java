package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo16 {

	public static void main(String[] args) {

		// Bucle infinito que pregunta nombres sin parar.

		Scanner entrada = new Scanner(System.in);

		String nombre;
		System.out.println("BUCLE INFINTIO QUE PREGUNTA NOMBRES SIN PARAR");
//
//		for (int i = 2; i > 1; i++) {
//
//			System.out.println("Dime un nombre: ");
//			nombre = entrada.nextLine();

		// Cuando queramos ecribir un bucle infinito, usaremos
		// while
		while (true) {
			System.out.println("Dime un nombre: ");
			nombre = entrada.nextLine();

			if (nombre.equals("")) {
				break;

			}
			entrada.close();
		}
	}
}
