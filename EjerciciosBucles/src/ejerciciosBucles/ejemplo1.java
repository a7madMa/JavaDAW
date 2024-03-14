package ejerciciosBucles;

import java.util.Scanner;

public class ejemplo1 {

	public static void main(String[] args) {

		// Este programa pedirá una serie de precios al usuario.
		// Cuando el usuario escriba un cero, el programa parará.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime una serie de precios: ");
		float precio = 1;

		while (precio > 0) {

			System.out.println("Precio? ");
			precio = entrada.nextFloat();

		}
		System.out.println("VIVA EL NANO");
		entrada.close();
	}

}
