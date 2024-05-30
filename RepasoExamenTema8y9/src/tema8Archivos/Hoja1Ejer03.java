package tema8Archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Hoja1Ejer03 {

	public static void main(String[] args) {

		final String RUTA_ARCHIVO = "ficheros/contactos.txt";

		try (BufferedReader buffer = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
			String linea = buffer.readLine();

			while (linea != null) {
				String[] textoSeparado = linea.split(",");

				if (textoSeparado.length >= 3) {
					System.out.println("Nombre: " + textoSeparado[0]);
					System.out.println("Apellidos: " + textoSeparado[1]);
					System.out.println("Teléfono: " + textoSeparado[2] + "\n\n-----\n");
				} else {
					System.out.println("Línea con formato incorrecto: " + linea);
				}

				linea = buffer.readLine(); // Leer la siguiente línea.
			}

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Archivo no encontrado: " + RUTA_ARCHIVO, "ERROR",
					JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error de E/S: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
}
