package hoja1;

public class Ejer09 {

	public static void main(String[] args) {
		int[] lista = { 1, 2, 3 };
		int n = lista.length;
		System.out.println("La suma de los elementos es: " + sumar(lista, n));
	}

	public static int sumar(int[] lista, int n) {

		// Caso base: si n es 1, devuelve el primer elemento del array
		if (n == 1) {
			return lista[0];
		}

		// Caso recursivo: suma el último elemento del array y el resultado de la
		// llamada recursiva con n - 1
		return lista[n - 1] + sumar(lista, n - 1);

	}
}
