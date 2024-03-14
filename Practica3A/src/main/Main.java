package main;

import consola.Consola;

public class Main {
	public static void main(String[] args) {

		// Método 1

		Consola consola1 = new Consola();

		System.out.println("Escribe tu edad: ");
		int numero = consola1.leerInt("Tu edad debe ser un número entero!");

		System.out.println("\nTu edad es " + numero);

		// Método 2

		Consola consola2 = new Consola();

		System.out.println("\nEscribe tu edad:");
		int numero1 = consola2.leerInt();

		System.out.println("\nTu edad es " + numero1 + ".");

	}
}
