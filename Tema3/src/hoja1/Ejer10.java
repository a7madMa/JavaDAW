package hoja1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ves poniendo precios: ");
		double[] compra = new double[100];

		for (int i = 0; i < compra.length; i++) {

			System.out.println("Dime el precio del producto: ");
			compra[i] = entrada.nextDouble();

			if (compra[i] <= 0) {
				System.out.println("Se ha terminado la compra.");
				break;
			}

		}
		System.out.println("La lista de la compra es:");

		for (int i = 1; i < compra.length; i++) {

			if (compra[i] <= 0) {

				break;
			}

			System.out.println(compra[i]);

		}
	}
}
