package ejemplos;

//Actividad: Escribe una tabla con edades y alturas de 
//un grupo de personas
//		Edad	Altura
//		12		1,50
//La tabla se llamará datos (al menos 4 filas).
//Múestrala en forma de tabla.

public class Ejemplo12{

	public static void main(String[] args) {

		double datos[][] = { { 12, 1.50 }, { 21, 1.82 }, { 42, 0.3 }, { 32, 1.00 } };

		System.out.println("\nEdad\tAltura");

		for (int fila = 0; fila < datos.length; fila++) {

			// Mostramos la fila indicada por la variable fila.
			
			
			for (int col = 0; col < datos[0].length; col++) {
				
				// Para cada fila mostramos sus columnas.
				
				System.out.print(datos[fila][col] + "\t");
			}
			System.out.println();

		}

	}

}