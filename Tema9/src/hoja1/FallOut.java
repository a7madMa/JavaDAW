package hoja1;

import java.util.ArrayList;
import java.util.List;

public class FallOut {

	public static void main(String[] args) {

		List<String> actores = new ArrayList<>();

		// Método add.

		actores.add("Ella Purnell");
		actores.add(1, "Walton Goggins");

		System.out.println("En la posición 0 está el " + actores.get(0));
		System.out.println("En la posición 1 está el " + actores.get(1));

		mostrarLista(actores);

		// Eliminamos un actor de la lista

		actores.remove(1);
		mostrarLista(actores);

		// Añadimos el actos para borralo
		actores.add(1, "Walton Goggins");
		mostrarLista(actores);
		// Borramos con usando el metodo equals() ya integrado.
		actores.remove("Walton Goggins");
		mostrarLista(actores);

		// Sustitución de posiciones
		actores.add(1, "Walton Goggins");
		actores.add("Moisés Arias");
		actores.add("Aaron Moten");
		actores.add("Kyle MacLachlan");
		String borrado = actores.set(1, " Kyle MacLachlan");
		System.out.println("Se ha borrado " + borrado + ".");

		// Buscar dentro del ArrayList

		System.out.println("\nBuscamos el actor Walton Goggins:");
		actores.add("Walton Goggins");
		boolean existe = actores.contains("Walton Goggins");
		System.out.println("¿Existe Walton Goggins? " + existe);

		// Buscamos con indexof
		actores.remove(4);

		mostrarLista(actores);
		System.out.println("\nBuscamos el actor Aaron Moten , usando indexOf:");
		int pos = actores.indexOf("Aaron Moten");
		System.out.println("Posición de Aaron Moten: " + pos);

		// Usamos lastIndexOf

		actores.add("Ella Purnell");
		mostrarLista(actores);
		System.out.println("\nBuscamos el actor Moisés Arias , usando lastIndexOf:");
		pos = actores.lastIndexOf("Ella Purnell");
		System.out.println("Posición Moisés Arias : " + pos);

		// Comprobar si un array esta vacio
		System.out.println("\n¿Está vacío nuestro ArrayList? " + actores.isEmpty());

		System.out.println("\nHasta ahora tenemos " + actores.size() + " actores guardados en el ArrayList.");

		System.out.println("\nBorramos la lista completa de actores.");
		actores.clear();
		System.out.println("\nHasta ahora tenemos " + actores.size() + " actores guardados en el ArrayList.");
	}

	private static void mostrarLista(List<String> lista) {

		System.out.println("\nRecorremos la lista:");

		// for-each o for mejorado
		for (String idioma : lista) {
			System.out.println("  - " + idioma);
		}
	}

}
