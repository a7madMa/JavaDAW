package hoja3;

public class Ejer02 {

	public static void main(String[] args) {

		int posMin = 0;
		int posMax = 0;
		double cotizaciones[] = { 47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 47.9, 48.05, 48.7 };

		for (int i = 0; i < cotizaciones.length; i++) {

			if (cotizaciones[i] < cotizaciones[posMin]) {

				posMin = i;
			} else if (cotizaciones[i] > cotizaciones[posMax]) {
				posMax = i;

			}
			
			

		}
		System.out.println("El minimo numero de acciones ha sido de " + cotizaciones[posMin]);
		System.out.println("El máximo numero de acciones ha sido de " + cotizaciones[posMax]);

	}

}
