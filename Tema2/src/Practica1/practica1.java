package Practica1;

import java.util.Scanner;

public class practica1 {

	// 1.- Escribe un programa que lea desde teclado los tiempos (en segundos) que
	// han hecho los ocho jugadores de una carrera y devuelva la suma de estos
	// tiempos y el tiempo medio que han hecho. Usa un bucle for.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("**** TIEMPOS DE CARRERA ****");

		double tiempo;
		double suma = 0;
		for (int i = 1; i <= 8; i++) {
			System.out.println("Dime el tiempo del jugador " + i + ": ");
			tiempo = entrada.nextDouble();
			suma = suma + tiempo;

		}
		System.out.println("La suma de los tiempos és:" + suma);
		suma = suma / 8;
		System.out.println("La media de tiempo ha sido: " + suma);

	}

}
