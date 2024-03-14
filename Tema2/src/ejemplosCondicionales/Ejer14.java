package ejemplosCondicionales;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un numero de mes y te devolveré el nombre del mes: ");

		float nota = entrada.nextFloat();

		if ((nota >= 0) && (nota < 4)) {
			System.out.println("Rojo");

		} else if ((nota >= 4) && (nota < 5)) {
			System.out.println("Verde");

		} else if (nota >= 5 && nota <= 10) {
			System.out.println("Azul");
		}else {
			System.out.println("La nota no es valida");
		}

	}

}
