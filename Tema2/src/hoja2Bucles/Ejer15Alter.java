package hoja2Bucles;

import java.util.Scanner;

public class Ejer15Alter {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int exp = 0;
		int potencia = 1;

		do {

			System.out.println("3^ " + exp + " = " + potencia);

			exp++;
			potencia = (int) Math.pow(3, exp);

		} while (potencia < 12000);

	}

}
