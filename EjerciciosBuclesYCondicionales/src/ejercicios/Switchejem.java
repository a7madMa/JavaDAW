package ejercicios;

import java.util.Scanner;

public class Switchejem {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int randomNum = (int) (Math.random() * 10 + 1);

		System.out.println(randomNum);

		double po = Math.pow(2, 2);
		System.out.println("El numero elevado a 2 es: " + po);

		double precio;
		
		System.out.println("Dime el precio y te dire si tienes descuento: ");
		precio = entrada.nextDouble();

		if (precio >= 100) {
			
			System.out.println("Tienes un descuento del 50%" );
			System.out.print( precio = precio -(precio *0.5));
		}
	}

}
