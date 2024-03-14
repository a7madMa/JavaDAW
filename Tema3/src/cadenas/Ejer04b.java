package cadenas;

import java.util.Scanner;

public class Ejer04b {
	
	// Variante en la que descartamos los espacios que pueda haber al 
	// Principio de la frase
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dima una frase y te la mostraré al revés");

		System.out.print("Frase: ");
		String frase = entrada.nextLine();
 
		boolean leyendoPalabra = false;

		for (int i = 0; i < frase.length(); i++) {

			// Detectamos el inicio de la palabra.
			if (frase.charAt(i) != ' ') {
				leyendoPalabra = true;
				System.out.print(frase.charAt(i));
			} else if (frase.charAt(i) == ' ' && leyendoPalabra == true) {
				break;
			}
			
		}

		entrada.close();

	}

}
