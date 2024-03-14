package ejercicios;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("**ADIVINA EL NÚMERO**");

		int randomNum = (int) (Math.random() * 10 + 1);
		int num;
		int i = 0;
		boolean acertado = false;
		System.out.println(randomNum);

		System.out.println("Dime un número  y te diré si has acertado");

		while (i < 3 ) {
			System.out.println("Número: ");
			num = entrada.nextInt();

			if (randomNum == num) {

				System.out.println("HAS ACERTADO!");
				System.out.println("intentos usados = " + i);
				

				acertado = true;
				break;
			}
			i++;

			int puntos;
			if (i == 1) {
				puntos = 10;

			} else if (i == 2) {

				puntos = 5;

			} else if (i == 3) {
				puntos = 2;
			} else
				puntos = 0;

			System.out.println("La puntuación és: " + puntos + "puntos. ");
			

		}

		if (acertado == false) {

			System.out.println("Fallste,El número era: " + randomNum);
		}
			entrada.close();
		
	}

}