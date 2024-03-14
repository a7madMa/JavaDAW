package practicaCadenas;

import java.util.Scanner;

public class Ejer02 {

	static Scanner entrada = new Scanner(System.in);
	static String nombreCompleto;
	
	public static void main(String[] args) {

		System.out.println("*** Separador de nombre y extensión de archivos ***");

		System.out.println("\nEscribe un nombre de archivo con su extensión: ");
		System.out.print("\nNombre: ");
		nombreCompleto = entrada.nextLine();
		
		
		
		


	}
	
	static String nombreArchivo(String NombreCompleto) {
		
		String nombreSeparado[] = nombreCompleto.split("\\.");
		return nombreSeparado[0];
		
	}
	
	

}
