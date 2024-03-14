
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("***PORTERO DE DISCOTECA***");
		
		System.out.println("¿Cuantos años tienes?");
		int edad = entrada.nextInt();
		//si la edad del usuario es mayor o igual a 18, se le dirá que
		//puede pasar
		
		if(edad >= 18) {
			System.out.println("puedes pasar");
			System.out.println("Gracias por venir");
		}else {
			//si no se cumple la condición del if, le diremos
			//que no puede pasar.
			System.out.println("NO puedes pasar, al ser menor de edad");
		}
		//Esta instrucción siempre se ejecutará cuando no cumpla con la
		//edad minima

		System.out.println("Fin del programa");
	
	}
   
}
