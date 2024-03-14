package hoja2;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double suma = 0;
		boolean preciosCorrectos = false;
		double productos[] = new double[10];

		for (int i = 0; i < productos.length; i++) {

			System.out.println("Dime un precio: ");
			productos[i] = entrada.nextDouble();

			if (productos[i] < 0) {
				System.out.println("Se ha encontrado un valor no válido en la posición" + i);
				break;
			} else {
				suma = suma + productos[i];
			}

			if (productos[i] >= 0) {
				preciosCorrectos = true;

			} else {
				preciosCorrectos = false;

			}

			if (preciosCorrectos) {
				System.out.println("La suma de los siguientes productos es de " + suma);

			}

		}
	}
}
