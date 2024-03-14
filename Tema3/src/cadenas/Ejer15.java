package cadenas;

public class Ejer15 {

	public static void main(String[] args) {

		String frase = "Bien hecho es mejor que bien dicho";
		String[] palabras = frase.split(" ");

		System.out.println("\nFrase descompuesta en palabras sueltas:");
		
		for (int i = palabras.length-1; i >= 0; i--) {
			
			System.out.println(palabras[i]);
			
		}

	}

}
