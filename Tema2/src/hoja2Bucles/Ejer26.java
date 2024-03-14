package hoja2Bucles;

import java.util.Scanner;

public class Ejer26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Tablas de multiplicar.");
		int num;

		// Usamos este for para contar los 5 intentos.
		for (int i = 1; i <= 5; i++) {

			System.out.println("Escribe un número: ");
			num = entrada.nextInt();
			// Si el número introducido es igual a 1, el programa nos dirá
			// "¡No seas tonto!"
			if (num == 1) {

				System.out.println("¡No seas tonto!");

				continue;

			}
			System.out.println("Tabla de multiplicar del " + num + "x");
			// Usamos este otro for para hacer la multiplicación
			for (int j = 0; j <= 10; j++) {

				System.out.println(num + "x" + j + "=" + num * j);

			}

		}
		entrada.close();
	}

}
