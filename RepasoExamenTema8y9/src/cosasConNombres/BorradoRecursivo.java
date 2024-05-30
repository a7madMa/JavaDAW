package cosasConNombres;

import java.io.File;

public class BorradoRecursivo {

	public static void main(String[] args) {
		borrar(new File("daw"));
	}

	private static void borrar(File file) {

		// Caso recursivo: file es una carpeta, luego voy llamando al
		// método borrar() pasándole cada archivo o carpeta que contenga.
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				System.out.println("Entrando en " + f.toString());
				borrar(f);
			}

		}

		// Caso base: file es un archivo o una carpeta vacía y,
		// por tanto, puedo borrarlo con el método delete() de File.
		System.out.println("Borrando " + file.toString());
		file.delete();

	}

}