package hoja2Bucles;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime una carácter y lo escribiré 100 veces.");

		System.out.println("Cáracter: ");

		String caracter = entrada.nextLine();
		int i = 1;
		while (i <= 100) {
			System.out.println(+i + " " + caracter);
			i++;

		}

	}

}
