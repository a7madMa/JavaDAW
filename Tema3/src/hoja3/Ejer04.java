package hoja3;

import java.util.Scanner;

public class Ejer04 {

	// Ejercicio5
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		double precios[] = new double[6];
		double suma = 0;
		double descuento;

		System.out.println("Caja registradora");
		System.out.println("=====================");

		for (int i = 0; i < precios.length; i++) {
			System.out.println("Precio " + i + ": ");
			precios[i] = entrada.nextDouble();

			if (precios[i] < 0) {
				break;

			}

			if (suma > 50) {

				descuento = precios[i] * 0.1;
				precios[i] = precios[i] - descuento;

			}

			suma = suma + precios[i];

		}

		System.out.println("\nTicket de la compra");

		for (int i = 0; i < precios.length; i++) {

			if (precios[i] < 0) {
				break;
			}

		}
		System.out.println("\nTotal a pagar:" + suma + " €");
		System.out.println("Gracias por la compra.");

	}

}
