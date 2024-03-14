package practicaExamenTema3;

import java.util.Scanner;

public class Ejer19 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		String nominas[][] = new String[4][3];
		int salario = 0;

		for (int fila = 0; fila < nominas.length; fila++) {

			System.out.print("Nombre: ");
			nominas[fila][0] = entrada.nextLine();

			System.out.print("Apellidos: ");
			nominas[fila][1] = entrada.nextLine();

			System.out.print("Sueldo: ");
			nominas[fila][2] = entrada.nextLine();

		}

		System.out.printf("%-10s %-10s %4s", "Nombre", "Apellido", "Sueldo");
		System.out.printf("\n%-10s %-10s %-4s\n", "=========", "==========", "======");

		for (int fila = 0; fila < nominas.length; fila++) {
			System.out.printf("\n%-10s %-10s %4s\n", nominas[fila][0], nominas[fila][1], nominas[fila][2] + "$");

		}
		for (int fila = 0; fila < nominas.length; fila++) {
			salario += Integer.parseInt(nominas[fila][2]);
			
			
		}
		System.out.println("El salatio total que paga la empresa es de " + salario + " $");

	}

}
