package hoja2Bucles;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un numero y te diré su tabla de multiplicar");
		int numero = entrada.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println("La tabla de multiplicar del " + numero + " és: " + numero * i);

		}

	}

}
