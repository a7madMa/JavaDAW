package cadenas;

import java.util.Arrays;

public class Ejer14 {

	public static void main(String[] args) throws InterruptedException {

		String mascotas[] = { "gato", "perro", "hamster", "tortuga", "agapornis" };

		int posMin;
		String aux;
		System.out.println("***********************");
		System.out.println(" Ordenando Array...");
		System.out.println("***********************");
		for (int i = 0; i < mascotas.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < mascotas.length; j++) {

				if (mascotas[j].compareTo(mascotas[posMin]) < 0) {

					posMin = j;

				}

			}

			aux = mascotas[i];
			mascotas[i] = mascotas[posMin];
			mascotas[posMin] = aux;

			Thread.sleep(650);
			System.out.println(Arrays.toString(mascotas));

		}

	}

}
