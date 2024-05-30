package todoDelExamen;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CrearArchivo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el nombre del archivo y te lo creo");

		String nombreArchivo = entrada.nextLine();

		try (FileWriter archivo = new FileWriter("ficheros/" + nombreArchivo)) { // Hacemos un fileWriter para crear un
																					// archivo.
			System.out.println("Creando archivo...");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
