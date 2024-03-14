package practicaCadenas;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime una palabra");
		String palabra = entrada.nextLine();
		
	
		int longitud = palabra.length();
		System.out.println("La palabra introducida tiene " + longitud + " Letras");

	}

}
