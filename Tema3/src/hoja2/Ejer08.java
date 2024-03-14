package hoja2;

public class Ejer08 {

	public static void main(String[] args) {

		int humedad[] = { 45, 40, 40, 40, 37, 35, 39, 39, 45, 50, 55, 60, 65, 70, 70, 75, 75, 72, 65, 60, 55, 50, 50,
				45 };
		int posMin = 0;
		int posMax = 0;

		for (int i = 0; i < humedad.length; i++) {

			if (humedad[i] < humedad[posMin]) {
				posMin = i;

			} else if (humedad[i] > humedad[posMax]) {

				posMax = i;
			}

		}
		
		

		System.out.println("La humedad mínima ha sido de " + humedad[posMin] +" %"+ " a las " + posMin + " horas");
		System.out.println("La humedad máxima ha sido de " + humedad[posMax] + " %"+" a las " + posMax + " horas");
	}

}
