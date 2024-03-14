package ejemplosCondicionales;
import java.util.Random;
import java.util.Scanner;
public class Ejer07 {

	public static void main(String[] args) {
	 
	Scanner entrada = new Scanner(System.in);
		
		System.out.println(" *** Juego de adivinar el número ***");
		System.out.println("Dime un número del 1 al 10");
		
	
		char cara =0;
		Random ran = new Random();
		
		int num= ran.nextInt();
		

		
		if (cara== '1' || cara == '2' || cara == '3' || cara == '4' || cara == '5'){
			
			System.out.println("The Randomly generated integer is : " + num); 
	      
		
		}
		
		
		
		entrada.close();
	}

}

