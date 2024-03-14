package ejercicios;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("CALCULO MENTAL");
		int resultado;
		int numA1 = (int) (Math.random() * 100 + 1);
		int numA2 = (int) (Math.random() * 100 + 1);
	
		while (true) {
			System.out.println("**********************");
			System.out.println("Primer número: " + numA1);
			System.out.println("segundo número: " + numA2);
			System.out.println("Pregunta: " + numA1 + " + " + numA2);
			System.out.println("**********************");

			System.out.print("Indica el resultado de la suma: ");
			resultado = entrada.nextInt();
		
			{

			}

			if (resultado == (numA1 + numA2)) {

				System.out.println("\nHas acertado!");
				continue;
			} else {

				System.out.println("Has Fallado tonto!");
			}

		}

	}
}
