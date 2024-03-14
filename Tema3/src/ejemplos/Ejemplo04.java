package ejemplos;

public class Ejemplo04 {

	public static void main(String[] args) {

		// Otra forma de dar valores a los arrays.
		// Declaramos un array de Strings.

		String[] nombres = { "Ramón", "Agustín", "Margarita", "Tatiana", "Ahmad", "Juan" };
		System.out.println("Nombres de la primera fila: ");
		// Recorremos el array mediante un bucle.

		for (int i = 0; i < nombres.length; i++) {

			System.out.println(nombres[i] + "");

		}
	}

}
