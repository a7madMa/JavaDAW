package ejemplosCondicionales;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {

			System.out.println("*** TIENDA ***");
			System.out.println("Dime el precio del producto?");

			double precio = entrada.nextDouble();
			System.out.println("Dime las unidades compradas?");
			double unidades = entrada.nextDouble();

			double total = precio * unidades;

			if (precio > 75) {
				precio = precio - precio * 15 / 100;
				System.out.println("Se ha aplicado un descuento del 15%");
				System.out.println("El precio final es: " + precio + "€");
				total = precio * unidades;
				System.out.println("la factura es: " + total);
			} else {

				if (total < 75) {
					precio = precio - precio * 5 / 100;
				}

				System.out.println("El precio final es: " + precio + "€");

				System.out.println("FIN DE LA COMPRA");
			}
		}
	}
}