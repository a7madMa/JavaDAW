package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {

		// Mostratemos nuestro nombre tantas veces como indique el usuario

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuantas veces quieres que escribe tu nombre? ");
		int repeticiones = entrada.nextInt();

		int i = 1;
		while (i <= repeticiones) {

			System.out.println("Ahmad");
			i++;
		}

		System.out.println("Viva el Nano");

	}

}
