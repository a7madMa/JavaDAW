package hoja2Bucles;

import java.util.Scanner;

public class Ejer25 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("*** CONCURSO ***");
		int num = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.println("Dime el número secreto");
			num = entrada.nextInt();

			if (num == 6) {

				System.out.println("Felicidades");

				break;
			}

		}
		if (num != 6) {
			System.out.println("Has perdido");
		}
	}
}
