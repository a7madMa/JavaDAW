package practicaCadenas;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime una palabra");
		String frase = entrada.nextLine();
		
		String[] primeraPalabra = frase.split(" ");
		
		System.out.println("La primera palabra de la frase es: " + primeraPalabra[0]);

	}

}
