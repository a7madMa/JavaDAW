package ejericicos;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("#### DATOS DE PACIENTES ####");

		String pacientes[][] = new String[3][3];
		boolean esJubilado = false;
		int jubilado = 0;
		int paciente = 0;

		System.out.println("\nIntroduce el nombre y le edad de hasta 10 pacientes:");

		for (int fila = 0; fila < pacientes.length; fila++) {

			System.out.print("Nombre (máximo 20 caracteres): ");
			pacientes[fila][0] = entrada.nextLine();
			System.out.print("Edad: ");
			pacientes[fila][1] = entrada.nextLine();

			if (Double.parseDouble(pacientes[fila][1]) > 65) {
				esJubilado = true;
				jubilado++;
			}

		}
		double media = 0;

		for (int fila = 0; fila < pacientes.length; fila++) {
			media = media + Double.parseDouble(pacientes[fila][1]);

		}
		media = media / pacientes.length;
		media = Math.round(media * 100.0) / 100.0;

		System.out.println("\n#### LISTADO DE PACIENTES ####");
		System.out.printf("\n%-20s %3s\n", "Nombre", "Edad");
		System.out.printf("%-20s %4s\n", "====================", "====");

		for (int fila = 0; fila < pacientes.length; fila++) {
			System.out.printf("%-20s %4.5s\n", pacientes[fila][0], pacientes[fila][1]);
			paciente++;
		}
		System.out.println("\n#### RESULTADO DEL ANÁLISIS ####");
		System.out.println("\nSe han introducido datos de " + paciente + " pacientes.");
		System.out.println("La media de edad de los pacientes es " + media + " años.");
		System.out.println("Hay " + jubilado + " pacientes jubilados.");

	}

}
