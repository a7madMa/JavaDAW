package ejemplos;

public class Ejemplo14 {

	public static void main(String[] args) {

		String alturas[][] = {

				{ "Manuel", "1.90" }, { "Rosa", "1.70" }, { "María", "1.65" }, { "Jorge", "1.72" }

		};

		float suma = 0;
		// Recorremos las filas.
		for (int fila = 0; fila < alturas.length; fila++) {

			// Sumamos lo que haya en la columna 1 de la fila.

			suma = suma + Float.parseFloat(alturas[fila][1]);

		}

		System.out.println("Altura media" + suma / alturas.length);

	}

}
