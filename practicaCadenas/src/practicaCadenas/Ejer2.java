package practicaCadenas;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe la contraseña");
		String palabra = entrada.nextLine();

		int longitud = palabra.length();

		if (longitud >= 6 && longitud <= 12) {

			System.out.println("Contraseña correcta");

		} else {
			System.out.println("longitud mínima de 6 y\r\n" + "máxima de 12");
		}

	}

}
