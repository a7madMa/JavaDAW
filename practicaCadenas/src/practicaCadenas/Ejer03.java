package practicaCadenas;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime una palabra");
		String frase = entrada.nextLine();
		
		for (int i = frase.length() - 1; i >= 0; i--) {
			System.out.println(frase.charAt(i));
			
		}
	


	}

}
