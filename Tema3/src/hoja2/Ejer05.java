package hoja2;

public class Ejer05 {

	public static void main(String[] args) {

		double[] temperaturas = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		int posMin = 0, posMax = 0;

		for (int i = 0; i < temperaturas.length; i++) {

			if (temperaturas[i] < temperaturas[posMin]) {
				posMin = i;
			} else if (temperaturas[i] > temperaturas[posMax]) {
				posMax = i;
			}

		}

		System.out.println("La temperatura mínima fue de " + temperaturas[posMin]
				+ "ºC \ny se encuentra en la posición " + posMin + ".");

		System.out.println("La temperatura máxima fue de " + temperaturas[posMax]
				+ "ºC \ny se encuentra en la posición " + posMax + ".");

	}
}