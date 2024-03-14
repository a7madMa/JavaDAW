package practicaCadenas;

public class AccederCaracteresCadena {

	public static void main(String[] args) {

		String frase = "Mi carro me lo robaron";
		System.out.println(frase.charAt(3));

		// Mostrar todos los caracteres de una cadena
		String palabra = "Espacial";
		for (int i = 0; i < palabra.length(); i++) {
			System.out.println("\t" +palabra.charAt(i));
		}

	}

}
