package ejemplosCondicionales;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("*** CALCULADORA ***");
		
		System.out.println("Primer Operando: ");
		float num = entrada.nextFloat();
		
		System.out.println("Segundo Operando: ");	
		float num1 = entrada.nextFloat();

		System.out.println("Operación");
		System.out.println("1: Suma");
		System.out.println("2: Resta");
		System.out.println("3: Multiplicación");
		System.out.println("4: Divisón");
	
		int operacion = entrada.nextInt();
		
		switch(operacion) {
			
			case 1:
				System.out.println(num + "+" + num1 + " = " +(num + num1 ));
				break;
			case 2:
				System.out.println(num + "+" + num1 + " = " +(num - num1 ));
				break;
			case 3:
				System.out.println(num + "+" + num1 + " = " +(num * num1 ));
				break;
			case 4:
				System.out.println(num + "+" + num1 + " = " +(num / num1 ));
				default:
					System.out.println("*** Gracias por usar la Calculadora");
			
				
		}
		entrada.close();
	}

}
