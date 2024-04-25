package ejemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo07TransformarArchivo {

	public static void main(String[] args) {

		final String NOMBRE_ARCHIVO_ORIGINAL = "ficheros/nombres.txt";
		final String NOMBRE_ARCHIVO_TEMPORAL = "ficheros/nombres.tmp";

		System.out.println("Copiando el archivo...");

		try {
			// Abrir el archivo original para lectura.
			BufferedReader bufferLectura = new BufferedReader(new FileReader(NOMBRE_ARCHIVO_ORIGINAL));

			// Abrir el archivo temporal para escritura.
			BufferedWriter bufferEscritura = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO_TEMPORAL));

			// Bucle
			// - Leer una línea del original.
			String linea = bufferLectura.readLine();
			while (linea != null) {

				// Pasamos la línea a mayúsculas.
				linea = linea.toUpperCase();

				// Escribimos la línea en el archivo temporal.
				bufferEscritura.write(linea + "\n");

				// Leemos la siguiente línea del archivo.
				linea = bufferLectura.readLine();

			}

			// Cerramos los buffers.
			bufferLectura.close();
			bufferEscritura.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");
		} catch (IOException e) {
			System.out.println("Se ha producido un error de lectura/escritura.");
		}

		// Eliminamos el archivo original.
		System.out.println("Eliminando archivos temporales...");
		File archivoOriginal = new File(NOMBRE_ARCHIVO_ORIGINAL);
		archivoOriginal.delete();

		// Cambiar el nombre al temporal para que se llame como el original.
		File archivoTemporal = new File(NOMBRE_ARCHIVO_TEMPORAL);
		archivoTemporal.renameTo(archivoOriginal);

		System.out.println("Ok");
	}

}
