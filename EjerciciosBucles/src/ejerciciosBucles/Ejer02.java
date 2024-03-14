package ejerciciosBucles;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un carácter y lo escribiré 100 veces");
		int car = entrada.nextInt();
		int i = 1;
		System.out.println("repeticiones?");
		int repes = entrada.nextInt();

		while (i <= repes) {
			System.out.println("El carácter intoducido es:" + car + "--" + i);
			i++;

		}
		System.out.println("Viva el nano");

	}

}
