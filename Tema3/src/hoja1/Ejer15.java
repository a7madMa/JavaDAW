package hoja1;

public class Ejer15 {

	public static void main(String[] args) {

		double[] temperaturas = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };
		double suma = 0;
		System.out.println("La lista de temperaturas es la siguiente: ");

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(temperaturas[i]);

			suma = suma + temperaturas[i] / temperaturas.length;

		}

		System.out.println("\n La media de las temperaturas es: " + suma + " ºC");

	}

}
