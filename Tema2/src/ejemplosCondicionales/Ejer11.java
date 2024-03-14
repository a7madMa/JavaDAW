package ejemplosCondicionales;
import java.util.Scanner;
public class Ejer11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("¿Dime el precio del producto y el numero de unidades?");
		double precio = entrada.nextDouble();
		double unidades = entrada.nextDouble();
		precio = precio * unidades;
		System.out.println("el precio es:" + precio);
		
		if(precio  > 100) {
			System.out.println("Lo siento no tienes derecho a un descuento!");
		}else if( precio < 200){
			System.out.println("Se le aplicará un descuento del 15%");
			precio = precio - precio * 15 / 100;
		}else if(precio > 200){
			precio = precio - precio * 10 / 100;
			System.out.println("");
			
			
		}
		
		
		
		

	}

}
