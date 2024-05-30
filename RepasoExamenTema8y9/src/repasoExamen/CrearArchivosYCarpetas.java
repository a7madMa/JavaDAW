package repasoExamen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CrearArchivosYCarpetas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un nombre de archivo y te lo crearé en la carpeta de ficheros");

		String nombreArchivo = entrada.nextLine();

		try (FileWriter archivo = new FileWriter("ficheros/" + nombreArchivo)) {

		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("Dime un nombre de carpeta y te lo crearé en la carpeta ficheros");
		String nombreCarpeta = entrada.nextLine();

		File carpeta = new File("ficheros/" + nombreCarpeta);

		boolean resultado = carpeta.mkdir();

		if (resultado) {
			System.out.println("Generando carpeta...");
		} else {
			System.out.println("No se ha creado la carpeta.");
		}

	}

}
