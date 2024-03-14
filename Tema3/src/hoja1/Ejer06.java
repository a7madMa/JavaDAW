package hoja1;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime los precios de 10 productos: ");

		double[] productos = new double[10];

		System.out.println("Ves introduciendo precios: ");
		for (int i = 0; i < productos.length; i++) {

			System.out.println("Precio " + (i + 1) + ":");
			productos[i] = entrada.nextDouble();
		}

		System.out.println("La lista de precios es la siguiente: ");

		for (int i = 0; i < productos.length; i++) {

			System.out.println(productos[i] + " €");

		}
		entrada.close();

	}

}
