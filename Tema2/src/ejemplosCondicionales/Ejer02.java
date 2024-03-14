package ejemplosCondicionales;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("*** TIENDA ***");
		System.out.println("¿Dime el precio del prodcuto?");

		double precio = entrada.nextDouble();

		if (precio > 80) {

			precio = precio - precio * 10 / 100;
			System.out.println("Se ha aplicado un descuento del 10%");
		}
		System.out.println("EL precio final és:" + precio + "€");
		System.out.println("FIN DEL PROGRAMA");

	}

}
