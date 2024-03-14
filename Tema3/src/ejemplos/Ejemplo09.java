package ejemplos;

import java.util.Arrays;

//Intercambiar los valores de dos variables.

public class Ejemplo09 {

	public static void main(String[] args) {

		int a = 10;
		int b = 25;

		// b valga al y a valga 25

		int x = 0;
		x = a;
		a = b;
		b = x;

		System.out.println("a = " + a + "; b = " + b);

		// Lo mismo pero ahora intercambiamos dos posiciones de un array.

		String[] mascotas = { "Perro", "Gato", "Hamster", "Ardilla", "Conejo" };

		// Intercambiamos la posición 1 (Gato) por 3 (Ardilla).

		String aux2;
		
		aux2 = mascotas[1];
		mascotas[1] = mascotas[3];
		mascotas[3] = aux2;
		
		System.out.println(	Arrays.toString(mascotas));
		
		

	}

}
