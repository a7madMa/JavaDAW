package ejemplosBucles;

import java.util.Scanner;

public class EjemploDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;

		do {
			System.out.println("Ingrese un numero: ");
			numero = entrada.nextInt();
		} while (numero <= 500);

	}

}
