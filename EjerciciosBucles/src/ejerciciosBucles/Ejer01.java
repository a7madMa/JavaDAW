package ejerciciosBucles;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un carácter y lo escribiré 100 veces");

		int i = 1;
		System.out.println("Carácter?");
		int car = entrada.nextInt();

		while (i <= 100) {
			System.out.println("El carácter intoducido es:" + car + "--" + i);
			i++;

		}

	}

}
