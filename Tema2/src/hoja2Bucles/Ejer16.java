package hoja2Bucles;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime un número entre el 1 y el 10: ");
		
		
		int i = 1;
		
		int num;
		do {
			
			
			 num= (int) (10* Math.random() + 1);
			
			
		}while(num<= 10);
		System.out.println(num);
		i++;
		
		
		
	}

}
