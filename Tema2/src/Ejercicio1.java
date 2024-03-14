
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("***PORTERO DE DISCOTECA***");
		
		System.out.println("¿Cuantos años tienes?");
		int edad = entrada.nextInt();
		
		if(edad >= 18) {
			System.out.println("puedes pasar");
			System.out.println("Gracias por venir");
		}

		System.out.println("Fin del programa");
	
	}
   
}
