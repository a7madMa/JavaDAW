package todoDelExamen;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import repasoExamen.JFileChooseryRenombrarArchivos;

public class EjemploSets {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Set<String> nombres = new HashSet<>();

		// Vamos leyendo nombres de la terminal y guardándolos en el conjunto

		String nombre = "";

		do {
			System.out.println("Introduce nombres y para acabar pulsa enter");
			nombre = entrada.nextLine();

			if (!nombre.equals("")) {
				nombres.add(nombre);
			}
			System.out.println("Hay " + nombres.size() + " nombres guardados");

		} while (!nombre.equals(""));

		mostrar(nombres);

		// Eliminamos el nombre "Pedro".
		nombres.remove("Pedro");
		mostrar(nombres);

//		// Borramos todo el contenido.
//		nombres.clear();
//		mostrar(nombres);

	}

	// Recorremos el set y mostramos sus valores.
	private static void mostrar(Set<String> nombres) {

		if (nombres.isEmpty()) {
			System.out.println("\nEl conjunto de nombres esta vacio");
			return;
		}

		System.out.println("\nNombres almacenados:");
		for (String palabra : nombres) {
			System.out.println(" - " + palabra);
		}

	}
}