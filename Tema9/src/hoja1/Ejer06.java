package hoja1;

import java.util.Arrays;

public class Ejer06 {

	public static void main(String[] args) {

		int[] array = { 9, 5, 7, 3, 2, 8, 6 };
		int numElementos = array.length;
		int min = 100;
		min = busqueda(array, numElementos, min);

		System.out.println("El mínimo del array es: " + min);

	}

	private static int busqueda(int[] numeros, int numElementos, int min) {
		// Caso base: Si la longitud del array es 1, devuelve el único elemento
		if (numElementos == 0) {
			return min;
		}

		// Caso recursivo.
		if (numeros[--numElementos] < min) {
			min = numeros[numElementos];
		}
		return busqueda(numeros, numElementos, min);

	}
}
