package ejemplos;

import java.util.Scanner;

// Rellenar un array desde la terminal.
public class Ejemplo05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String [] nombres = new String[4];
		
		System.out.println("Ve introduciendo nombres: ");
		
		// Vamos leyendo cada nombre y guardándolo en la posición i del
		// Array nombres.
		for( int i =0; i< nombres.length; i++) {
			
			System.out.println("Nombre " + i + ": ");
			nombres[i] = entrada.nextLine();
		}
		// Mostramos la lista de nombres almacenador en el array.
		System.out.println("\n Tus nombres:");
		for ( int i = 0; i < nombres.length; i++) {
			
			System.out.println(nombres[i] + " ");
		}
	
		
		
	}

}
