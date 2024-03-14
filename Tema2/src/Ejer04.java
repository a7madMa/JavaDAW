
import java.util.Scanner;

public class Ejer04 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("*** TIENDA ***");
        System.out.println("Dime el precio del producto?");

        double precio = entrada.nextDouble();

        double factura =0;


        if (precio > 80) {
            precio = precio - precio * 10 / 100;
            System.out.println("Se ha aplicado un descuento del 10%");
        }
        System.out.println("El precio final es" + precio + "€");

        if(precio < 5) {
            factura = precio + 2;
            System.out.println("Se han sumado 2€ por gastos de gestión");
            System.out.println("El precio de la factura és de:" + factura + "€");
        }
        System.out.println("FIN DE LA COMPRA");
    }
}
