package practicaExamenTema3;

public class Ejer16Hoja2 {

	public static void main(String[] args) {
	
		String datos[][] = {
				{"Jose Luis Martinez","7"},
				{"Antonia Ruiz","9"},
				{"Marcos Ramirez","10"},
				{"Juana Herranz","4"},
				{"Alberto Lopez","7"}
				};
		
				double media = 0;
				int posMin = 0;
				int posMax = 0;

				System.out.printf("\n%-20s %4s", "Nombre", "Nota");
				System.out.printf("\n%-20s %4s\n", "==================", "=====");

				for (int fila = 0; fila < datos.length; fila++) {
					System.out.printf("%-20s %-4s\n", datos[fila][0], datos[fila][1]);

				}

				for (int fila = 0; fila < datos.length; fila++) {

					media = media + Double.parseDouble(datos[fila][1]);
					
					if(Double.parseDouble(datos[fila][1] ) < Double.parseDouble(datos[posMin][1])){
						posMin = fila;
						
					}else if(Double.parseDouble(datos[fila][1]) > Double.parseDouble(datos[posMax][1])){
						posMax = fila;
						
					}
						
						
				}
				media = media / datos.length;
				
				System.out.println("\nLa media del curso es " + media);
				System.out.println("\n" + datos[posMin][0] + " tiene la nota mas baja, un " + datos[posMin][1]);
				System.out.println("\n" +datos[posMax][0] + "tiene la nota mas alta, un " + datos[posMax][1]);
				
				

			}

}
