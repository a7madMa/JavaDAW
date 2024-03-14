package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double consumo[] = new double[6];
		int posMin = 0;
		double aux;
		double mediana = 0;

		System.out.println("#### GASTO EN ELECTRICIDAD ####");
		System.out.println("\nEscribe lo que has consumido en electricidad (KWh) en los últimos días: ");

		// Hacemos un bucle para que pregunte el gasto.
		for (int i = 0; i < consumo.length; i++) {
			System.out.println("Dia " + (i + 1) + ": ");
			consumo[i] = entrada.nextDouble();

		}
		// Ordenamos los datos que hemos solicitado de menor a mayor.
		for (int i = 0; i < consumo.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < consumo.length; j++) {

				if (consumo[j] < consumo[posMin]) {
					posMin = j;
				}

			}

			// Intercambiamos las variables
			aux = consumo[i];
			consumo[i] = consumo[posMin];
			consumo[posMin] = aux;

		}
		// Mostramos los consumos ordenados
		System.out.println("\nConsumos ordenados de menor a mayor:");
		for (int i = 0; i < consumo.length; i++) {
			System.out.print(consumo[i]);

			// Agregar un espacio después de cada elemento, excepto el último
			if (i < consumo.length - 1) {
				System.out.print(" ");
			}
		}
		// Para calcular la mediana usamos
		 // Si la longitud del array es par, toma el promedio de los dos valores centrales
		if (consumo.length % 2 == 0) {
			mediana = consumo[consumo.length / 2];
			mediana += consumo[consumo.length / 2 - 1];
			mediana /= 2;

		} else {
			 // Si la longitud del array es impar, toma el valor central
			mediana = consumo[consumo.length / 2];

		}
		// Mostramos el resultado.
		System.out.println();
		System.out.print("\nLa mediana de los consumos ha sido de " + mediana + " KWh");

	}

}
