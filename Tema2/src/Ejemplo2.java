
//Control de errores en la entrada del usuario.

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número y te diré su cuadrado:");
		// Al ejecutar hasNextFloat() el programa se para y lo que
		// Escriba el usuario se va al buffer de entrada.
		// Además, hasNextFloat() devuelve true o false diciéndonos si 
		// lo que ha escrito el usuario es un float o no lo es.
		if (entrada.hasNextFloat()) {
			
			// Con la siguiente instraucción el float que ha escrito el
			// Usuario se guarda en la variable num.
			float num = entrada.nextFloat();

			System.out.println("El cuadrado de " + num + " és: " + num * num);

		}else {
			System.out.println("No has escrito un número!");
		}

	}

}
