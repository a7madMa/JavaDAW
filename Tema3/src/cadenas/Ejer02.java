package cadenas;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(
				"Dime una contraseña y te diré si cumple con la longitud mínima de 6 caracteres y 12 como máximo");

		System.out.println("Contraseña: ");
		String contra = entrada.nextLine();

		int longitud = contra.length();

		if (longitud <= 6) {

			System.out.println("Contraseña INCORRECTA");
			System.out.println("La longitud mínima de la contraseña es 6 caracteres");
		} else if (longitud >= 12) {

			System.out.println("Contraseña INCORRECTA");
			System.out.println("La longitud máxima de la contraseña es 12 caracteres");

		} else {
			System.out.println("Accediendo al sistema....");
			System.out.println("La contraseña tiene: " + longitud +"Caracteres");
		}

		entrada.close();
	}

}
