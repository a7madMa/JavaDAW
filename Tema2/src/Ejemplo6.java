import java.util.Scanner;

public class Ejemplo6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Dada una compra, si supera los 100€ tendrá un descuento
		// del 10%, si no, lo tendrá del 5%

		System.out.println("Dime el precio de la compra: ");

		double num = entrada.nextDouble();
		int descuento;
//		if (num > 100) {
//			descuento = 10;
//
//		} else {
//			descuento = 5;
//
//		}
		
		
		
		descuento = (num > 100) ? 10 : 5;
		double precioFinal = num - num * descuento / 100;

		System.out.println("Disfruta usted del " + descuento+ "% de descuento");
		
		System.out.println("A pagar: " + precioFinal + "euros");
	}

}
