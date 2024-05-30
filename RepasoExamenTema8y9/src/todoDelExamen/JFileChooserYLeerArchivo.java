package todoDelExamen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class JFileChooserYLeerArchivo {

	public static void main(String[] args) {

		JFileChooser elegirArchivo = new JFileChooser("ficheros");

		int eleccion = elegirArchivo.showOpenDialog(null);

		if (eleccion != JFileChooser.APPROVE_OPTION) {
			System.out.println("No se ha elegido ningun archivo");
			return;
		}

		File archivoOriginal = elegirArchivo.getSelectedFile();

		try (BufferedReader buffer = new BufferedReader(new FileReader(archivoOriginal))) {

			String linea = buffer.readLine();

			while (linea != null) {
				System.out.println(linea);
				linea = buffer.readLine();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println(archivoOriginal.toString());

	}

}
