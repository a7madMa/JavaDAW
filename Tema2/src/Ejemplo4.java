
// Programa que pida dos numeros enteros y nos devuelva
// la suma.

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0, num1 = 0;

		System.out.println("Escribe el primer número");

		if (entrada.hasNextInt()) {
			num = entrada.nextInt();

		} else {
			System.out.println(" Eres bobo");
			System.exit(0);

		}
		System.out.println("Escribe el segundo número");

		if (entrada.hasNextInt()) {
			num1 = entrada.nextInt();

		} else {
			System.out.println(" Eres bobo");
			System.exit(0);
		}
		System.out.println("El resultado de la suma és:" + (num + num1));
	}
}
