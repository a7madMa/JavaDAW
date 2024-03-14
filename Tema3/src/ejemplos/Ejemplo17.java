package ejemplos;

import java.util.Iterator;

public class Ejemplo17 {

	public static void main(String[] args) {

		String[][] notas = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" }, { "Marcos Ramírez", "10" },
				{ "Juana Herranz", "4" }, { "Alberto López", "7" }

		};
		
	

		System.out.printf("%-20s %4s\n", "Nombres", "Notas");
		System.out.printf("%-20s %4s\n", "====================", "=====");

		for (int fila = 0; fila < notas.length; fila++) {
			System.out.printf("%-20s %4s\n", notas[fila][0], notas[fila][1]);

		}

	}

}