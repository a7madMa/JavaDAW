package cadenas;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime una frase: ");
		String frase = entrada.nextLine();

		System.out.println("Dime una letras: ");
		String letra1 = entrada.nextLine();

		System.out.println("Dime otra letras: ");
		String letra2 = entrada.nextLine();

		String fraseNueva = frase.replace(letra1, letra2);

		System.out.println(fraseNueva);

	}

}
