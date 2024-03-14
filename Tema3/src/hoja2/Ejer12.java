package hoja2;

import java.util.Arrays;

//12.- La siguiente tabla muestra los números atómicos de los elementos que forman una muestra de
//un material desconocido. Escribe un programa que los muestre ordenados de menor a mayor. Al
//final también indicará el número atómico menor y el mayor.

public class Ejer12 {

	public static void main(String[] args) {

		int num[] = { 8, 2, 10, 20, 12, 71, 15, 23 };
		int posMin = 0;
		int aux;

		for (int i = 0; i < num.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < num.length; j++) {

				if (num[j] < num[posMin]) {
					posMin = j;
				}

			}
			aux = num[i];
			num[i] = num[posMin];
			num[posMin] = aux;
			
			System.out.println(Arrays.toString(num));
			

		}
		System.out.println("\nEl numero atomico mas alto es: " + num[num.length-1] );
		System.out.println("\nEl numero atomico mas bajo es: " + num[0] );

	}

}
