package cadenas;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String frase;
		String palabrotas[] = { "sinvergüenza", "maleducado", "analfabeto", "bribón", "mendrugo","medio gitano"};

		System.out.print("Escribe una frase: ");
		frase = entrada.nextLine();

		for (int i = 0; i < palabrotas.length; i++) {

			if (!frase.equals(frase)) {
		
				
				

			} else {

				System.out.println("\nEsta frase contiene una palabrota");
				break;
						
			}
		}

		entrada.close();
	}

}
