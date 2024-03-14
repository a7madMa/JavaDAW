package hoja2;

// Ordenamos el array de mayor a menor.
import java.util.Arrays;

public class Ejer9b {

	public static void main(String[] args) throws InterruptedException {

		int precios[] = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };

		System.out.println(Arrays.toString(precios));

		int posMax;
		int aux;

		for (int i = 0; i < precios.length - 1; i++) {

			posMax = i;

			for (int j = i + 1; j < precios.length; j++) {

				// Si cambiamos el < del if de abajo por un > lo que hará es ordenar de mayor a menor
				// En vez de menor a mayor.
				
				if (precios[j] > precios[posMax]) {
					posMax = j;

				}

			}

			// Intercambiar las posiciones i y posMin.
			aux = precios[i];
			precios[i] = precios[posMax];
			precios[posMax] = aux;

			Thread.sleep(1000);

			System.out.println(Arrays.toString(precios));
		}
	}

}
