package ejemplosCondicionales;

import java.util.Scanner;

public class Ejer19alter {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el año: ");
		
		int anyo = entrada.nextInt();
		
		System.out.println("Dime el numero de mes y te dire el nmero de dias que tiene: ");
		int mes = entrada.nextInt();

		switch (anyo) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 dias");
			break;
			
		case 2:
			if(anyo % 4 == 0 && anyo % 100 != 0 
				|| anyo % 400 == 0) {
				System.out.println("29 días");
				
			}else {
				System.out.println("28 días");
			}
			
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(" 30 dias");
			break;

		default:
		
		}
		entrada.close();

	}

}
