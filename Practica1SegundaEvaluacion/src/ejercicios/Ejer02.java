package ejercicios;

public class Ejer02 {

	public static void main(String[] args) {

		// Definimos el array con los datos
		String produccion[][] = { 
				{"Navel Lane Late", "8.5" },
				{"Navelina", "4" }, 
				{"Washington Navel", "6.7" },
				{"Thomson", "4.9" }, 
				{"Newhall", "10.1" }, 
				{"Navelate", "6.3" } 
				,{"Ricalate","5.5"}
				};
		
				int posMin = 0;
				int posMax = 0;
				double promedio = 0;

				// Mostramos la información de las naranjas, usando el printf,
				// Para que las tablas queden colocadas.
				System.out.println("Información sobre la producción de naranjas, en kg, de cada variedad de naranja:");
				System.out.printf("\n%-20s %5s\n", "Variedad", "Peso");
				System.out.printf("%-20s %4s\n", "==================", "=====");

				
				for (int fila = 0; fila < produccion.length; fila++) {
					System.out.printf("%-20s %-3s\n", produccion[fila][0], produccion[fila][1]);

				}

				System.out.println("\nAnálisis de producción:");
				// Usamos un for para pasar los datos del peso de un String a 
				// un Double empleando el método .parseDouble.
				
				for (int fila = 0; fila < produccion.length; fila++) {

					if (Double.parseDouble(produccion[fila][1]) < Double.parseDouble(produccion[posMin][1])) {

						posMin = fila;
					} else if (Double.parseDouble(produccion[fila][1]) > Double.parseDouble(produccion[posMax][1])) {

						posMax = fila;
					}

				}

				for (int fila = 0; fila < produccion.length; fila++) {
					promedio = promedio + Double.parseDouble(produccion[fila][1]);
				}
				// Calculamos el promedio
				promedio = promedio / produccion.length;
				// Redondea a dos decimales
				promedio = Math.round(promedio * 100.0) / 100.0;

				// Mostramos los resultados.
				System.out.println("\n * Variedad que produce más: " + produccion[posMax][0] + " (" + produccion[posMax][1] + " kg).");
				System.out.println(" * Variedad que produce menos: " + produccion[posMin][0] + " (" + produccion[posMin][1] + " kg).");
				System.out.println(" * Promedio producido por un naranjo: " + promedio + " kg.");

			}

		}
