package todoDelExamen;

import java.io.File;
import java.util.Scanner;

public class CrearCarpeta {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el nombre de la carpeta:");

		String nombreCarpeta = entrada.nextLine();

		File carpeta = new File("ficheros/" + nombreCarpeta); // Hay que crear un file para que cree la carpeta y dentro
																// del file ponemos la ruta donde queremos que se crea y
																// el nombre que hemos pedido

		boolean resultado = carpeta.mkdir(); // Creamos la carpeta con .mkdir()

		if (resultado) { // Comprobamos si se ha podido crear o no
			System.out.println("OK");
		} else {
			System.out.println("No se ha podido crear la carpeta");
		}

	}

}
