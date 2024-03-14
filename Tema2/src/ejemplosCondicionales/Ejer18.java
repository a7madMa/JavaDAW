package ejemplosCondicionales;

import java.util.Scanner;

public class Ejer18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un numero de mes del 1 al 12: ");
		int mes = entrada.nextInt();

		switch (mes) {

		case 1:
			System.out.println("Enero, 31 dias");
			break;
		case 2:
			System.out.println("Febrero, 28 dias");
			break;
		case 3:
			System.out.println("Marzo, 31 dias");
		case 4:
			System.out.println("Abril 30 dias");
			break;
		case 5:
			System.out.println("Mayo, 31 dias");
			break;
		case 6:
			System.out.println("Junio, 30 dias");
			break;
		case 7:
			System.out.println("Julio, 31 dias");
			break;
		case 8:
			System.out.println("Agosto, 31 dias");
			break;
		case 9:
			System.out.println("Septiembre, 30 dias");
			break;
		case 10:
			System.out.println("Octubre, 31 dias");
		case 11:
			System.out.println("Noviembre, 30 dias");
			break;
		case 12:
			System.out.println("Diciembre, 31 dias");
			break;
		default:
			System.out.println("Lo siento, solo hay 12 meses.");
		}
	}

}
