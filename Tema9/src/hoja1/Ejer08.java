package hoja1;

public class Ejer08 {

	public static void main(String[] args) {
		System.out.println(sumar(456));

	}

	private static int sumar(int n) {

		if (n == 0) {
			// Caso base
			return n;
		}

		// Caso Recursivo
		int suma = (n % 10);

		return suma + sumar(n / 10);

	}

}
