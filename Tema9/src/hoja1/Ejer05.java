package hoja1;

public class Ejer05 {

	public static void main(String[] args) {
		System.out.println(numeEnteros(10));

	}

	private static int numeEnteros(int n) {

		if (n <= 1) {
			// Caso base.
			return n;
		} else {
			// Caso recursivo.
			return n + (numeEnteros(n - 1));
		}
	}

}
