package hoja2Bucles;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un numero entero y te diré la tabla de mutilplicar de ese número.");
		int num = entrada.nextInt();
		int i = 1;

		while (i <= 10) {

			System.out.println(num + "x" + i + "=" + (num * i));
			i++;
		}

	}

}
