package hoja1;

// Programa que muestre en pantalla los 100 primeros números primos

public class EjerPrimos3 {

	public static void main(String[] args) {

		int numPrimos = 0;
		boolean Esprimo;

		int i = 2;
		while (numPrimos < 100) {

			Esprimo = true;

			for (int j = 2; j <= i / 2; j++) {

				if (i % j == 0) {

					Esprimo = false;

					break;

				}

			}

			if (Esprimo) {

				System.out.println((numPrimos + 1) + ")" + i);
				numPrimos++;

			}
			i++;

		}

	}

}
