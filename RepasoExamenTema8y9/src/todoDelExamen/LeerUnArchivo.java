package todoDelExamen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerUnArchivo {

	public static void main(String[] args) {

		try (BufferedReader buffer = new BufferedReader(new FileReader("ficheros/contactos.txt"))) {

			// Para leer la primera linea:
			// String linea = buffer.readLine();
			// System.out.println(linea);

			// Para leer el archivo linea a linea:

			String linea = buffer.readLine(); // Leemos una linea podria ser el titulo
			while (linea != null) { // Si el archivo no esta vacio imprimimos y seguimos leyendo
				System.err.println(linea);
				linea = buffer.readLine();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
