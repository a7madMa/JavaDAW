package ejemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo04CarpetaPersonal {

	public static void main(String[] args) {

		final String NOMBRE_ARCHIVO = System.getProperty("user.home") + "/nombres.txt";

		Scanner entrada = new Scanner(System.in);
		String nombre;

		try {
			// Abrimos el archivo para escritura.
			FileWriter archivo = new FileWriter(NOMBRE_ARCHIVO);

			// Le asociamos un buffer en memoria para mejorar el rendimiento.
			BufferedWriter buffer = new BufferedWriter(archivo);

			System.out.println("Indica un nombre (escribe \"listo\" para acabar): ");
			nombre = entrada.nextLine();

			while (!nombre.equals("listo")) {

				// Escribimos en el archivo el nombre indicado.
				buffer.write(nombre + "\n");

				System.out.println("Indica un nombre (escribe \"listo\" para acabar): ");
				nombre = entrada.nextLine();

			}

			// Cerramos el buffer.
			buffer.close();

		} catch (IOException e) {
			System.out.println("Error de escritura en disco.");
		}

	}

}
