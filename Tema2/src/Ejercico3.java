
import java.util.Scanner;
public class Ejercico3 {
//programa que pregunta la temperatura de una camara frigorífica
	//y da instrucciones
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("*** CÁMARA FRIGORÍFICA***");
		System.out.println("¿Que temperatura marca el cronómetro?");
		
		float temp = entrada.nextFloat();
		
		if(temp >= -20) {
			System.out.println("Encender cámara");
		
		}else {
			System.out.println("Parar cámara");
		}
		
	}
   
}