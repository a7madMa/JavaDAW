package ejercicios;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("**ADIVINA EL NÚMERO**");

		int randomNum = (int) (Math.random() * 10 + 1);
		int num;

		System.out.println(randomNum);

		System.out.println("Dime un número  y te diré si has acertado");

		for (int i = 1; i <= 3; i++) {
			System.out.println("Número: ");
			num = entrada.nextInt();

			if (randomNum == num) {

				System.out.println("HAS ACERTADO!");
				System.out.println("intentos usados = " + i);
				break;
			}
			if (i >= 3) {

				System.out.println("Fallste,El número era: " + randomNum);
			}
		}
		entrada.close();
	}

}
