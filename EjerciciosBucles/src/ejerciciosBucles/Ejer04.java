package ejerciciosBucles;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Di un número del 1 al 5: ");
		int num =0;

		while (num != 3) {

			System.out.println("Introduce un número");
			num = entrada.nextInt();

		}

		System.out.println("Felicidades!!! HAS ACERTADO");
	}

}
