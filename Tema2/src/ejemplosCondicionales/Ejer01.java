package ejemplosCondicionales;
import java.util.Scanner;
public class Ejer01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("*** REACTOR  NUCLEAR ***");
		System.out.println("¿Dime la temperatura del reactor?");
		
		float temp = entrada.nextFloat();
		
		if(temp > 120) {
			System.out.println("TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED,INSENSATOS!");
								
		}
		System.out.println("Fin del programa");
		
	}

}
