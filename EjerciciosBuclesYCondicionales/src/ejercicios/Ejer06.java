package ejercicios;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un numero y te dire su tabla de multiplicar.");

		int num;

		do {
			System.out.println("Dime un numero:");
			num = entrada.nextInt();
			if (num == 1) {

				System.out.println("No seas tonto");
				continue;
			}
			for (int i = 1; i <= 10; i++) {

				System.out.println(num + "X " + i + "= " + (num * i));

			}

		} while (num != 0);

		if (num == 0) {
			System.out.println(num + "X " + 0 + "= " + (num * 0));

		}

	}

}