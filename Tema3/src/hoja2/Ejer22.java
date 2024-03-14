package hoja2;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String[][] datos = new String[3][4];

		double media = 0;

		System.out.println("\nIntroducción de notas");
		System.out.println("=============================================");

		// Creamos un bucle para que pregunte el nombre y
		// las correspondientes notas de los alumnos
		for (int fila = 0; fila < datos.length; fila++) {

			System.out.print("\nNombre: ");
			datos[fila][0] = entrada.nextLine();
			System.out.print("Exámenes: ");
			datos[fila][1] = entrada.nextLine();
			System.out.print("Trabajos: ");
			datos[fila][2] = entrada.nextLine();
			System.out.print("Actitud: ");
			datos[fila][3] = entrada.nextLine();

		}

		// Mostramos la tabla.

		System.out.println("\nNota de evaluación");
		System.out.println("============================");

		for (int fila = 0; fila < datos.length; fila++) {

			// Calculamos la media a partir de la formula proporcionada.
			media = (50 * Double.parseDouble(datos[fila][1]) + 40 * Double.parseDouble(datos[fila][2])
					+ 10 * Double.parseDouble(datos[fila][3])) / 100;

			// Mostramos las medias con los correspondientes nombres
			System.out.println(datos[fila][0] + ":" + media);
		}

		entrada.close();
	}

}