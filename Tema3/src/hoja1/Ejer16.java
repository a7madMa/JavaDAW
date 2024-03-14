package hoja1;

public class Ejer16 {

	public static void main(String[] args) {

		double[] temperaturas = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };
		double suma = 0;
		int masDoce = 0;
		System.out.println("La lista de temperaturas es la siguiente: ");

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(temperaturas[i]);

			suma = suma + temperaturas[i] / temperaturas.length;

			if (temperaturas[i] > 12) {
				masDoce++;

			}
		}

		System.out.println("\n La media de las temperaturas es: " + suma + " ºC");
		System.out.println("\nLa cantidad de temperaturas que ha habido por encima de 12ºC, ha sido de: " + masDoce + " Temperaturas");

	}

}
