package ejemplosCondicionales;

import java.util.Scanner;

public class Ejer26 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el dia de semana que deseas: ");
		String dia = entrada.nextLine();
		
		String hora;

		hora = dia.equals("entre semana") ? "20:00" : "14:00";
		System.out.println("La hora de cierre es a las " + hora + "h.");
		
		entrada.close();
		
		

		
	}

}
