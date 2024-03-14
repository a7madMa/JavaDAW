package hoja2Bucles;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Escribe un número entero");
			num = entrada.nextInt();

		}
		System.out.println("Has Fallado");

		entrada.close();
	}

}
