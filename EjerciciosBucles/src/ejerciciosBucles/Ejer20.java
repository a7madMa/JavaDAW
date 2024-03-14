package ejerciciosBucles;

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

	}

}
