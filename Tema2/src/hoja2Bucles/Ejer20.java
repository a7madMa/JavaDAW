package hoja2Bucles;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Te voy a mostrar las diez primeras potencias del número 2");

		for (int i = 1; i <= 10; i += 1) {
			double potencia = Math.pow(2, i);

			int varia = (int) potencia;

			System.out.println(varia);

		}
		
		
		//es mejor no decalrar una variable dentro del bucle... para que no se declaren cada vez que pasa el bucle.
		// la declaramos fuera y la usamos en el bucle.

		
		
		/*Ejer20Alter:
		 * 
		 * int potencia = 2;
		 * for (int i = 1; i <=10; i++){
		 * 
		 * 
		 * System.out.println("Te voy a mostrar las diez primeras potencias del número 2");
		 * 
		 * potencia = potencia *2;
		 * }
		*/
	}

}
