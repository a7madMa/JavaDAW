package cadenasEjemplos;

public class Ejemplo04 {

	public static void main(String[] args) {
		
		String frase = "Si tú crees que puedes, puedes. Si tú crees que no puedes, no puedes. Tanto si piensas una cosa como la otra, estás en lo"
				+ "cierto (Henry Ford).";
		
				System.out.println("La palabra crees aparece en la posición " +
				frase.indexOf("crees"));
				System.out.println("La palabra luz aparece en la posición " +
				frase.indexOf("luz"));
				System.out.println("La palabra crees aparece por última vez en la posición " + frase.lastIndexOf("crees"));
				
				// Podemos pasarle a indexof() un segundo parámetro que indique
				// desde qué posición tiene que empezar a buscar.
				
				System.out.println("La palabra crees, a partir de la posición 12" + " vuelve a aparecer en la posición " + frase.indexOf("crees",12));

	}

}
