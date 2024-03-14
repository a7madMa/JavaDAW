package cadenas;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
	
		
		System.out.println("Dime una palabra y te diré cuantos caracteres tiene.");
		
		System.out.println("Palabra? ");
		 String palabra = entrada.nextLine();
			int longitud = palabra.length();
		
		System.out.println("Este refrán tiene " + longitud + " letras (contando espacios).");
		
	}
	

}
