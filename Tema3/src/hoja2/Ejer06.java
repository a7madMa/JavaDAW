package hoja2;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double votos[] = new double[6];
		int posMin = 0;
		int posMax = 0;
		
		for (int i = 0; i < votos.length; i++) {
			System.out.println("partido politico: " + i);
			votos[i] = entrada.nextDouble();
			if (votos[i] < votos[posMin]) {
				posMin = i;
			} else if (votos[i] > votos[posMax]) {
				posMax = i;
			}
		}
		System.out.println("El menor numero de votos ha sido " + votos[posMin] + "\ny esta en la posición " + posMin);
		System.out.println("El menor numero de votos hassido " + votos[posMax] + "\ny esta en la posición " + posMax);
	}
}
