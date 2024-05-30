package repasoExamen;

import java.io.File;

import javax.swing.JFileChooser;

public class JFileChooseryRenombrarArchivos {

	public static void main(String[] args) {

		JFileChooser elegirArcivo = new JFileChooser("ficheros");

		int eleccion = elegirArcivo.showOpenDialog(null);

		if (eleccion != JFileChooser.APPROVE_OPTION) {
			System.out.println("No se ha elegido un archivo");
			return;
		}

		File archivoOriginal = elegirArcivo.getSelectedFile();

		System.out.println(archivoOriginal.toString());

	}

}
