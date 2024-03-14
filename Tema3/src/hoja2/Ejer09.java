package hoja2;

import java.util.Arrays;

public class Ejer09 {

	public static void main(String[] args) throws InterruptedException {

		int precios[] = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };

		System.out.println(Arrays.toString(precios));

		int posMin;
		int aux;

		for (int i = 0; i < precios.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < precios.length; j++) {

				if (precios[j] < precios[posMin]) {
					posMin = j;

				}

			}

			// Intercambiar las posiciones i y posMin.
			aux = precios[i];
			precios[i] = precios[posMin];
			precios[posMin] = aux;

			Thread.sleep(1000);

			System.out.println(Arrays.toString(precios));
		}
	}

}
