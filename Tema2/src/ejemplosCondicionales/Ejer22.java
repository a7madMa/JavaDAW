package ejemplosCondicionales;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {
		System.out.println("Dime un número entero :");
		Scanner entrada = new Scanner(System.in);
		int num = 0;

		if (entrada.hasNextInt()) {

			num = entrada.nextInt();

			if (num >= 1 && num <= 10) {
				System.out.println("El número introducido és: " + num);

			}
			if (num == 3) {
				System.out.println("Has acertado el número");

			}

		} else {
			System.out.println("No has escrito un número");
			System.exit(0);
		}

	}

}
	