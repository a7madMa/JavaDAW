package ejerciciosBucles;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Voy a escribir todos los números pares menores de 200");
		
		int i =0;
		
		while (i<200) {
			System.out.println(i);
			i = i + 2;
			
			
		}
		System.out.println("Fin del programa.");
	}

}
