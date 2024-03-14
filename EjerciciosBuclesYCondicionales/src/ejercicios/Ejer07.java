package ejercicios;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
//		for(int i =2; i<=200;i+=2) {
//			
//			System.out.println("Numeros pares del 2 al 200");
//			System.out.println(i);
//			
//		}
		int i = 2;
		while(i<=200) {
		
			System.out.println("Numeros pares del 2 al 200");
			System.out.println(i);
			i+=2;
			
			if(i %20 == 0) {
				
				System.out.println("Divisible por 20");
			}
		}
		
		
	}

}
