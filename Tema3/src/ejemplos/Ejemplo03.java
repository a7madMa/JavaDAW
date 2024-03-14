package ejemplos;

public class Ejemplo03 {

	public static void main(String[] args) {

		// float precios[] , tambien en valido
		// Creamos un Array con 10 posiciones, de tipo float.
		float[] precios = new float[10];
		// Damos algunos valores al array.

		precios[0] = 10;
		precios[1] = 65;

		System.out.println("Longitud del array: " + precios.length);
		// Vamos a recorrer todo el array mediante un bucle.
		for (int i = 0; i < precios.length; i++) {

			System.out.println(precios[i]);
		}
	}

}
