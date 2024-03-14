package cadenasEjemplos;

public class Ejemplo05 {

	public static void main(String[] args) {

		String frase = "Al que madruga dios le ayuda";

		System.out.println("Los caracteres desde el 3 hasta el 10 (ambos inclusive) son: " + frase.substring(3, 11));
		
		System.out.println("Los caracteres desde el 5 hasta el final son: " + frase.substring(5));
	}

}
