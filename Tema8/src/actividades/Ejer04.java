package actividades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		String titulo;
		String encabezado;
		String contenido;

		final String NOMBRE_ARCHIVO_DESTINO = "ficheros/index.html";

		Scanner entrada = new Scanner(System.in);

		System.out.print("Título de la página: ");
		titulo = entrada.nextLine();

		System.out.print("Encabezado de la página: ");
		encabezado = entrada.nextLine();

		System.out.print("Contenido de la página: ");
		contenido = entrada.nextLine();

		try {
			BufferedWriter buferEscritura = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO_DESTINO));

			buferEscritura
					.write("<!DOCTYPE html>\n" + "<html lang=\"es\">\n" + "<head>\n" + "    <meta charset=\"UTF-8\">\n"
							+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
							+ "    <title>" + titulo + "</title>\n" + "</head>\n" + "<body>\n" + "    <h1>" + encabezado
							+ "</h1>\n" + "    <p>" + contenido + "</p>" + "\n</body></html>");

			buferEscritura.close();

			System.out.println("Se ha creado la página en tu carpeta personal. De nada.");
		} catch (IOException e) {
			System.out.println("Error de escritura.");
		}

	}

}