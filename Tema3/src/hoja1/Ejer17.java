package hoja1;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double productos[] = new double[10];
		double suma = 0;
		int mayoresDiez = 0;
		for (int i = 0; i < productos.length; i++) {

			System.out.print("Dime el precio del Producto" + " " + (i + 1) + ": ");
			productos[i] = entrada.nextDouble();

			suma = suma + productos[i];

			if (productos[i] > 10) {
				mayoresDiez++;

			}

		}
		System.out.println("El prcio a pagar es de:  " + suma + "euros.");
		System.out.println("Hay " + mayoresDiez +" Productos de mas de 10 euros. ");

	}

}
