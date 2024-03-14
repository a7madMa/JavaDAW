package practica1;

import java.util.Scanner;

public class ejer04contin {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int producto = 0;
		double dinero = 1;
		final double Coca = 1.30;
		final double Aquarius = 1.50;
		final double Patatillas = 2;
		final double Agua = 1;

		System.out.println(" ===== MÁQUINA EXPENDEDORA =====");
		System.out.println("\nProductos a la venta");
		System.out.println("===========================================");
		System.out.println("   (1) Lata 33 cl Coca-Cola      1,30 €");
		System.out.println("   (2) Lata 33 cl Aquarius       1,50 €");
		System.out.println("   (3) Patatillas onduladas      2 €");
		System.out.println("   (4) Botella 50 cl agua        1 €");

		System.out.print("¿Qué quiere comprar?");
		producto = entrada.nextInt();

		while (producto <= 0 || producto > 4) {

			System.out.println("El producto indicado no existe.");

			System.out.print("\n¿Qué quiere comprar?");
			producto = entrada.nextInt();
		}

		do {

			System.out.print("\n¿Cuánto dinero quiere introducir?");
			dinero = entrada.nextDouble();

			if (dinero <= 0) {
				System.out.println("Debe introducir una cantidad válida (mayor o igual a cero).");

			}

		} while (dinero <= 0);

		// EL SWITCH ESTA CORRECTO.
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