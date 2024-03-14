package practicaExamenTema3;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarArray {

	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		// Para ordenar un array debemos crear las variables: posMin, posMax, aux
		int posMin;
		int aux;
		int numeros[] = new int[5];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime 5 numeros y te los ordeno");
			numeros[i] = entrada.nextInt();
		}
		
		// Creamos un for para ordenar con el método de selección.
		
		for (int i = 0; i < numeros.length-1; i++) {
			posMin = i;
			
			for (int j = i+1; j < numeros.length; j++) {
				
				if(numeros[j] < numeros[posMin]) {
					posMin = j;
				}
				
				
			
				
				
				
			}
			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;
			System.out.println(Arrays.toString(numeros));
			
		}
	
		
		
		

	}

}
