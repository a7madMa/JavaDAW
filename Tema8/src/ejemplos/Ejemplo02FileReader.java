package ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo02FileReader {

	public static void main(String[] args) {

		final String NOMBRE_ARCHIVO = "ficheros/mascotas";

		try {
			BufferedReader buffer = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));

			int numPerros = 0;

			String linea = buffer.readLine();
			while (linea != null) {
				System.out.println(linea);
				if (linea.equals("perro")) {
					numPerros++;
				}
				linea = buffer.readLine();
			}

			System.out.println("Hay " + numPerros + " personas cuya mascota preferida es el perro.");
			buffer.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");
		} catch (IOException e) {
			System.out.println("Error de entrada-salida.");
		}

	}

}
