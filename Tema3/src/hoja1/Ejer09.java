package hoja1;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] test = { "", "a)", "b)", "c)", "d)" };

		System.out.println("Dime una pregunta de  tipo test: ");

		String[] letra = new String[5];

		for (int i = 0; i < test.length; i++) {
			
			System.out.println("Crea un tipo test.");
			
			test[i] = entrada.nextLine();
		}

		for (int i = 0; i < test.length; i++) {
			System.out.println(letra[i] + test[i]);

		}

	}

}
