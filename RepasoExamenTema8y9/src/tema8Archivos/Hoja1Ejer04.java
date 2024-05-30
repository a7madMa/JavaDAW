package tema8Archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Hoja1Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final String RUTA_ARCHIVO = "ficheros/index.html";

		String titulo;
		String encabezado;
		String contenido;

		System.out.println("Titulo:");
		titulo = entrada.nextLine();

		System.out.println("encabezado:");
		encabezado = entrada.nextLine();

		System.out.println("contenido:");
		contenido = entrada.nextLine();

		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO));

			buffer.write("<!DOCTYPE html>\n" + "<html lang=\"es\">\n" + "<head>\n" + "    <meta charset=\"UTF-8\">\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + "    <title>"
					+ titulo + "</title>\n" + "</head>\n" + "<body>\n" + "    <h1>" + encabezado + "</h1>\n" + "    <p>"
					+ contenido + "</p>" + "\n</body></html>");
			buffer.close();
			System.out.println("Se ha creado la pagina en tu carpeta personal. De nada.");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error de E/S", "Error", JOptionPane.ERROR_MESSAGE);

		}

	}

}
