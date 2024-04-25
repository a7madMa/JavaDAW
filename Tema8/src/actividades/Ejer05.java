package actividades;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numPalabras = 0;

		System.out.print("Escribe el nombre del archivo: ");
		String nombreArchivo = entrada.nextLine();

		System.out.print("Escribe una palabra: ");
		String palabra = entrada.nextLine();

		try {

			FileReader archivo = new FileReader("ficheros/" + nombreArchivo);
			BufferedReader bufferLectura = new BufferedReader(archivo);

			String linea = bufferLectura.readLine();

			while (linea != null) {

				if (linea.indexOf(palabra) != -1) {
					numPalabras++;
				}

				linea = bufferLectura.readLine();

			}

			bufferLectura.close();

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no localizado.");
		} catch (IOException e) {
			System.out.println("Error de entrada y salida.");
		}

		System.out.println(palabra + " aparece en " + numPalabras + " líneas.");

	}

}