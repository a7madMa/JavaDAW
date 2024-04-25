package actividades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		final String RUTA_ARCHIVO = "ficheros/contactos.txt";

		Scanner sc = new Scanner(System.in);

		String nombre;
		String apellidos;
		String telf;

		try {
			// Abrimos el archivo para escritura
			FileWriter archivo = new FileWriter(RUTA_ARCHIVO, true);

			// Le asociamos un buffer en memoria para mejorar el rendimiento.
			BufferedWriter buffer = new BufferedWriter(archivo);

			for (int i = 0; i < 3; i++) {

				System.out.println("Nombre:");
				nombre = sc.nextLine();

				System.out.println("Apellidos:");
				apellidos = sc.nextLine();

				System.out.println("Teléfono:");
				telf = sc.nextLine();

				buffer.write(apellidos + "," + nombre + "," + telf + "\n");

			}

			// Cerramos el buffer.
			buffer.close();

		} catch (IOException e) {
			System.out.println("Error de escritura en disco.");
		}

	}

}