package practica1;

import java.util.Scanner;

public class ejer04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int producto = 0;
		double dinero = 1;
		final double Coca = 1.30;
		final double Aquarius = 1.50;
		final double Patatillas = 2;
		final double Agua = 1;

		// Presentación del programa.

		System.out.println(" ===== MÁQUINA EXPENDEDORA =====");
		System.out.print(" Ahmad Mawasli Habbl");
		System.out.println("\nProductos a la venta");
		System.out.println("===========================================");
		System.out.println("   (1) Lata 33 cl Coca-Cola      1,30 €");
		System.out.println("   (2) Lata 33 cl Aquarius       1,50 €");
		System.out.println("   (3) Patatillas onduladas      2 €");
		System.out.println("   (4) Botella 50 cl agua        1 €");

		System.out.print("¿Qué quiere comprar?");
		producto = entrada.nextInt();

		// Si el usuario escribe una opción no valida (que el número no este
		// entre 1 y 4) se le repetirá la pregunta hasta que escriba un número válido
		while (producto <= 0 || producto > 4) {

			System.out.println("El producto indicado no existe.");

			System.out.print("\n¿Qué quiere comprar?");
			producto = entrada.nextInt();
		}

		// Si el usuario introduce una cantidad de dinero negativa o 0, le volverá
		// a pregunta hasta que introduzca una cantidad válida.
		do {

			System.out.print("\n¿Cuánto dinero quiere introducir?");
			dinero = entrada.nextDouble();

			if (dinero <= 0) {
				System.out.println("Debe introducir una cantidad válida (mayor o igual a cero).");

			}

		} while (dinero <= 0);

		// En este switch, encontramos los diferentes productos con sus respectivos
		// precios,
		// Si el usuario introduce una cantidad superior al precio del producto, se le
		// dará el ç
		// Producto junto al cambio.
		// Si el usuario introduce un valor inferior al precio, le dirá que le falta "x"
		// cantidad de dinero.
		switch (producto) {
		case 1:
			if (dinero < Coca) {
				System.out.println("Le faltan " + (Coca - dinero));

			} else {
				System.out.println("Tome su Coca-Cola.");
				System.out.println("Su cambio: " + (dinero = dinero - Coca) + " €");
			}
			break;
		case 2:
			if (dinero < Aquarius) {
				System.out.println("Le faltan " + (Aquarius - dinero));

			} else {
				System.out.println("Tome su Aquarius.");
				System.out.println("Su cambio: " + (dinero = dinero - Aquarius) + " €");
			}
			break;
		case 3:
			if (dinero < Patatillas) {
				System.out.println("Le faltan " + (Patatillas - dinero));

			} else {
				System.out.println("Tome sus Patatillas onduladas.");
				System.out.println("Su cambio: " + (dinero = dinero - Patatillas) + " €");
			}
			break;
		default:
			if (dinero < Agua) {
				System.out.println("Le faltan " + (Agua - dinero));

			} else {
				System.out.println("Tome su Agua.");
				System.out.println("Su cambio: " + (dinero - 1) + " €");
			}
		}
		System.out.println("¡Vuelva Pronto!");
	}
}