package cadenas;

// Coger una cadena y poner la primera letra de cada palabra en mayúsculas
import java.util.Scanner;

public class Ejer18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String frase;

		System.out.println("Escribe una frase:");
		frase = entrada.nextLine();

		String separada[] = frase.split(" ");

		String Mayus = "";

		for (int i = 0; i < separada.length; i++) {

			Mayus = Mayus + separada[i].charAt(0);
		
		}
		frase.toUpperCase();
		Mayus = Mayus.toUpperCase();
		System.out.println(frase);
		

	}

}
