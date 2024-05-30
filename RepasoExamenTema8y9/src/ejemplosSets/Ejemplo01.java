package ejemplosSets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejemplo01 {

	// Aplicacion que vaya pidiendo nombres y los guarde pero sin guardar nombres
	// repetidos
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Set<String> nombres = new HashSet<>();

		// Vamos leyendo nombres de la terminal y guardandolos en el conjunto.

		String nombre;

		do {
			System.out.println("Introduce un nombre: ");
			nombre = entrada.nextLine();

			if (!nombre.equals(" ")) {
				nombres.add(nombre);
			}
			System.out.println("Hay " + nombres.size() + " nombres guardados en el conjunto.");

		} while (!nombre.equals(""));

		mostrar(nombres);

		// Eliminamos el nombre "Pedro".
		nombres.remove("Pedro");
		mostrar(nombres);

		// Borramos todo el contenido.
		nombres.clear();
		mostrar(nombres);

	}

	private static void mostrar(Set<String> nombres) {

		if (nombres.isEmpty()) {
			System.out.println("\nEl conjunto de nombres está vacío");
			return;
		}

		System.out.println("\nNombres almacenados:");
		for (String palabra : nombres) {
			System.out.println(" * " + palabra);
		}

	}

}
