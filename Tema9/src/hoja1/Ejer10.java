package hoja1;

public class Ejer10 {

	public static void main(String[] args) {
		int[] lista = { 2, 3 };
		int n = lista.length;
		System.out.println("La multiplicación de los elementos es: " + multiplicar(lista, n));

	}

	private static int multiplicar(int lista[], int n) {

		// Caso base:
		if (n == 1) {
			return lista[0];
		}

		// Caso recursivo: multiplica el último elemento del array y el resultado de la
		// llamada recursiva con n - 1

		return lista[n - 1] * multiplicar(lista, n - 1);
	}

}
