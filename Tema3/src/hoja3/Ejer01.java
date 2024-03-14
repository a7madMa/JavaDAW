package hoja3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer01 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		String libros[][] = new String[1][4];

		// Pedimos los datos
		for (int fila = 0; fila < libros.length; fila++) {
			System.out.println("ISBN:");
			libros[fila][0] = entrada.nextLine();

			System.out.println("Titulo:");
			libros[fila][1] = entrada.nextLine();

			System.out.println("Autor:");
			libros[fila][2] = entrada.nextLine();

			System.out.println("Editorial:");
			libros[fila][3] = entrada.nextLine();

		}

		System.out.println("Mostrando datos...");
		System.out.println("======================");

		for (int fila = 0; fila < libros.length; fila++) {

			System.out.print("Los datos son los siguentes:" + "\nISBN: " + libros[fila][0] + "\nTitulo: "
					+ libros[fila][1] + "\nAutor: " + libros[fila][2] + "\nEditorial: " + libros[fila][3]);

		}

	}

}
