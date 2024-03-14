package practicaExamenTema3;

public class OrdenarBidimensional {

	public static void main(String[] args) {

		// Tabla con las distintas variedades de naranaja y el peso de fruta
		// que produce
		// un árbol en una temporada.

		int posMin = 0;
		int posMax = 0;
		String[][] produccion = { { "Navel Lane Late", "8.5" }, { "Navelina", "4" }, { "Washington Navel", "6.7" },
				{ "Thomson", "4.9" }, { "Newhall", "10.1" }, { "Navelate", "6.3" }, { "Ricalate", "5.5" } };

		// Mostrar la tabla.
		System.out.println("Información sobre la producción de naranjas, en kg, de cada variedad de naranja:");

		System.out.printf("\n%-18s %4s\n", "Variedad", "Peso");
		System.out.printf("%-18s %4s\n", "===============", "====");

		for (int fila = 0; fila < produccion.length; fila++) {
			System.out.printf("%-18s %-4s\n", produccion[fila][0], produccion[fila][1]);

		}
		
		
		// Calcular la media.
		float media = 0;
		for (int fila = 0; fila < produccion.length; fila++) {
			media = media + Float.parseFloat(produccion[fila][1]);
			
		}
		
		media = media / produccion.length;
		
		for (int fila = 0; fila < produccion.length; fila++) {
			if (Float.parseFloat(produccion[fila][1]) < Float.parseFloat(produccion[posMin][1])) {

				posMin = fila;

			} else if (Float.parseFloat(produccion[fila][1]) > Float.parseFloat(produccion[posMax][1])) {
				posMax = fila;
			}

		}
		
		System.out.println("Variedad que mas produce: " + produccion[posMax][0] +"(" +produccion[posMax][1] + " kg).");
		
		System.out.println("Variedad que menos produce " + produccion[posMin][0] + "(" + produccion[posMin][1] + "kg).");
		
		System.out.println("Promedio producido por un naranjo: " +(Math.round(media *100)/100.0 ) +" kg.");

	}

}
