package hoja2;

public class Ejer16 {

	public static void main(String[] args) {

		String[][] notas = {
				{ "Jose Luis Martínez", "7" },
				{ "Antonia Ruiz", "9" },
				{ "Marcos Ramírez", "10" },
				{ "Juana Herranz", "4" },
				{ "Alberto López", "7" },
		};
		
		System.out.println("Nombre\t\t\tNota");
		System.out.println("======\t\t\t====");

		for (int fila = 0; fila < notas.length; fila++) {

			System.out.println(notas[fila][0] + "\t\t" + notas[fila][1]);

		}

		float media = 0;

		for (int fila = 0; fila < notas.length; fila++) {
			media = media + Float.parseFloat(notas[fila][1]);
		}

		System.out.println("La media es: " + media / notas.length);

		// Buscamos la nota más baja (podríamos hacerlo dentro del for anterior.
		int posMin = 0;
		int posMax = 0;
		for (int fila = 1; fila < notas.length; fila++) {
			if (Integer.parseInt(notas[fila][1]) < Integer.parseInt(notas[posMin][1])) {

				posMin = fila;

			} else if (Integer.parseInt(notas[fila][1]) > Integer.parseInt(notas[posMin][1])) {

			}

		}
		System.out.println(notas[posMin][0] + " tiene la nota más baja, " + "un " + notas[posMin][1] + ".");
		System.out.println(notas[posMax][0] + " tiene la nota más alta, " + "un " + notas[posMax][1] + ".");
	}

}