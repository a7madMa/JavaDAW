package practicaExamenTema3;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenArray {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int posMin;
		int aux;
		int numeros[] = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Escribe 5 numeros y te los ordeno:");
			numeros[i] = entrada.nextInt();
		}

		for (int i = 0; i < numeros.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] < numeros[posMin]) {
					posMin = j;

				}

			}
			
			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;

		}
		
		System.out.println(Arrays.toString(numeros));

	}

}
