package hoja2;

public class Ejer07 {
	public static void main(String[] args) {
		int posMin = 0;
		int posMax = 0;

		String dia[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		int espec[] = { 2000000, 2500000, 3100000, 3000000, 3000000, 1800000, 2050000 };

		for (int i = 0; i < espec.length && i < dia.length; i++) {

			if (espec[i] < espec[posMin]) {
				posMin = i;

			}
			if (espec[i] > espec[posMax]) {
				posMax = i;

			}
		}
		System.out.println("El mínimo número de audéncia  ha sido de " + espec[posMin]+"y ha sido el dia " );
		System.out.println("El máximo número de audéncia  ha sido de " + espec[posMax]);

	}
}
