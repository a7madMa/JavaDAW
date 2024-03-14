package ejericicos;

import java.util.Arrays;

public class Ejer02 {

	public static void main(String[] args) {

		String produccion[][] = { 
				{"Navel Lane Late", "8.5" },
				{"Navelina", "4" }, 
				{"Washington Navel", "6.7" },
				{"Thomson", "4.9" }, 
				{"Newhall", "10.1" }, 
				{"Navelate", "6.3" } 
				,{"Ricalate","5.5"}
				};
		
				int posMin;
				String aux[] = new String[2];

				for (int i = 0; i < produccion.length - 1; i++) {
					// La variable i indica a partir de qué posición el array
					// aún está desordenado.

					// En cada pasada del bucle, se buscará el minimo
					// desde i hasta el final.

					posMin = i;

					for (int j = i + 1; j < produccion.length; j++) {
						if (Double.parseDouble(produccion[j][1]) < Double.parseDouble(produccion[posMin][1])) {
							posMin = j;
						}
					}

					// Intercambiar las posiciones i y posMin.
					aux = produccion[posMin];
					produccion[posMin] = produccion[i];
					produccion[i] = aux;
				}

				System.out.println("Información sobre la producción de naranjas, en kg, de menor a mayor producción:");

				System.out.printf("\n%-20s %5s\n", "Variedad", "Peso");
				System.out.printf("%-20s %4s\n", "==================", "=====");

				for (int fila = 0; fila < produccion.length; fila++) {
					System.out.printf("%-20s %-3s\n", produccion[fila][0], produccion[fila][1]);

				}

			}

		}
