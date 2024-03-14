package hoja2Bucles;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el precio de cuatro prodcutos y te diré el precio total.");

		float suma = 0;
		for (int i = 1; i <= 4; i++) {
			float precio = entrada.nextFloat();

			suma = precio + suma;

		}
		System.out.println("\nEl precio total es: " + (suma) + "€");
	}

}
