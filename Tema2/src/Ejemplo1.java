//Programa que pregunta de qué provincia eres
// y te responde con un mensaje adecuado.
import java.util.Scanner;
public class Ejemplo1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿En que provincia naciste?");
		String provincia = entrada.nextLine();
		provincia = provincia.toUpperCase();
		switch (provincia) {

		case "ALICANTE":
			System.out.println("Eres alicantino");
			break;
		case "CASTELLÓN":
			System.out.println("Eres Castellonense.");
			break;
		case "VALENCIA":
			System.out.println("Eres Valenciano.");
		default:
			System.out.println("Lo siento, no eres de ningun lugar");
		}
		entrada.close();
	 }
	

}
