package ejemplosListas;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo01 {

	public static void main(String[] args) {

		List<String> idiomas = new ArrayList<>();

		idiomas.add("Esperanto");
		idiomas.add("Arameo");
		idiomas.add(1, "Español");

		System.out.println("En la posición 0 está el " + idiomas.get(0));
		System.out.println("En la posición 1 está el " + idiomas.get(1));

		mostrarLista(idiomas);

		System.out.println("\nEliminamos el español, que está en la posición 1:");
		String borrado = idiomas.remove(1);
		System.out.println("Se ha borrado el idioma " + borrado + ".");

		mostrarLista(idiomas);

		// Eliminamos el Arameo. Esto funciona porque la clase String ya tiene un método
		// equals() sobreescrito.
		System.out.println("\nEliminamos el arameo, directamente:");
		boolean resultado = idiomas.remove("Arameo");
		System.out.println("Resultado de borrar Arameo: " + resultado);

		mostrarLista(idiomas);

		System.out.println("\nSustituímos Esperanto por Italiano:");
		borrado = idiomas.set(0, "Italiano");
		System.out.println("Se ha borrado " + borrado + ".");

		mostrarLista(idiomas);

		System.out.println("\nAñadimos algunos idiomas más...");
		idiomas.add("Francés");
		idiomas.add("Inglés");
		idiomas.add("Portugués");
		idiomas.add("Catalán");

		mostrarLista(idiomas);

		System.out.println("\nBuscamos el idioma inglés:");
		boolean existe = idiomas.contains("Inglés");
		System.out.println("¿Existe Inglés? " + existe);

		System.out.println("\nBuscamos el idioma inglés, usando indexOf:");
		int pos = idiomas.indexOf("Inglés");
		System.out.println("Posición del inglés: " + pos);

		idiomas.add("Francés");
		mostrarLista(idiomas);

		System.out.println("\nBuscamos el idioma francés, usando lastIndexOf:");
		pos = idiomas.lastIndexOf("Francés");
		System.out.println("Posición del francés: " + pos);

		System.out.println("\n¿Está vacío nuestro ArrayList? " + idiomas.isEmpty());

		System.out.println("\nHasta ahora tenemos " + idiomas.size() 
			+ " idiomas guardados en el ArrayList.");
		
		System.out.println("\nBorramos la lista completa.");
		idiomas.clear();
		System.out.println("\nHasta ahora tenemos " + idiomas.size() 
			+ " idiomas guardados en el ArrayList.");

	}

	private static void mostrarLista(List<String> lista) {

		System.out.println("\nRecorremos la lista:");

//		for(int i = 0; i < idiomas.size(); i++) {
//			System.out.println("En la posición " + i + " está el " + idiomas.get(i));
//		}

		// for-each o for mejorado
		for (String idioma : lista) {
			System.out.println("  - " + idioma);
		}
	}

}
