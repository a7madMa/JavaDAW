package Practica1;

import java.util.Scanner;

public class Practica2 {

	// 2.- Crea un programa que lea una palabra del usuario y la escriba cinco veces
	// en la pantalla. A continuación volverá a pedir una palabra al usuario y
	// mostrarla cinco veces. Y así mientras el usuario no escriba la palabra
	// "STOP".

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String palabra;

		do {
			System.out.println("Escribe una palabara: ");
			palabra = entrada.nextLine();

			for (int i = 1; i <= 5; i++) {

				System.out.println(palabra);
			}

		} while (!"STOP".equals(palabra.toUpperCase()));

	}

}
