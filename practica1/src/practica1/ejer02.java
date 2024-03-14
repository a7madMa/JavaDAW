package practica1;

import java.util.Scanner;

public class ejer02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int producto;
		int dinero = 1;

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

		System.out.print("¿Cuánto dinero quiere introducir?");
		dinero = entrada.nextInt();

	}

}
