package tema8Archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Hoja1Ejer02 {

	public static void main(String[] args) {

		final String RUTA_ARCHIVO = "ficheros/contactos.txt";

		Scanner entrada = new Scanner(System.in);

		String nombre;
		String apellidos;
		String telefono;
		String linea = "";

		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO, true));

			for (int i = 0; i < 3; i++) {
				System.out.println("Introduce un nombre: ");
				nombre = entrada.nextLine();

				System.out.println("Introduce un apellido: ");
				apellidos = entrada.nextLine();

				System.out.println("Introduce un telefono: ");
				telefono = entrada.nextLine();

				buffer.write(apellidos + "," + nombre + "," + telefono);
				buffer.newLine();

			}
			buffer.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

		}
	}
}
