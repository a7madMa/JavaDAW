package hoja1;

public class Ejer13 {

	public static void main(String[] args) {

		double potencias[] = new double[20];

		System.out.println("Primeras 20 potencias de 2");

		for (int i = 0; i < potencias.length; i++) {

			potencias[i] = Math.pow(2, i + 1);

			System.out.println(i);
			System.out.println(potencias[i]);

		}

	}

}
