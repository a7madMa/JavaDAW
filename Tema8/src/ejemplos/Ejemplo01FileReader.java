package ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo01FileReader {

	public static void main(String[] args) {

		try {
			// Creamos un FileReader para acceder al archivo.
			FileReader archivo = new FileReader("ficheros/nombres.txt");

			// Creamos un BufferedReader para acceder al archivo usando un buffer (más
			// eficiente).
			BufferedReader buffer = new BufferedReader(archivo);

			// Leemos el archivo línea a línea.
			String linea = buffer.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = buffer.readLine();
			}

			System.out.println("Fin de la lectura.");

			// Cerramos el buffer de entrada.
			buffer.close();

		} catch (FileNotFoundException e) {
			System.out.println("Error: no se ha encontrado el archivo.");
		} catch (IOException e) {
			System.out.println("Se ha producido un error de entrada/salida.");
		}

	}

}
