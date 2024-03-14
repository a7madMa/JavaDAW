package hoja2Bucles;

import java.util.Scanner;

public class Ejer18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Te mostraré todos los múltiplos de 3 menores que 500: ");

		for (int i = 3; i <= 500; i = i + 3) {

			System.out.println("Múltiplos de 3: " + i);

		}

	}

}
