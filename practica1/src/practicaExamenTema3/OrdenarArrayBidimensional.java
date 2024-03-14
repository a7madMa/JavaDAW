package practicaExamenTema3;

public class OrdenarArrayBidimensional {

	public static void main(String[] args) {

		String[][] sueldos = { { "Pepe", "1900" }, { "Juan", "1700" }, { "Laura", "1600" }, { "Paula", "1800" } };

		// Ordenaremos el array de menor a mayor sueldo (columna 1).
		int posMin;

		// En la variable aux almacenaremos una fila.
		String[] aux = new String[2];

		for (int i = 0; i < sueldos.length - 1; i++) {

			// Buscamos la fila con el sueldo más bajo entre la fila i
			// y el final.
			posMin = i;
			for (int j = i + 1; j < sueldos.length; j++) {
				if (Integer.parseInt(sueldos[j][1]) < Integer.parseInt(sueldos[posMin][1])) {
					posMin = j;
				}
			}

			// Intercambiamos la fila i con la fila posMin.
			aux = sueldos[posMin];
			sueldos[posMin] = sueldos[i];
			sueldos[i] = aux;

			// Mostramos cómo va quedando la tabla.
			for (int fila = 0; fila < sueldos.length; fila++) {
				System.out.println(sueldos[fila][0] + "\t" + sueldos[fila][1]);
			}
			System.out.println();

		}

	}

}
