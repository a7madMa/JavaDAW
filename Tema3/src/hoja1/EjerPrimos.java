package hoja1;

import java.util.Scanner;

public class EjerPrimos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num = 0;
		System.out.println("Numeros primos o compuestos");

		boolean esPrimo = true;

		System.out.println("Dime un número entero:");
		num = entrada.nextInt();

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {

				esPrimo = false;
				break;
			}

		}

		if (esPrimo && num > 1) {
			System.out.println(num + " es un número primo.");

		} else {

			System.out.println(num + " es un número compuesto.");
		}
		entrada.close();
	}

}