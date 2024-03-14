package cadenas;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dima una frase y te la mostraré al revés");

		System.out.println("Frase: ");
		String frase = entrada.nextLine();

		for (int i = frase.length() -1; i>= 0 ;i--) {
			System.out.print(frase.charAt(i));
			

		}
		
		
		
		
		

	}

}
