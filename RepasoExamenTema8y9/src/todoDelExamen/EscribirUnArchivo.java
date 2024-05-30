package todoDelExamen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirUnArchivo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String nombre;

		try (BufferedWriter buffer = new BufferedWriter(new FileWriter("ficheros/contactos.txt", true))) { // Si ponemos
																											// un true,
																											// es para
																											// que siga
																											// escribiendo
																											// abajo y
																											// no borre
																											// lo que ya
																											// habia

			System.out.println("Escribe un nombre  y pon listo para acabar");
			nombre = entrada.nextLine();

			while (!nombre.equals("listo")) {
				buffer.write(nombre + "\n");

				System.out.println("Escribe un nombre  y pon listo para acabar");
				nombre = entrada.nextLine();
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
