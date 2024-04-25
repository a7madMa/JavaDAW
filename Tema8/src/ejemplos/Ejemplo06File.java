package ejemplos;

import java.io.File;

public class Ejemplo06File {

	public static void main(String[] args) {

		File archivoOriginal = new File("ficheros/contactos.txt");
		File archivoNuevo = new File("ficheros/contactosNuevo.txt");

		boolean resultado = archivoOriginal.renameTo(archivoNuevo);

		if (resultado) {
			System.out.println("Se ha renombrado el archivo.");
		} else {
			System.out.println("No se ha podido renombrar el archivo.");
		}

	}

}
