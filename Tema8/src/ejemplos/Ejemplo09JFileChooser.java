package ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Ejemplo09JFileChooser {

	public static void main(String[] args) {
		
		JFileChooser elegirArchivo = new JFileChooser();
		
		int eleccion = elegirArchivo.showOpenDialog(null);
		
		if(eleccion != JFileChooser.APPROVE_OPTION) {
			return;
		}
		
		File archivoElegido = elegirArchivo.getSelectedFile();
		
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(archivoElegido));
			
			// Iríamos leyendo el archivo...
			
			buffer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
   			e.printStackTrace();
		}
	}
	
}