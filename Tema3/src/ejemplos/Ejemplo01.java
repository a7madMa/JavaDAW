package ejemplos;

public class Ejemplo01 {

	public static void main(String[] args) {

		// float precios[] , tambien en valido
		// Creamos un Array con 10 posiciones, de tipo float.
		float[] precios = new float[10];
		// Damos algunos valores al array.

		precios[0] = 10;
		precios[1] = 65;
		precios[2] = 12;
		precios[3] = 75;
		precios[4] = 90;
		precios[5] = 43;
		precios[6] = 12;
		precios[7] = 50;
		precios[8] = 52;

		System.out.println("Posición 0: " + precios[0]);
		System.out.println("Posición 1: " + precios[1]);
		System.out.println("Posición 2: " + precios[2]);

		// Al crear un array sus posiciones se inicializan a valores
		// Por defecto (0 si es un array numérico, false si es un array
		// booleano y null si es un array de objetos).
		System.out.println("Posición 9: " + precios[9]);

	}

}
