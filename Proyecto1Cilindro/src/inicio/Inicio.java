package inicio;

import java.util.Scanner;

import geometria.Cilindro;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Cilindro cilindro1 = new Cilindro();
		
		System.out.println("Escribe la altura del cilindro");
		cilindro1.setAltura(entrada.nextInt());
		
		System.out.println("Escribe el radio del cilindro");
		cilindro1.setRadio(entrada.nextInt());
		
		System.out.println("\nLos datos del cilindro són: " + cilindro1.toString());	
		System.out.println("\nEl área del cilindro es " + cilindro1.getArea());
		System.out.println("El área del cilindro es " +cilindro1.getVolumen());
		
		
	
		

	}

}
