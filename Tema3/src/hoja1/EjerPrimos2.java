package hoja1;

import java.util.Scanner;

// Programa que muestre en pantalla los números primos
// que haya desde el 2 hasta el 1000.	

public class EjerPrimos2 {

	public static void main(String[] args) {

		boolean Esprimo;

		for (int i = 1; i <= 1000; i++) {

			Esprimo = true;

			for (int j = 2; j <= i / 2; j++) {

				if (i % j == 0) {

					Esprimo = false;

					break;

				}

			}

			if (Esprimo) {

				System.out.println(i);

			}

		}

	}

}