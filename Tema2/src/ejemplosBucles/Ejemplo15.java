package ejemplosBucles;

public class Ejemplo15 {

	public static void main(String[] args) {

		// Programa que muestre los números que sean múltiplos de 5 pero
		// no de 50, hasta el 200.

		int i = 0;

		while (i < 200) {

			i = i + 5;

			if(i %50 == 0) {
				// La instrucción continue hace que el bucle vuelva a empezar.
				continue;
			}
			System.out.println(i);

		}

	}

}
