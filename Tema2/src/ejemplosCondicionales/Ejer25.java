package ejemplosCondicionales;

import java.util.Scanner;

public class Ejer25 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime tu nombre: ");
		String nombre = entrada.nextLine();

		String nomb = new String();
		String condicion;

		condicion = (nombre.equals("")) ? "desconocido" : nombre;

		System.out.println("El nombre introducido es: " + condicion);

	}

}
