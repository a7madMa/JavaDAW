package ejemplos;

public class Ejemplo02 {

	public static void main(String[] args) {
		// Otra forma de dar valores a los arrays.
		// Declaramos un array de Strings.

		String[] nombres = { "Ramón", "Agustín", "Margarita", "Tatiana", "Ahmad", "Juan" };

		System.out.println("Primer nombre: " + nombres[0]);
		System.out.println("segundo nombre: " + nombres[1]);
		System.out.println("Último nombre: " + nombres[5]);

		nombres[0] = "Pepe";

	}

}
