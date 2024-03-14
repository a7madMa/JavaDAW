package ejemplosCondicionales;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("*** TIENDA ***");
		System.out.println("¿Dime el precio del prodcuto?");

		double precio = entrada.nextDouble();
		double compra = entrada.nextDouble();
		double factura = entrada.nextDouble();

		if (precio > 80) {

			precio = precio - precio * 10 / 100;
			System.out.println("Se ha aplicado un descuento del 10%");
		}

		if (compra < 5) {
			
			factura = factura + 2;
			

			System.out.println("Se han sumado 2€ por gastos de gestión");
		}

		System.out.println("EL precio final és:" + precio + "€");
		System.out.println("FIN DEL PROGRAMA");

	}

}
