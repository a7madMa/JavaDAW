package consola;

import java.util.Scanner;

public class Consola {

	private Scanner entrada = new Scanner(System.in);

	public int leerInt(String mensajeError) {

		while (true) {
			if (entrada.hasNextInt()) {
				int numero = entrada.nextInt();
				entrada.nextLine();
				return numero;
			} else {
				System.out.println(mensajeError);
				entrada.nextLine();
			}
		}

	}

	public int leerInt() {
		return leerInt("Entrada incorrecta: se esperaba un número entero.");

	}

}
