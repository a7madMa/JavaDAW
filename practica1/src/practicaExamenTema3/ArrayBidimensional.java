package practicaExamenTema3;

//Actividad: Escribe una tabla con edades y alturas de 
//un grupo de personas
//		Edad	Altura
//		12		1,50
//La tabla se llamará datos (al menos 4 filas).
//Múestrala en forma de tabla.

public class ArrayBidimensional {

	public static void main(String[] args) {

		double datos[][] = { { 12, 1.50 }, { 21, 1.82 }, { 42, 0.3 }, { 32, 1.00 } };
		
		System.out.println("\nEdades\tAltura");
		
		for (int fila = 0; fila < datos.length; fila++) {
			
			for (int columna = 0; columna < datos[0].length; columna++) {
				
				System.out.print(datos[fila][columna] + "\t");
				
			}
			System.out.println();
			
		}

	}

}
