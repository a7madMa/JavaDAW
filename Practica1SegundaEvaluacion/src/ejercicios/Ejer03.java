package ejercicios;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final int ANCHO_LINEA = 80;

		System.out.println("#### CONSOLA ALTERNATIVA ####");
		System.out.print("\nEscribe un texto largo y te lo mostraré limitando la longitud de las líneas a 80 caracteres. ");

		// Solicitamos al usuario que ingrese un texto largo.
		System.out.println("\n\nTexto: ");
		String textoLargo = scanner.nextLine();

		// Dividir el texto en líneas con el ancho especificado.
		// Usamos el carácter \s que representa un espacio en blanco.
		// si ponemos \\s+ separamos la cadena anterior.

		String[] palabras = textoLargo.split("\\s+");

		String lineaActual = palabras[0];

		// Mostrar las líneas resultantes.
		System.out.println("\nTexto con líneas de " + ANCHO_LINEA + " caracteres:");
		System.out.println();
		for (int i = 1; i < palabras.length; i++) {
			if (lineaActual.length() + palabras[i].length() + 1 <= ANCHO_LINEA) {
				lineaActual += " " + palabras[i];
			} else {
				System.out.println(lineaActual);
				lineaActual = palabras[i];
			}
		}

		// Mostrar la última línea
		System.out.println(lineaActual);

		scanner.close();
	}
}