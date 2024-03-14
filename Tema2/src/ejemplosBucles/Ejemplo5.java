package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {

		// Este programa pedirá una serie de precios al usuario.
		// Cuando el usuario escriba un cero, el programa parará.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Dima una serie de preciosg ");

		// Le damos un valor incial a "precio" que haga que la
		// Condición del bucle seas verdadera.

		float precio = 1;

		// Mientras precio sea un número positivo, las instrucciones
		// dentro del while se van a ejecutar.
		while (precio > 0) {

			System.out.print("Precio: ");

			precio = entrada.nextFloat();

		}
		entrada.close();
	}

}
