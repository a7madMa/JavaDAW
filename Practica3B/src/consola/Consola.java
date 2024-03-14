package consola;

import java.util.Scanner;

public class Consola {
	private static Scanner entrada = new Scanner(System.in);

// Lee un número entero desde la terminal. Si lo que se introduce no es un
// entero, muestra el mensaje de error que se le ha pasado como parámetro.

	public static int leerInt(String mensajeError) {
		while (!entrada.hasNextInt()) {
			System.out.println(mensajeError);
			entrada.nextLine();
		}

		int num = entrada.nextInt();

		// Borramos el buffer de entrada para quitar el carácter de salto delínea u
		// otros que pudiera haber. Si no lo hacemos, y volvemos a llamar aeste método,
		// lo que ocurrirá es que se saltará alguna pregunta.

		entrada.nextLine();
		return num;
	}

	// Lee un número entero desde la terminal. Si lo que se introduce no es un
	// entero, muestra un mensaje de error estándar: "Entrada incorrecta: se
	// esperaba un número entero.".
	public static int leerInt() {

		return leerInt("Entrada incorrecta: se esperaba un número entero.");
	}

	public static double leerDouble(String mensajeError) {
		while (!entrada.hasNextDouble()) {
			System.out.println(mensajeError);
			entrada.nextLine();
		}

		double num = entrada.nextDouble();

		// Borramos el buffer de entrada para quitar el carácter de salto delínea u
		// otros que pudiera haber. Si no lo hacemos, y volvemos a llamar aeste método,
		// lo que ocurrirá es que se saltará alguna pregunta.

		entrada.nextLine();
		return num;

	}

	public static double leerDouble() {

		return leerDouble("Entrada incorrecta:se esperaba un número.");

	}

	public static String leerString() {
		while (!entrada.hasNext()) {
			System.out.println();
			entrada.nextLine();
		}
		String cadena = entrada.nextLine();

		return cadena;

	}
}
