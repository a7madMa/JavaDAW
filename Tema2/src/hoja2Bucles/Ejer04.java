package hoja2Bucles;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número entre el 1 y el 5");

		int num = entrada.nextInt();

		while (num != 3) {

			System.out.println("Dime otro número");
			num = entrada.nextInt();
		}

		System.out.println("Felicidades has acertado el numero: " + num);
	}

}
