package repasoExamen;

import java.io.File;
import java.util.Scanner;

public class RenombrarCarpetas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el nombre de la nueva carpeta: ");
		String nuevoNombre = entrada.nextLine();

		File rutaCarpetaOriginal = new File("ficheros/archivoOriginal");

		rutaCarpetaOriginal.renameTo(new File("ficheros/" + nuevoNombre));

		System.out.println("Cambiando el nombre...");

	}

}
