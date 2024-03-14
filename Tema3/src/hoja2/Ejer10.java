package hoja2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Las temeperaturas de las ultimas 8 horas.");

		int posMin = 0;
		int posMax = 0;
		float aux;
		float temperaturas[] = new float[8];

		for (int i = 0; i < temperaturas.length; i++) {

			System.out.println("Temperatura:");
			temperaturas[i] = entrada.nextFloat();

		}
		System.out.println(Arrays.toString(temperaturas));

		for (int i = 0; i < temperaturas.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < temperaturas.length; j++) {

				if (temperaturas[j] < temperaturas[posMin]) {
					posMin = j;
				}

			}

			aux = temperaturas[i];
			temperaturas[i] = temperaturas[posMin];
			temperaturas[posMin] = aux;
			System.out.println(Arrays.toString(temperaturas));

			for (int j = 0; j < temperaturas.length; j++) {

				if (temperaturas[j] < temperaturas[posMin]) {
					posMin = j;

				} else if (temperaturas[j] > temperaturas[posMin]) {
					posMax = j;
				}

			}

		}
		System.out.println("\nLa temperatura mas alta ha sido de: " + temperaturas[posMax] + "°");
		System.out.println("\nLa temperatura mas baja ha sido de: " + temperaturas[posMin] + "°");

	}

}
