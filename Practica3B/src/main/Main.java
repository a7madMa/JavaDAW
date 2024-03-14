package main;

import consola.Consola;

public class Main {
	public static void main(String[] args) {

		// Probamos el método leerDouble(String mensajeError)

		System.out.println("Escribe tu altura, en metros: ");
		double numeroDouble = Consola.leerDouble("¡Tu altura debe ser un número!");

		System.out.println("Tu altura es " + numeroDouble + " metros.");

		// Probamos el método leerDouble()

		System.out.println("\nEscribe tu altura, en metros");
		double numeroDouble2 = Consola.leerDouble();
		System.out.println("Tu altura es " + numeroDouble2 + " metros.");

		// Probamos el método leerString()

		System.out.println("\n¿Cómo te llamas?");
		String cadena = Consola.leerString();

		System.out.println("Te llamas " + cadena + ".");

	}
}
