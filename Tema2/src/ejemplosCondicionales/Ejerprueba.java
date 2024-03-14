package ejemplosCondicionales;

import java.util.Scanner;

//Programa que pregunta la clasificación de un corredor y nos muestra
// que premio le corresponde.
public class Ejerprueba {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Clasificación del jugador (1 / 2 / 3): ");
		int clas = entrada.nextInt();

		switch (clas) {

		case 1:
			System.out.println("Medalla de Oro.");
			break;
		case 2:
			System.out.println("Medalla de Plata.");
			break;
		case 3:
			System.out.println("Medalla de Bronce.");
		default:
			System.out.println("Lo siento, no tienes medalla.");
		}

//		if (clas == 1) {
//			System.out.println("Medalla de Oro");
//		} else if (clas == 2) {
//			System.out.println("Medalla de Plata");
//		} else if (clas == 3) {
//
//			System.out.println("Medalla de Bronce");
//
//		}else {
//			System.out.println("NO tienes premio");
//		}
	}

}
