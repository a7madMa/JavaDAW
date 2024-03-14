package hoja1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime las órdenes que desee que haga el robot: ");
		String[] ordenes = new String[1000];

		for (int i = 0; i < ordenes.length; i++) {

			System.out.println("Órdenes:  ");
			ordenes[i] = entrada.nextLine();

			if (ordenes[i].equals("ejecutar")) {

				System.out.println("Ejecutando órdenes");

				break;
			}
		}

		for (int i = 0; i < ordenes.length; i++) {

			if (ordenes[i].equals("ejecutar")) {

				break;
			}

			System.out.println("Las órdenes introducidas son las siguintes: " + ordenes[i]);

		}

	}

}
