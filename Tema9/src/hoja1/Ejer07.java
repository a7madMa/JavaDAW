package hoja1;

public class Ejer07 {

	public static void main(String[] args) {

		System.out.println(invertir(456));

	}

	private static String invertir(int n) {

		// Caso base.
		if (n == 0) {
			return "";

		}

		// Caso recusrivo
		String resultado = "" + (n % 10); // Conseguimos el último número.

		return resultado + invertir(n / 10);

	}

}
