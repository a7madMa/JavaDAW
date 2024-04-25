package actividades;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejer03 {

	public static void main(String[] args) {

		final String NOMBRE_ARCHIVO = "ficheros/contactos.txt";

		try {
			BufferedReader buffer = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));

			String linea = buffer.readLine();

			while (linea != null) {

				String[] textoSeparado = linea.split(",");

				System.out.println("Apellidos:" + textoSeparado[0]);
				System.out.println("Nombre:" + textoSeparado[1]);
				System.out.println("Teléfono:" + textoSeparado[2] + "\n\n------\n");

				linea = buffer.readLine();

			}

			buffer.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");
		} catch (IOException e) {
			System.out.println("Error de entrada-salida.");
		}

	}

}
