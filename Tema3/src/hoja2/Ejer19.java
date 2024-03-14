package hoja2;

import java.util.Scanner;

/*19.- Crea un programa que vaya pidiendo por la terminal los apellidos, el nombre y el sueldo de
	cuatro empleados de una empresa, y guardándolo como filas en un array bidimensional llamado
	nominas. A continuación muestra los datos por la pantalla en forma de tabla y calcula el salario total
	que paga la empresa cada mes.
 */
public class Ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nominas[][] = new String[4][3];

		System.out.println("****EMPRESA****");

		for (int fila = 0; fila < nominas.length; fila++) {

			System.out.println("Dime el apellido");
			nominas[fila][0] = entrada.nextLine();

			System.out.println("Dime el nombre");
			nominas[fila][1] = entrada.nextLine();
			System.out.println("Dime el sueldo");
			nominas[fila][2] = entrada.nextLine();

			System.out.println("\nApellido Nombre Sueldo");

			for (int col = 0; col < nominas[0].length; col++) {

				System.out.print(nominas[fila][col] + "\t");

			}
			System.out.println();
		}

		
		// Buscamos el empleado con menor salario.
		
		int posMin = 0;
		for (int fila = 0; fila < nominas.length; fila++) {
			
			if(Double.parseDouble(nominas[fila][2] )<Double.parseDouble(nominas[posMin][2])) {
				posMin = fila;
			}
			
		}
		System.out.println(nominas[posMin][1] + " " + nominas[posMin][0] + " es el que menos cobra, apenas" + nominas[posMin][2] + " euros.");
	}
	

}
