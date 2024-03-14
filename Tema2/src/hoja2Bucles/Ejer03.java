package hoja2Bucles;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		
		System.out.println("Dime un número entero: ");
		int numero = entrada.nextInt();
		
		while (numero < 1 || numero >= 10) {
		
		System.out.println("Tienes que decir un numero entre el 1 y 10. Vuelve a probar");
		numero = entrada.nextInt();
		}
		System.out.println("Tu número es el " + numero);
	}

}
