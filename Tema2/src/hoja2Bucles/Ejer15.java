package hoja2Bucles;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Lista de potencias de 3 menores que 12000: ");

		int exp = 0;
		int potencia = 1;

		do {

			System.out.println(exp + "\t" + potencia);
			exp++;
			potencia = potencia * 3;

		} while (potencia < 12000);

	}

}
