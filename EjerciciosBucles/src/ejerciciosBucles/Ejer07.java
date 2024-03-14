package ejerciciosBucles;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribiré los 50 números pares: ");

		int i = 0;
		int num =1;

		while (num <=50) {

			System.out.println(i);
			i = i+2;
			num++;
		}
	}

}
