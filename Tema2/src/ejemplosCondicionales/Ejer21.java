package ejemplosCondicionales;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("*** Saludo ***");

		System.out.println("Selecciona el idioma: ");

		System.out.println("Operación");
		System.out.println("1: Francés");
		System.out.println("2: Inglés");
		System.out.println("3: Alemán");
		System.out.println("4: Italiano");

		int idioma = entrada.nextInt();

		switch (idioma) {

		case 1:
			System.out.println("Bonjour");
			break;
		case 2:
			System.out.println("Good Morning");
			break;
		case 3:
			System.out.println("Guten Morgen");
			break;
		case 4:
			System.out.println("Buongiorno");

		default:
			System.out.println("Buenos Días");

		}
		entrada.close();

	}

}
