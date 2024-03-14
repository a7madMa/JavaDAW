package hoja3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double precios[] = new double[50];
		double suma = 0;
		double descuento;
		System.out.println("Caja registradora");
		System.out.println("======================");

		for (int i = 0; i < precios.length; i++) {

			System.out.println("precio " + i + ": ");
			precios[i] = entrada.nextDouble();

			if (precios[i] < 0) {
				break;

			}

			if (suma > 50) {
				// Aplicar descuento solo al último precio ingresado que causó que la suma
				// supere 50

				descuento = precios[i] * 0.1;
				precios[i] = precios[i] - descuento;

				// Terminar el bucle después de aplicar el descuento
			}

			suma = suma + precios[i];

		}

		System.out.println("\nTicket de la compra");

		for (int i = 0; i < precios.length; i++) {

			if (precios[i] < 0) {

				break;

			}

			System.out.println(precios[i]);

		}
		System.out.println("\nTotal a pagar:" + suma);
		System.out.println("Gracias por la compra.");

	}
}
