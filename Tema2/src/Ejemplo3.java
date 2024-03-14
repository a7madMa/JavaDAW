

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Qué temperatura hace?");

		if (entrada.hasNextFloat()) {

			float num = entrada.nextFloat();
			System.out.println("La temperatura és de: " + num + " grados.");

			if (num < 15) {

				System.out.println("Hace Fresquito");

			} else if (num >= 15 && num < 25) {

				System.out.println("Hace buen tiempo");
			} else if (num >= 25) {
				System.out.println("Hace Calor");

			}

		} else {
			System.out.println("Lo siento, Eres torpe!");
		}
	}
}

